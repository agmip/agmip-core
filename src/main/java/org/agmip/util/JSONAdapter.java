package org.agmip.util;

/**
 * Simple JSON converter using Jackson
 */

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JSONAdapter {
    private static final ObjectMapper mapper = new ObjectMapper();
    private static final Logger LOG = LoggerFactory.getLogger(JSONAdapter.class);

    public static HashMap<String, Object> fromJSON(String json) throws IOException {
        return mapper.readValue(json, new TypeReference<HashMap<String, Object>>() {});
    } 

    public static String toJSON(Object obj) throws IOException {
        return mapper.writeValueAsString(obj);
    }

    public static HashMap<String, Object> fromJSONFile(String path) throws IOException {
        String json = new Scanner(new File(path), "UTF-8").useDelimiter("\\A").next();
        return mapper.readValue(json, new TypeReference<HashMap<String, Object>>() {});
    }
}
