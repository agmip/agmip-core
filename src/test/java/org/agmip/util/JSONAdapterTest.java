package org.agmip.util;

import org.junit.Test;
import org.junit.Before;
import java.util.HashMap;
import java.util.ArrayList;
import java.io.IOException;
import static org.junit.Assert.*;
import org.agmip.core.types.AdvancedHashMap;

public class JSONAdapterTest {
    private static final String jsonComplex = "{\"a\":\"Hello\", \"b\" : {\"one\" : \"1981\", \"two\" : \"1892\"}, \"c\" : [\"ArrayValue1\", \"ArrayValueTwo\"]}" ;
    private static final String jsonSimple  = "{\"a\":\"Hello\", \"b\" : \"World\"}";
    private JSONAdapter adapter;

    @Before
    public void setup() {
        adapter = new JSONAdapter();
    }

    @Test
    public void SimpleJSONTest() throws IOException {
        HashMap<String, String> ex = adapter.fromJSON(jsonSimple);
        assertTrue(ex.get("a").equals("Hello"));
    }

    @Test
    public void ComplexJSONTest() throws IOException {
        AdvancedHashMap<String, Object> ex = adapter.fromJSON(jsonComplex);
        assertTrue(ex.get("a").equals("Hello"));
        assertTrue(ex.get("one").equals("1981"));
        assertTrue(ex.get("c") instanceof ArrayList);
    }
}
