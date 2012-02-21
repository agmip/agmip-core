package org.agmip.core.types.weather;

/**
 * Generic Weather Data Line container
 */

import java.util.HashMap;
import java.util.List;
import org.agmip.core.types.DataLine;

public abstract class WeatherDataLine extends DataLine {
  public WeatherDataLine() {
    super();
  }
  
  public WeatherDataLine(HashMap<String, Object> inputData, List<String> baseFields) {
   super(inputData, baseFields);
  }
}