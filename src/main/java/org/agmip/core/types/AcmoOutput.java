package org.agmip.core.types;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.TreeMap;

import com.google.common.hash.Hashing;
import com.google.common.hash.HashFunction;

import org.agmip.util.MapUtil;

public class AcmoOutput {
    private final HashFunction hashFunc = Hashing.sha1();

    public void writeFile(String outputDirectory, HashMap<String, Object> data) throws Exception {
        boolean success = new File(outputDirectory).mkdirs();
        File acmoFile = new File(outputDirectory+File.separator+"AMCO_meta.data");
        BufferedWriter writer;

        String header = "";
        if (! acmoFile.exists()) {
            // Already here, start appending
        } else {
            // Write out the standard headers
            header = "!,Experiment ID,Overlay ID,\"Name of experiment, field test or survey\",4-character Climate ID code,Climate replication number for multiple realizations of weather data (ask Alex),Region ID,Regional stratum identification number,RAP ID,\"Management regimen ID, for multiple management regimens per RAP\",Names of institutions involved in collection of field or survey data,\"Crop rotation indicator (=1 to indicate that this is a continuous, multi-year simulation, =0 for single year simulations)\",Weather station ID,Soil ID,Site Latitude,Site Longitude,Crop type (common name) ,Crop model-specific cultivar ID,Cultivar name,Start of simulation date,Planting date,\"Observed harvested yield, dry weight\",Observed total above-ground biomass at harvest,Observed harvest date,Total number of irrigation events,Total amount of irrigation,Type of irrigation application,Total number of fertilizer applications,Total N applied,Total P applied,Total K applied,Manure and applied oganic matter,Total number of tillage applications,\"Tillage type (hand, animal or mechanized)\",\"Short name of crop model used for simulations (e.g., DSSAT, APSIM, Aquacrop, STICS, etc.)\"\n!,text,text,text,code,number,code,number,code,code,text,number,text,text,decimal degrees,decimal degrees,text,text,text,yyyy-mm-dd,yyyy-mm-dd,kg/ha,kg/ha,yyyy-mm-dd,number,mm,text,number,kg[N]/ha,kg[P]/ha,kg[K]/ha,kg/ha,#,text,text\n#,EID,Overlay_ID,EXNAME,CLIM_ID,CLIM_REP,REG_ID,STRATUM,RAP_ID,MAN_ID,INSTITUTION,ROTATION,WSTA_ID,SOIL_ID,FL_LAT,FL_LONG,CRID_text,CUL_ID,CUL_NAME,SDAT,PDATE,HWAH,CWAH,HDATE,IR#C,IR_TOT,IROP_text,FE_#,FEN_TOT,FEP_TOT,FEK_TOT,RESC,TI_#,TIIMP_text,CROP_MODEL";
        }

        // String[] domes = MapUtil.getValueOr(data, "dome_ids", "").split("[|]");
        // String[] baseDome = domes[0].split("[\-]");
        
        StringBuilder acmo = new StringBuilder();
        acmo.append("*,");
        acmo.append(generateExpId(data));
        acmo.append(",");
        acmo.append(MapUtil.getValueOr(data, "dome_ids", ""));
        acmo.append(",");
        acmo.append(MapUtil.getValueOr(data, "exname", ""));
        amco.append(",0XXX,1,"); // Hardwired for now.



        // Write the files.
        writer = new BufferedWriter(new FileWriter(acmoFile, true));
        if (! header.equals("")) {
            writer.write(header);
        }
        writer.write(acmo.toString());
        writer.close();
    }

    private String generateExpId(HashMap<String, Object> data) {
        TreeMap t = new TreeMap(MapUtil.getGlobalValues(data));
        return hashFunc.newHasher().putString(t.toString()).hash().toString();
    }
}