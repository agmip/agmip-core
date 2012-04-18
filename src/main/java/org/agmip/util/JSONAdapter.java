package org.agmip.util;

/**
 * Simple JSON converter using Jackson
 */

import java.util.Map;
import java.util.HashMap;
import java.io.IOException;
import org.codehaus.jackson.map.ObjectMapper;
import org.agmip.core.types.AdvancedHashMap;

public class JSONAdapter {
  private ObjectMapper mapper; 
  private AdvancedHashMap data;
  
  public JSONAdapter(){
    data = new AdvancedHashMap();
    mapper = new ObjectMapper();

  };
  
  public AdvancedHashMap fromJSON(String json) throws IOException {
    Map d = mapper.readValue(json, Map.class);
    flatten(d);
    return data;
  }

  private void flatten(Map<String,Object> source) {
    for (Map.Entry<String,Object> e : source.entrySet()) {
      Object value = e.getValue();
      if(value instanceof Map)
        flatten((Map<String,Object>)value);
      data.put(e.getKey(), value);
    }
  }
  
  public AdvancedHashMap exportRecord(Map r) {
    AdvancedHashMap d = new AdvancedHashMap(r);
    return d;
  }
  
  public String toJSON(Object obj) throws IOException {
    return mapper.writeValueAsString(obj);
  }
}
