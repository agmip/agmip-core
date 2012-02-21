package org.agmip.core.types.weather;

/**
 * The weather implementation of Location
 */
import java.util.HashMap;
import java.util.ArrayList;
import org.agmip.core.types.*;

public class WeatherData {
  private Location location;
  private Double   referenceHeight;
  private Double   windHeight;
  private Double   tempAverage;
  private Double   tempAmplitude;
  private Double   co2ConcentrationAnnual;
  private HashMap<String, Object> extraMetadata;
  private ArrayList<WeatherDataLine> weatherDataList;
  
  public WeatherData(Location loc,
                     Double refht,
                     Double wndht,
                     Double tavg,
                     Double tamp,
                     Double co2ca,
                     HashMap ex,
                     ArrayList d) {
    location               = loc;
    referenceHeight        = refht;
    windHeight             = wndht;
    tempAverage            = tavg;
    tempAmplitude          = tamp;
    co2ConcentrationAnnual = co2ca;
    extraMetadata   = (ex == null) ? new HashMap<String, Object>()    : ex;
    weatherDataList = (d  == null) ? new ArrayList<WeatherDataLine>() : d;
  }

  public WeatherData(Location loc,
                     Double refht,
                     Double wndht,
                     Double tavg,
                     Double tamp,
                     Double co2ca) {
    this(loc, refht, wndht, tavg, tamp, co2ca, null, null);
  }
  
  public WeatherData(Location loc) {
    this(loc, null, null, null, null, null, null, null);
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
  
  public Double getCO2ConcentrationAnnual() {
    return co2ConcentrationAnnual;
  }
  
  public Double getCO2() {
    return this.getCO2ConcentrationAnnual();
  }
  
  public Double getCO2ConcentrationAnnualOr(Double defVal) {
    return (co2ConcentrationAnnual == null) ? defVal : windHeight;
  }
  
  public Double getCO2Or(Double defVal) {
    return this.getCO2ConcentrationAnnualOr(defVal);
  }

  public Location getLocation() {
    return location;
  }

  public HashMap getExtraMetadata() {
    return extraMetadata;
  }

  public ArrayList getWeatherData() {
    return weatherDataList;
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
  
  public void setCO2ConcentrationAnnual(Double co2) {
    co2ConcentrationAnnual = co2;
  }
  
  public void setCO2(Double co2) {
    this.setCO2ConcentrationAnnual(co2);
  }
  
  public void setExtraMetadata(HashMap ex) {
    extraMetadata = ex;
  }

  public void setWeatherData(ArrayList d) {
    weatherDataList = d;
  }
}
