package org.agmip.util;

/**
 * Simple JSON converter using Jackson
 */

import java.io.IOException;
import org.codehaus.jackson.map.ObjectMapper;
import org.agmip.core.types.Experiment;

public class JSONAdapter {
    private static final ObjectMapper mapper;

    public JSONAdapter() {
        mapper = new ObjectMapper();
        mapper.setSerializationInclusion(JsonSerialize.Inclusion.NOT_NULL);
    }

    public static Experiment fromJSON(String json) throws IOException {
        return mapper.readValue(json, Experiment.class);
    } 

    public static String toJSON(Object obj) throws IOException {
        return mapper.writeValueAsString(obj);
    }
}
