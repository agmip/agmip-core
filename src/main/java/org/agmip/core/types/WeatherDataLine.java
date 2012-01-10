package org.agmip.core.types;

import java.util.HashMap;
import java.util.Iterator;

public class WeatherDataLine extends DataLine {
  private HashMap<String, Object> data;
  private HashMap<String, Object> extra;
  private Double defaultValue = -99.99;
  
  public WeatherDataLine(HashMap<String, Object> inputData) {
    String[] fields = {"date", "tmin", "tmax", "rain", "srad", "wind", "dewp", "vprs", "rhum"};
    data = new HashMap<String, Object>();
    for(int i=0; i < fields.length; i++ ) {
      String key = fields[i];
      Object val = inputData.get(key);
      data.put(key, val);
      inputData.remove(key);
    }
    extra = inputData;
  }

  public Double getTempMin() {
    return (Double) data.get("tmin");
  }

  public Double getTempMax() {
    return (Double) data.get("tmax");
  }

  public Double getSolarRadiation() {
    return (Double) data.get("srad");
  }

  public Double getWindSpeed() {
    return (Double) data.get("wind");
  }

  public Double getDewPoint() {
    return (Double) data.get("dewp");
  }

  public Double getVaporPressure() {
    return (Double) data.get("vprs");
  }

  public Double getRelativeHumidity() {
    return (Double) data.get("rhum");
  }

  public Double getRain() {
    return (Double) data.get("rain");
  }

  public HashMap getExtraData() {
    return extra;
  }

  public void setTempMin(Double tm) {
    data.put("tmin", tm);
  }

  public void setTempMax(Double tm) {
    data.put("tmax", tm);
  }

  public void setSolarRadiation(Double sr) {
    data.put("srad", sr);
  }

  public void setWindSpeed(Double ws) {
    data.put("wind", ws);
  }

  public void setDewPoint(Double dp) {
    data.put("dewp", dp);
  }

  public void setVaporPressure(Double vp) {
    data.put("vprs", vp);
  }

  public void setRelativeHumidity(Double rh) {
    data.put("rhum", rh);
  }

  public void setRain(Double r) {
    data.put("rain", r);
  }

  public void setExtraData(HashMap <String, Object> ex) {
    extra.putAll(ex);
  }

  public void setExtraData(String key, Object value) {
    extra.put(key, value);
  }
}
