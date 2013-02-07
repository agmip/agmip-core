package org.agmip.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.junit.Ignore;
import org.junit.Test;

public class AgmipMarkersTest {
    private static final Logger log = LoggerFactory.getLogger(AgmipMarkersTest.class);

    @Test
    public void markerTest() {
        log.error(AgmipMarkers.TRANSLATE_MISSING_VALUE, "This is a test");
    }
}
