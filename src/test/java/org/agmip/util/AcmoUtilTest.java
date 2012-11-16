package org.agmip.util;

import java.util.HashMap;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.agmip.util.MapUtil;
import org.agmip.ace.util.AcePathfinderUtil;

public class AcmoUtilTest {
    private static final Logger log = LoggerFactory.getLogger(AcmoUtilTest.class);
    private HashMap<String, Object> coreMap = new HashMap<String, Object>();
    
    @Before
    public void populateCoreMap() {
        AcePathfinderUtil.insertValue(coreMap, "pdate", "19810101");
        AcePathfinderUtil.insertValue(coreMap, "crid", "MAZ");
        AcePathfinderUtil.insertValue(coreMap, "cul_name", "OBATAMPA");
        AcePathfinderUtil.insertValue(coreMap, "dssat_cul_id", "GH0010");
    }

    @Test
    public void checkCropTest() {
        HashMap<String, String> results = AcmoUtil.extractEventData(coreMap, "dssat");
        assertEquals("Crop name invalid", "Maize", results.get("crid"));
    }

    @Test
    public void checkFertilizerTest() {
        // Create two fertilizer events and see what we get.
        AcePathfinderUtil.insertValue(coreMap, "fedate", "19810101");
        AcePathfinderUtil.insertValue(coreMap, "feamn", "100.0");
        AcePathfinderUtil.insertValue(coreMap, "fedate", "19810102");
        AcePathfinderUtil.insertValue(coreMap, "feamk", "25.2");
        AcePathfinderUtil.insertValue(coreMap, "feamn", "15.5");
        AcePathfinderUtil.insertValue(coreMap, "feamp", ".65");
        HashMap<String, String> results = AcmoUtil.extractEventData(coreMap, "dssat");

        assertEquals("Number of fertilizer applications incorrect", "2", results.get("fe_count"));
        assertEquals("Incorrect fen_tot", "115.5", results.get("fen_tot"));
        assertEquals("Incorrect fek_tot", "25.2", results.get("fek_tot"));
        assertEquals("Incorrect fep_tot", "0.65", results.get("fep_tot"));
    }

    @Test 
    public void checkIrrigationTest() {
        AcePathfinderUtil.insertValue(coreMap, "idate", "19810101");
        AcePathfinderUtil.insertValue(coreMap, "irval", "25");
        AcePathfinderUtil.insertValue(coreMap, "irop", "IR004");
        AcePathfinderUtil.insertValue(coreMap, "idate", "19810105");
        AcePathfinderUtil.insertValue(coreMap, "irval", "15.2");
        AcePathfinderUtil.insertValue(coreMap, "irop", "IR004");
        AcePathfinderUtil.insertValue(coreMap, "idate", "19810215");
        AcePathfinderUtil.insertValue(coreMap, "irop", "IR003");
        AcePathfinderUtil.insertValue(coreMap, "irval", "50");
        HashMap<String, String> results = AcmoUtil.extractEventData(coreMap, "dssat");

        assertEquals("Number of irrigation events incorrect", "3", results.get("ir_count"));
        assertEquals("Incorrect ir_tot", "90.2", results.get("ir_tot"));
        assertEquals("Incorrect irop", "Sprinkler|Flood");
    }
}
