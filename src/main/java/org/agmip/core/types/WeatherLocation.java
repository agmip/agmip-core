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
                         Double tamp) {
    location = loc;
    referenceHeight = (refht == null) ? new Double(-99.99) : refht;
    windHeight      = (wndht == null) ? new Double(-99.99) : wndht;
    tempAverage     = (tavg  == null) ? new Double(-99.99) : tavg;
    tempAmplitude   = (tamp  == null) ? new Double(-99.99) : tamp;
  }

  public WeatherLocation(Location loc) {
    location = loc;
    referenceHeight = new Double(-99.99);
    windHeight      = new Double(-99.99);
    tempAverage     = new Double(-99.99);
    tempAmplitude   = new Double(-99.99);
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
