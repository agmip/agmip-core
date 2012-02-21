package org.agmip.core.types;

import java.util.HashMap;
import java.util.List;
/**
 * A generic data line interface with no knowledge of implementation
 */
public abstract class DataLine {
  protected HashMap<String, Object> baseData;
  protected HashMap<String, Object> extraData;
  protected List<String> baseFields;
  
  public DataLine() {
    baseData = new HashMap<String, Object>();
    extraData = new HashMap<String, Object>();
  }
  
  public DataLine(HashMap<String, Object> inputData, List<String> baseKeys) {
    baseData = new HashMap<String, Object>();
    baseFields = baseKeys;
    this.splitData(inputData);
  }
  
  public Object get(String key) {
    if(baseData.containsKey(key)) {
      return baseData.get(key);
    } else {
      return extraData.get(key);
    }
  }
  
  public Object getOr(String key, Object defVal) {
    Object realVal = this.get(key);
    return (realVal == null) ? defVal : realVal;
  }
  
  public void set(String key, Object val) {
    if(baseFields.contains(key)) {
      baseData.put(key, val);
    } else {
      extraData.put(key, val);
    }
  }
  
  public void set(HashMap<String, Object> input) {
    this.splitData(input);
  }
  
  private void splitData(HashMap<String, Object>inputData) {
    for(String key : baseFields) {
        Object val = inputData.get(key);
        if(val != null) {
          baseData.put(key, val);
          inputData.remove(key);
        }
      }
      extraData = inputData;
  }
}