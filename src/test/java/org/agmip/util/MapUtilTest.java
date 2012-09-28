package org.agmip.util;

import java.util.HashMap;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.net.URL;

import org.junit.Test;
import static org.junit.Assert.*;

import static org.agmip.util.MapUtil.*;
import org.agmip.util.JSONAdapter;

public class MapUtilTest {
    @Test
    public void lameTest() {
        assertTrue( true );
    }

    @Test
    public void decompression() throws IOException {
        URL resource = this.getClass().getResource("/simulation.json");
        String json = new Scanner(new File(resource.getPath()), "UTF-8").useDelimiter("\\A").next();
        assertFalse(json.equals(""));
        HashMap<String, Object> toParse = JSONAdapter.fromJSON(json);
        System.out.println(toParse);
        HashMap<String, Object> uncompressed = decompressAll(toParse);
        System.out.println(uncompressed);
    }
}
