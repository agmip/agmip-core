package org.agmip.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.junit.Test;
import static org.junit.Assert.*;

public class HelpersTest {
    private final static Logger LOG = LoggerFactory.getLogger(HelpersTest.class);

    @Test
    public void parseDoubleTest() {
        try {
            LOG.info("Double output: "+Helpers.parseDouble("12.345").toString());
            LOG.info("Double output: "+Helpers.parseDouble("12,345").toString());
            LOG.info("Double output: "+Helpers.parseDouble("12,345.67").toString());
            LOG.info("Double output: "+Helpers.parseDouble("12 345 678,90").toString());
            LOG.info("Double output: "+Helpers.parseDouble("This should fail").toString());
        } catch (Exception ex) {
            LOG.error("Caught the exception I was looking for!");
        }
    }
}
