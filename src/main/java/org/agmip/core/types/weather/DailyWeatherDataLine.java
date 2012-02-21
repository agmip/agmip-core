package org.agmip.core.types.weather;

/**
 * Weather specific DataLine implementation
 */

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import org.agmip.core.types.DataLine;

public class DailyWeatherDataLine extends WeatherDataLine {
  private static List<String> baseFields = Arrays.asList("date", "tmin", "tmax", "rain", "srad", "wind", "dewp", "vprs", "rhum");
  public DailyWeatherDataLine(HashMap<String, Object> inputData) {
    super(inputData, baseFields);
  }
  
  public DailyWeatherDataLine(HashMap<String, Object> inputData, ArrayList<String> userDefinedBaseFields) {
    super(inputData, userDefinedBaseFields);
  }
  
  public DailyWeatherDataLine() {
    super();
  }

  public Date getDate() {
    return (Date) this.get("date");
  }

  public Double getTempMin() {
    return (Double) this.get("tmin");
  }

  public Double getTempMax() {
    return (Double) this.get("tmax");
  }

  public Double getSolarRadiation() {
    return (Double) this.get("srad");
  }

  public Double getWindSpeed() {
    return (Double) this.get("wind");
  }

  public Double getDewPoint() {
    return (Double) this.get("dewp");
  }

  public Double getVaporPressure() {
    return (Double) this.get("vprs");
  }

  public Double getRelativeHumidity() {
    return (Double) this.get("rhum");
  }

  public Double getRain() {
    return (Double) this.get("rain");
  }

  public void setDate(Date d) {
    this.set("date", d);
  }

  public void setTempMin(Double tm) {
    this.set("tmin", tm);
  }

  public void setTempMax(Double tm) {
    this.set("tmax", tm);
  }

  public void setSolarRadiation(Double sr) {
    this.set("srad", sr);
  }

  public void setWindSpeed(Double ws) {
    this.set("wind", ws);
  }

  public void setDewPoint(Double dp) {
    this.set("dewp", dp);
  }

  public void setVaporPressure(Double vp) {
    this.set("vprs", vp);
  }

  public void setRelativeHumidity(Double rh) {
    this.set("rhum", rh);
  }

  public void setRain(Double r) {
    this.set("rain", r);
  }
}
