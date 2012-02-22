package org.agmip.core.types.weather;

/**
 * The weather implementation of Location
 */

import java.util.ArrayList;
import org.agmip.core.types.*;

public class WeatherData {
  public Location        location;
  public AdvancedHashMap<String, Object> weatherMetadata;// = new AdvancedHashMap<String, Object>();
  public ArrayList weatherDataRecords;
  
  public WeatherData(Location loc,   
                     Double refht,
                     Double wndht,
                     Double tavg,
                     Double tamp,
                     Double co2y,
                     ArrayList<AdvancedHashMap<String, Object>> d) {
    location           = loc;
    weatherMetadata    = new AdvancedHashMap<String, Object>();
    weatherDataRecords = new ArrayList<AdvancedHashMap<String, Object>>();
    
    weatherMetadata.put("refht", refht);
    weatherMetadata.put("wndht", wndht);
    weatherMetadata.put("tav",   tavg);
    weatherMetadata.put("tamp",  tamp);
    weatherMetadata.put("co2y",  co2y);
  }

  public WeatherData(Location loc,
                     Double refht,
                     Double wndht,
                     Double tavg,
                     Double tamp,
                     Double co2y) {
    this(loc, refht, wndht, tavg, tamp, co2y, null);
  }
  
  public WeatherData(Location loc) {
    location = loc;
    weatherMetadata    = new AdvancedHashMap<String,Object>();
    weatherDataRecords = new ArrayList<AdvancedHashMap<String, Object>>();
  }
}
