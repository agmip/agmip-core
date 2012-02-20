package org.agmip.core.types;

/**
 * The weather implementation of Location
 */
import java.util.HashMap;

public class WeatherLocation {
  private Location location;
  private Double   referenceHeight;
  private Double   windHeight;
  private Double   tempAverage;
  private Double   tempAmplitude;
  private HashMap<String, Object> extra;
  
  public WeatherLocation(Location loc,
                         Double refht,
                         Double wndht,
                         Double tavg,
                         Double tamp,
                         HashMap ex) {
    location = loc;
    referenceHeight = refht;
    windHeight      = wndht;
    tempAverage     = tavg;
    tempAmplitude   = tamp;
    extra           = (ex == null) ? new HashMap<String, Object>() :ex;
  }

  public WeatherLocation(Location loc,
                         Double refht,
                         Double wndht,
                         Double tavg,
                         Double tamp) {
    this(loc, refht, wndht, tavg, tamp, null);
  }
  
  public WeatherLocation(Location loc) {
    this(loc, null, null, null, null, null);
  }

  public Double getReferenceHeight() {
    return referenceHeight;
  }

  public Double getReferenceHeightOr(Double defVal) {
    return (referenceHeight == null) ? defVal : referenceHeight;
  }

  public Double getWindHeight() {
    return windHeight;
  }

  public Double getWindHeightOr(Double defVal) {
    return (windHeight == null) ? defVal : windHeight;
  }

  public Double getTempAverage() {
    return tempAverage;
  }

  public Double getTempAverageOr(Double defVal) {
    return (tempAverage == null) ? defVal : tempAverage;
  }

  public Double getTempAmplitude() {
    return tempAmplitude;
  }

  public Double getTempAmplitudeOr(Double defVal) {
    return (tempAmplitude == null) ? defVal : tempAmplitude;
  }

  public Location getLocation() {
    return location;
  }

  public HashMap getExtraData() {
    return extra;
  }

  public void setReferenceHeight( Double refht ) {
    referenceHeight = refht;
  }

  public void setWindHeight(Double wndht) {
    windHeight = wndht;
  }

  public void setTempAverage(Double tavg) {
    tempAverage = tavg;
  }

  public void setTempAmplitude(Double tamp) {
    tempAmplitude = tamp;
  }
  
  public void setExtraData(HashMap ex) {
    extra = ex;
  }
}
