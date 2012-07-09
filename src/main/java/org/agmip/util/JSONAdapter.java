package org.agmip.util;

/**
 * Simple JSON converter using Jackson
 */

import java.util.LinkedHashMap;
import java.io.IOException;
import org.codehaus.jackson.map.ObjectMapper;

public class JSONAdapter {
    private static final ObjectMapper mapper = new ObjectMapper();

    public static LinkedHashMap fromJSON(String json) throws IOException {
        return mapper.readValue(json, LinkedHashMap.class);
    } 

    public static String toJSON(Object obj) throws IOException {
        return mapper.writeValueAsString(obj);
    }
}
