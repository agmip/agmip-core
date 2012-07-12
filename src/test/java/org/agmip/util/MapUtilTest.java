package org.agmip.util;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
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
        LinkedHashMap<String, Object> toParse = JSONAdapter.fromJSON(json);
        System.out.println(toParse);
        LinkedHashMap<String, Object> uncompressed = decompressAll(toParse);
        System.out.println(uncompressed);
    }
}
