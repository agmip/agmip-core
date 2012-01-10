package org.agmip.core.types;

public class WeatherLocation {
  private Location location;
  private Double   referenceHeight;
  private Double   windHeight;
  private Double   tempAverage;
  private Double   tempAmplitude;
  
  public WeatherLocation(Location loc,
                         Double refht,
                         Double wndht,
                         Double tavg,
                         Double tamp,
                         Double defVal) {
    location = loc;
    referenceHeight = (refht == null) ? defVal : refht;
    windHeight      = (wndht == null) ? defVal : wndht;
    tempAverage     = (tavg  == null) ? defVal : tavg;
    tempAmplitude   = (tamp  == null) ? defVal : tamp;
  }
  
  public WeatherLocation(Location loc,
                         Double refht,
                         Double wndht,
                         Double tavg,
                         Double tamp) {
    this(loc, refht, wndht, tavg, tamp, new Double(-99.99));
  }

  public WeatherLocation(Location loc, Double defVal) {
    this(loc, null, null, null, null, defVal);
  }

  public WeatherLocation(Location loc) {
    this(loc, null, null, null, null, new Double(-99.99));
  }

  public Double getReferenceHeight() {
    return referenceHeight;
  }

  public Double getWindHeight() {
    return windHeight;
  }

  public Double getTempAverage() {
    return tempAverage;
  }

  public Double getTempAmplitude() {
    return tempAmplitude;
  }

  public Location getLocation() {
    return location;
  }

  public void setReferenceHeight( Double refht ) {
    referenceHeight = (refht == null) ? new Double(-99.99) : refht;
  }

  public void setWindHeight(Double wndht) {
    windHeight = (wndht == null) ? new Double(-99.99) : wndht;
  }

  public void setTempAverage(Double tavg) {
    tempAverage = (tavg == null) ? new Double(-99.99) : tavg;
  }

  public void setTempAmplitude(Double tamp) {
    tempAmplitude = (tamp == null) ? new Double(-99.99) : tamp;
  }
}
