package org.agmip.util;

import org.junit.Test;
import org.junit.Before;
import java.util.Map;
import java.util.LinkedHashMap;
import java.util.ArrayList;
import java.io.IOException;
import static org.junit.Assert.*;
import com.google.common.base.Optional;

public class JSONAdapterTest {
    private static final String jsonComplex = "{\"a\":\"Hello\", \"b\" : {\"one\" : \"1981\", \"two\" : \"1892\"}, \"c\" : [\"ArrayValue1\", \"ArrayValueTwo\"]}" ;
    private static final String jsonSimple  = "{\"a\":\"Hello\", \"b\" : \"World\"}";

    @Test
    public void SimpleJSONTest() throws IOException {
        Map<String, String> ex = JSONAdapter.fromJSON(jsonSimple);
        assertTrue(ex.get("a").equals("Hello"));
    }

    @Test
    public void ComplexJSONTest() throws IOException {
        Map<String, Object> ex = JSONAdapter.fromJSON(jsonComplex);
        System.out.println(ex);
        assertTrue(((LinkedHashMap) ex.get("b")).get("one").equals("1981"));
    }
   
}
