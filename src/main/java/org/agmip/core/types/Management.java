package org.agmip.translators.dssat;

/**
 *
 * @author Meng Zhang
 */
public class Management {

    /**
     * Experiment identifier
     * Unit or Type: text
     */
    private String eid = null;
    /**
     * Name of experiment
     * Unit or Type: text
     */
    private String exname = null;
    /**
     * 
     * Unit or Type: 
     */
    private String local_id = null;
    /**
     * Locally used name for experiment
     * Unit or Type: text
     */
    private String local_name = null;
    /**
     * Objectives of the study
     * Unit or Type: text
     */
    private String objectives = null;
    /**
     * Main factor, factors or interactions of interest in an experiment
     * Unit or Type: text
     */
    private String main_factor = null;
    /**
     * Experimental factor combinations
     * Unit or Type: text
     */
    private String factors = null;
    /**
     * Number of blocks or replicates
     * Unit or Type: number
     */
    private String rep_no = null;
    /**
     * General type of experiment, e.g., varietal trial
     * Unit or Type: code
     */
    private String exper_type = null;
    /**
     * Type of site, e.g., station, on-farm
     * Unit or Type: code
     */
    private String site_type = null;
    /**
     * Whether managed by researchers, producers
     * Unit or Type: code
     */
    private String mgmt_type = null;
    /**
     * Duration of experiment in years
     * Unit or Type: number
     */
    private String exp_dur = null;
    /**
     * Cropping system descriptive name
     * Unit or Type: text
     */
    private String cr_system = null;
    /**
     * Distribution limitations for the data set
     * Unit or Type: text
     */
    private String distribution = null;
    /**
     * File version for ICASA standard
     * Unit or Type: text
     */
    private String version = null;
    /**
     * Date the file was first created
     * Unit or Type: date
     */
    private String vdate_first = null;
    /**
     * Date the file was last modified
     * Unit or Type: date
     */
    private String vdate_latest = null;
    /**
     * Date of AgMIP rating
     * Unit or Type: date
     */
    private String agmip_date = null;
    /**
     * Initials of person assigning AgMIP rating
     * Unit or Type: text
     */
    private String agmip_rater = null;
    /**
     * AgMIP sentinel site rating (gold, silver, etc.)
     * Unit or Type: code
     */
    private String agmip_rating = null;
    /**
     * AgMIP sentinel site rating for management data
     * Unit or Type: number
     */
    private String rating_mgmt = null;
    /**
     * AgMIP sentinel site rating for observed data
     * Unit or Type: number
     */
    private String rating_obs = null;
    /**
     * AgMIP sentinel site rating for soil data
     * Unit or Type: number
     */
    private String rating_soil = null;
    /**
     * AgMIP sentinel site rating for weather data
     * Unit or Type: number
     */
    private String rating_wth = null;
    /**
     * Crop model version related to data upload
     * Unit or Type: text
     */
    private String model_ver = null;
    /**
     * Original format of data (DSSAT, APSIM, CIMMYT, field log, etc)
     * Unit or Type: code
     */
    private String data_source = null;
    /**
     * Date of last upload of information to experimental data
     * Unit or Type: date
     */
    private String last_update = null;
    /**
     * id of user who uploaded data (typically email address)
     * Unit or Type: text
     */
    private String user_id = null;
    /**
     * id
     * Unit or Type: 
     */
    private String pp = null;
    /**
     * Last name of researchers involved with the experiment(s) or data
     * Unit or Type: text
     */
    private String last_name = null;
    /**
     * First name of researchers involved with the experiment(s) or data
     * Unit or Type: text
     */
    private String first_name = null;
    /**
     * Middle initial of researchers involved with the experiment(s) or data
     * Unit or Type: text
     */
    private String mid_initial = null;
    /**
     * Role of researcher in experiment or dataset preparation
     * Unit or Type: code
     */
    private String pp_role = null;
    /**
     * Links to institution associated w person
     * Unit or Type: 
     */
    private String inp = null;
    /**
     * E-mail address of researcher
     * Unit or Type: text
     */
    private String e_mail = null;
    /**
     * Aditional noteson persons involved with the experiment(s)
     * Unit or Type: text
     */
    private String person_notes = null;
    /**
     * id
     * Unit or Type: 
     */
    private String in = null;
    /**
     * Names of participating institution
     * Unit or Type: text
     */
    private String institution = null;
    /**
     * Type of participating institutions
     * Unit or Type: code
     */
    private String in_type = null;
    /**
     * Role of participating institutions
     * Unit or Type: code
     */
    private String in_role = null;
    /**
     * id
     * Unit or Type: 
     */
    private String do_id = null;
    /**
     * Document name in abbreviated form
     * Unit or Type: text
     */
    private String document = null;
    /**
     * Digital_object_identifier according to international standard
     * Unit or Type: text
     */
    private String digital_obj_id = null;
    /**
     * Description of experimental design
     * Unit or Type: text
     */
    private String design = null;
    /**
     * Experimental layout
     * Unit or Type: text
     */
    private String layout = null;
    /**
     * Layout of individual plot
     * Unit or Type: text
     */
    private String plot_layout = null;
    /**
     * General notes on execution of experiment.
     * Unit or Type: text
     */
    private String method_notes = null;
    /**
     * id
     * Unit or Type: number
     */
    private String ex_id = null;
    /**
     * Plot area (gross) per rep
     * Unit or Type: m2
     */
    private String plta = null;
    /**
     * Plot row number for single plot or treatment
     * Unit or Type: number
     */
    private String pltrno = null;
    /**
     * Plot length (gross) for single plot or treatment
     * Unit or Type: m
     */
    private String pltln = null;
    /**
     * Plot orientation (from North)
     * Unit or Type: degree angle
     */
    private String pltor = null;
    /**
     * Drainage orientation (from North)
     * Unit or Type: degree angle
     */
    private String pltod = null;
    /**
     * Plots relative to drains
     * Unit or Type: degree angle
     */
    private String pldr = null;
    /**
     * Spacing between individual plots, if any
     * Unit or Type: cm
     */
    private String pltsp = null;
    /**
     * Plot harvest area
     * Unit or Type: m2
     */
    private String pltha = null;
    /**
     * Plot harvest row number
     * Unit or Type: number
     */
    private String plthno = null;
    /**
     * Plot harvest length
     * Unit or Type: m
     */
    private String plthl = null;
    /**
     * Plot harvest width
     * Unit or Type: m
     */
    private String plthw = null;
    /**
     * Plot harvest method (eg.Hand, combine)
     * Unit or Type: code
     */
    private String plthm = null;
    /**
     * Constraints known to affect crop performance
     * Unit or Type: text
     */
    private String cnstr = null;
    /**
     * Complications arising during experiment
     * Unit or Type: text
     */
    private String cmplc = null;
    /**
     * Treatment number
     * Unit or Type: number
     */
    private String trtno = null;
    /**
     * Replicate number
     * Unit or Type: number
     */
    private String rp = null;
    /**
     * Sequence number
     * Unit or Type: number
     */
    private String sq = null;
    /**
     * Option for crop in sequence
     * Unit or Type: number
     */
    private String op = null;
    /**
     * Crop component number
     * Unit or Type: number
     */
    private String co = null;
    /**
     * Treatment name
     * Unit or Type: text
     */
    private String trt_name = null;
    /**
     * Treatment, extended comments on treatments
     * Unit or Type: text
     */
    private String tr_notes = null;
    /**
     * Crop (or weed) species identifier
     * Unit or Type: code
     */
    private String crid = null;
    /**
     * Cultivar, line or genotype identifier
     * Unit or Type: code
     */
    private String cul_id = null;
    /**
     * Cultivar name
     * Unit or Type: text
     */
    private String cul_name = null;
    /**
     * Cultivar notes
     * Unit or Type: text
     */
    private String cul_notes = null;
    /**
     * Field name
     * Unit or Type: text
     */
    private String fl_name = null;
    /**
     * Description of field location
     * Unit or Type: text
     */
    private String fl_loc = null;
    /**
     * Name of country where field is located
     * Unit or Type: text
     */
    private String fl_loc_1 = null;
    /**
     * First political subdivision for field location (e.g., state, province, department)
     * Unit or Type: text
     */
    private String fl_loc_2 = null;
    /**
     * Second political subdivision for field location (e.g, county)
     * Unit or Type: text
     */
    private String fl_loc_3 = null;
    /**
     * Field latitude
     * Unit or Type: degree angle
     */
    private String fl_lat = null;
    /**
     * Field longitude, E positive,W negative
     * Unit or Type: degree angle
     */
    private String fl_long = null;
    /**
     * Elevation of field site
     * Unit or Type: m
     */
    private String flele = null;
    /**
     * Field slope (from horizontal)
     * Unit or Type: degree angle
     */
    private String flsl = null;
    /**
     * Field slope length
     * Unit or Type: m
     */
    private String flsll = null;
    /**
     * Field slope aspect, W, nW, etc.
     * Unit or Type: text
     */
    private String flsla = null;
    /**
     * Field area
     * Unit or Type: m2
     */
    private String farea = null;
    /**
     * Obstruction to sun
     * Unit or Type: degree angle
     */
    private String flob = null;
    /**
     * Field length to width ratio
     * Unit or Type: number
     */
    private String fllwr = null;
    /**
     * Field plow layer depth
     * Unit or Type: cm
     */
    private String fl_plowd = null;
    /**
     * Field plow layer compaction (0 to 1 scale)
     * Unit or Type: number
     */
    private String fl_plowdc = null;
    /**
     * Drainage, type in field
     * Unit or Type: code
     */
    private String fl_drntype = null;
    /**
     * Drain, depth in field
     * Unit or Type: cm
     */
    private String fldrd = null;
    /**
     * Drain spacing
     * Unit or Type: m
     */
    private String fldrs = null;
    /**
     * Subset name for a single weather station
     * Unit or Type: code
     */
    private String wth_subset = null;
    /**
     * Weather dataset containing relevant data
     * Unit or Type: text
     */
    private String wth_dataset = null;
    /**
     * Field, short notes
     * Unit or Type: text
     */
    private String fl_notes = null;
    /**
     * Distance from weather station to field (m)
     * Unit or Type: m
     */
    private String wst_dist = null;
    /**
     * Soil identifier
     * Unit or Type: code
     */
    private String soil_subset = null;
    /**
     * File containing relevant soil profile description
     * Unit or Type: text
     */
    private String soil_dataset = null;
    /**
     * Soil texture
     * Unit or Type: code
     */
    private String sltx = null;
    /**
     * Soil depth
     * Unit or Type: cm
     */
    private String sldp = null;
    /**
     * Water table depth
     * Unit or Type: cm
     */
    private String dtwt = null;
    /**
     * Growth stage date, emergence
     * Unit or Type: date
     */
    private String pldae = null;
    /**
     * Growth stage of planting, as date
     * Unit or Type: date
     */
    private String pdate = null;
    /**
     * Planting level, name of treatment
     * Unit or Type: text
     */
    private String pl_name = null;
    /**
     * Plant population at planting
     * Unit or Type: number/m2
     */
    private String plpop = null;
    /**
     * Plant population at emergence
     * Unit or Type: number/m2
     */
    private String plpoe = null;
    /**
     * Planting material
     * Unit or Type: code
     */
    private String plma = null;
    /**
     * Planting depth
     * Unit or Type: mm
     */
    private String pldp = null;
    /**
     * Planting distribution
     * Unit or Type: code
     */
    private String plds = null;
    /**
     * Row spacing
     * Unit or Type: cm
     */
    private String plrs = null;
    /**
     * Row direction, degrees from N
     * Unit or Type: degree angle
     */
    private String plrd = null;
    /**
     * Plants per hill
     * Unit or Type: number
     */
    private String plph = null;
    /**
     * Planting material weight
     * Unit or Type: kg/ha
     */
    private String plmwt = null;
    /**
     * Transplant age
     * Unit or Type: number
     */
    private String page = null;
    /**
     * Planting material age (also used for d
     * Unit or Type: number
     */
    private String plage = null;
    /**
     * Transplant nursery environment (mean temperature)
     * Unit or Type: C
     */
    private String plenv = null;
    /**
     * Planting material sprout length
     * Unit or Type: cm
     */
    private String plspl = null;
    /**
     * Planting material germination
     * Unit or Type: %
     */
    private String plgpc = null;
    /**
     * Source of the planting material
     * Unit or Type: text
     */
    private String plmsource = null;
    /**
     * Harvest operations level name
     * Unit or Type: text
     */
    private String ha_name = null;
    /**
     * Harvest, short notes
     * Unit or Type: text
     */
    private String ha_notes = null;
    /**
     * Harvest, extended comments on harvest procedures
     * Unit or Type: text
     */
    private String ha_comments = null;
    /**
     * Harvest operations day, DAP if year = -99
     * Unit or Type: date
     */
    private String hadat = null;
    /**
     * Harvest, growth stage of crop at date
     * Unit or Type: code
     */
    private String hastg = null;
    /**
     * Harvest operations, crop component harvested
     * Unit or Type: code
     */
    private String hacom = null;
    /**
     * Harvest method
     * Unit or Type: code
     */
    private String harm = null;
    /**
     * Harvest area
     * Unit or Type: m2
     */
    private String harea = null;
    /**
     * Harvest operations size category
     * Unit or Type: code
     */
    private String hasiz = null;
    /**
     * Harvest operations, percent economic product harvested
     * Unit or Type: %
     */
    private String hapc = null;
    /**
     * Harvest operations, percent of by-product harvested
     * Unit or Type: %
     */
    private String habpc = null;
    /**
     * Code associated with a specific variate
     * Unit or Type: code
     */
    private String name_code = null;
    /**
     * Expected maximum value of a given variate
     * Unit or Type: number
     */
    private String max = null;
    /**
     * Unit of measurement for a given variate
     * Unit or Type: text
     */
    private String unit = null;
    /**
     * Expected minimum value of a given variate
     * Unit or Type: number
     */
    private String min = null;
    /**
     * Designated special value to indicate missing data
     * Unit or Type: number
     */
    private String miss = null;
    /**
     * Description of a given variate
     * Unit or Type: text
     */
    private String description = null;
    /**
     * Validation criteria notes, explanations
     * Unit or Type: text
     */
    private String vl_notes = null;
    /**
     * Suite, identifier
     * Unit or Type: text
     */
    private String suiteid = null;
    /**
     * Suite, name
     * Unit or Type: text
     */
    private String suite_name = null;
    /**
     * Suite, local name
     * Unit or Type: text
     */
    private String suite_local_name = null;
    /**
     * Suite, description
     * Unit or Type: text
     */
    private String suite_description = null;
    /**
     * Plot width (gross) for single plot or treatment
     * Unit or Type: m
     */
    private String pltwi = null;
}
