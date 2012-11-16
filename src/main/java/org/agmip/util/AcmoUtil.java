package org.agmip.util;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;

import org.agmip.util.MapUtil;
import org.agmip.ace.LookupCodes;
import org.agmip.ace.util.AcePathfinderUtil;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AcmoUtil {
    private static final Logger log = LoggerFactory.getLogger(AcmoUtil.class);
    /**
     * Do not instantiate
     */
    private AcmoUtil(){}


    /**
     * Write an ACMO file to the specified {@code outputPath} which includes 
     * all the experiments in the {@code datapackage}.
     *
     * @param outputPath the directory to write the ACMO_meta.dat file.
     * @param datapackage a standard AgMIP package
     *
     */
    public static void writeAcmo(String outputPath, HashMap<String, Object> datapackage, String destModel) {
        // First write the header
        ArrayList<HashMap<String, Object>> experiments = MapUtil.getRawPackageContents(datapackage, "experiments");
        for (HashMap<String, Object> experiment : experiments) {
            String acmoLine = extractAcmoData(experiment);
            // Then write the lines
        }
        // Then close the file.
    }

    /**
     * Extract a CSV-compatable ACMO line from a single experiment
     *
     * @param dataset a single AgMIP dataset
     *
     * @return ACMO compatible CSV line.
     */
    public static String extractAcmoData(HashMap<String, Object> dataset) {
        StringBuilder acmo = new StringBuilder();
        return "";
    }

    /**
     * Generates the standard ACMO header (with all the variables defined)
     *
     * @return ACMO header
     */
    public static String generateAcmoHeader() {
        return "!,Experiment ID,Overlay ID,\"Name of experiment, field test or survey\",4-character Climate ID code,Climate replication number for multiple realizations of weather data (ask Alex),Region ID,Regional stratum identification number,RAP ID,\"Management regimen ID, for multiple management regimens per RAP\",Names of institutions involved in collection of field or survey data,\"Crop rotation indicator (=1 to indicate that this is a continuous, multi-year simulation, =0 for single year simulations)\",Weather station ID,Soil ID,Site Latitude,Site Longitude,Crop type (common name) ,Crop model-specific cultivar ID,Cultivar name,Start of simulation date,Planting date,\"Observed harvested yield, dry weight\",Observed total above-ground biomass at harvest,Observed harvest date,Total number of irrigation events,Total amount of irrigation,Type of irrigation application,Total number of fertilizer applications,Total N applied,Total P applied,Total K applied,Manure and applied oganic matter,Total number of tillage applications,\"Tillage type (hand, animal or mechanized)\",\"Short name of crop model used for simulations (e.g., DSSAT, APSIM, Aquacrop, STICS, etc.)\",Model name and version number of the crop model used to generate simulated outputs,\"Simulated harvest yield, dry matter\",\"Simulated above-ground biomass at harvest, dry matter\",Simulated anthesis date,Simulated maturity date,Simulated harvest date,\"Simulated leaf area index, maximum\",Total precipitation from planting to harvest,\"Simulated evapotranspiration, planting to harvest\",Simulated N uptake during season,Simulated N leached up to harvest maturity,\n!,text,text,text,code,number,code,number,code,code,text,number,text,text,decimal degrees,decimal degrees,text,text,text,yyyy-mm-dd,yyyy-mm-dd,kg/ha,kg/ha,yyyy-mm-dd,number,mm,text,number,kg[N]/ha,kg[P]/ha,kg[K]/ha,kg/ha,#,text,text,text,kg/ha,kg/ha,yyyy-mm-dd,yyyy-mm-dd,yyyy-mm-dd,m2/m2,mm,mm,kg/ha,kg/ha,\n#,EID,Dome_name,EXNAME,CLIM_ID,CLIM_REP,REG_ID,STRATUM,RAP_ID,MAN_ID,INSTITUTION,ROTATION,WSTA_ID,SOIL_ID,FL_LAT,FL_LONG,CRID_text,CUL_ID,CUL_NAME,SDAT,PDATE,HWAH,CWAH,HDATE,IR#C,IR_TOT,IROP_text,FE_#,FEN_TOT,FEP_TOT,FEK_TOT,OM_TOT,TI_#,TIIMP_text,CROP_MODEL,MODEL_VER,HWAH_S,CWAH_S,ADAT_S,MDAT_S,HADAT_S,LAIX_S,PRCP_S,ETCP_S,NUCM_S,NLCM_S,";
    }

    protected static HashMap<String, String> extractEventData(HashMap<String, Object> dataset, String destModel) {
        destModel = destModel.toLowerCase();
        HashMap<String, String> results = new HashMap<String, String>();
        HashMap<String, Object> management = MapUtil.getRawBucket(dataset, "management");
        ArrayList<HashMap<String, String>> events = (ArrayList<HashMap<String, String>>) MapUtil.getObjectOr(management, "events", new ArrayList<HashMap<String, String>>());
        int irrCount = 0;
        int feCount = 0;
        int tilCount = 0;
        ArrayList<String> irop = new ArrayList<String>();
        ArrayList<String> timp = new ArrayList<String>();
        BigDecimal irrAmount, fenAmount, fekAmount, fepAmount, omAmount = null;
        try {
            irrAmount = new BigDecimal(0.0);
            fenAmount = new BigDecimal(0.0);
            fekAmount = new BigDecimal(0.0);
            fepAmount = new BigDecimal(0.0);
            omAmount  = new BigDecimal(0.0);
        } catch (Exception ex) {
            //Something really weird happened here. Like really really weird.
            log.error("Error converting 0.0 to a decimal, hard Java error");
            return new HashMap<String, String>();
        }
        
        // Process only the items needed by ACMO.

        for (HashMap<String, String> event : events) {
            // From planting, we need to extract PDATE, CUL_ID, CUL_NAME,
            // and CRID (as full text)

            String currentEvent = MapUtil.getValueOr(event, "event", "");
            log.debug("Current event: {}", event.toString());
            if (currentEvent.equals("planting")) {
                populateEventMap(results, event, "pdate", destModel);
                populateEventMap(results, event, "cul_name", destModel);

                if (event.containsKey(destModel+"_cul_id")) {
                    populateEventMap(results, event, destModel+"_cul_id", destModel);
                } else {
                    populateEventMap(results, event, "cul_id", destModel);
                }

                String crop = LookupCodes.lookupCode("crid", MapUtil.getValueOr(event, "crid", ""), "cn");
                results.put("crid", crop);
            } else if (currentEvent.equals("irrigation")) {
                irrCount++;
                String irval = MapUtil.getValueOr(event, "irval", "");
                String sIrOp = LookupCodes.lookupCode("irop", MapUtil.getValueOr(event, "irop", ""), "cn");
                try {
                    if (!irval.equals("")) {
                        irrAmount = irrAmount.add(new BigDecimal(irval));
                    }
                } catch (Exception ex) {
                    log.error("Error converting irrigation amount with value {}", irval);
                    continue;
                }
                if (! irop.contains(sIrOp)) {
                    irop.add(sIrOp);
                }
                
            } else if (currentEvent.equals("fertilizer")) {
                feCount++;
                String feamn = MapUtil.getValueOr(event, "feamn", "");
                String feamk = MapUtil.getValueOr(event, "feamk", "");
                String feamp = MapUtil.getValueOr(event, "feamp", "");
                log.debug("Feamn amount: {}", feamn);
                 try {
                     if (!feamn.equals("")) {
                        fenAmount = fenAmount.add(new BigDecimal(feamn));
                    }
                } catch (Exception ex) {
                    log.error("Error converting fertilizer [nitrogen] with value {}", feamn);
                    continue;
                }
                log.debug(fenAmount.toString());
            

                try {
                    if (!feamk.equals("")) {
                        fekAmount = fekAmount.add(new BigDecimal(feamk));
                    }
                } catch (Exception ex) {
                    log.error("Error converting fertilizer [potassium] with value {}", feamn);
                    continue;
                }

                try {
                    if (!feamp.equals("")) {
                        fepAmount = fepAmount.add(new BigDecimal(feamp));
                    }
                } catch (Exception ex) {
                    log.error("Error converting fertilizer [phosphorus] with value {}", feamn);
                    continue;
                }
            } else if (currentEvent.equals("organic_matter")) {
                String omamt = MapUtil.getValueOr(event, "omamt", "");
                if (! omamt.equals("")) {
                    try {
                        omAmount = omAmount.add(new BigDecimal(omamt));
                    } catch (Exception ex) {
                        log.error("Error converting organic matter amount with value {}", omamt);
                        continue;
                    }
                }
            } else if (currentEvent.equals("tillage")) {
                tilCount++;
                String tiimp = LookupCodes.lookupCode("tiimp", MapUtil.getValueOr(event, "tiimp", ""), "ca");
                if (! timp.contains(tiimp)) {
                    timp.add(tiimp);
                }
            }
        }
        // After processing all the events, consume the results of the counters.
        if (irrCount > 0) {
            results.put("ir_count", Integer.toString(irrCount));
            results.put("ir_tot", irrAmount.toString());
            results.put("irop", joinList(irop, "|"));
        }
        if (feCount > 0) {
            results.put("fe_count", Integer.toString(feCount));
            results.put("fen_tot", fenAmount.toString());
            results.put("fek_tot", fekAmount.toString());
            results.put("fep_tot", fepAmount.toString());
        }
        String om_tot = omAmount.toString();
        if (! om_tot.equals("0")) {
            results.put("omamt", om_tot);
        }
        if (tilCount > 0) {
            results.put("ti_count", Integer.toString(tilCount));
            results.put("tiimp", joinList(timp, "|"));
        }
        log.debug("extractEventData results: {}", results.toString());
        return results;
    }

    private static void populateEventMap(HashMap<String, String> eventMap, HashMap<String, String> sourceMap, String var, String destModel) {
        String tempVar = AcePathfinderUtil.setEventDateVar(var, true);
        String value = MapUtil.getValueOr(sourceMap, tempVar, "");
        if (var.startsWith(destModel)) {
            var = var.substring(destModel.length()+1);
        }
        eventMap.put(var, value);
    }

    private static String joinList(ArrayList<String> list, String joint) {
        StringBuilder joinedList = new StringBuilder();
        for (String item : list) {
            joinedList.append(item);
            joinedList.append(joint);
        }
        if (joinedList.length() > 0) 
            joinedList.setLength(joinedList.length()-1);
        return joinedList.toString();
    }
}
