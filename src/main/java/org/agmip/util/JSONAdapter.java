package org.agmip.util;

/**
 * Simple JSON converter using Jackson
 */

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.annotate.JsonSerialize;

public class JSONAdapter {
    private static final ObjectMapper mapper = new ObjectMapper();

    public static LinkedHashMap<String, Object> fromJSON(String json) throws IOException {
        return mapper.readValue(json, LinkedHashMap.class);
    } 

    public static String toJSON(Object obj) throws IOException {
        return mapper.writeValueAsString(obj);
    }
}
