package org.agmip.core.types.weather;

import java.util.HashMap;
import java.util.ArrayList;    
import org.junit.Test;
import static org.junit.Assert.*;
import org.agmip.core.types.*;
import org.agmip.core.types.weather.*;

public class WeatherDataTest {

  @Test
  public void blankWeatherData() {
    WeatherData test = new WeatherData(new PointLocation("AAAA", new Point(0.0, 0.0)));
    assertEquals("Temperature Average", null, test.getTempAverage());
    assertEquals("Reference Height", null, test.getReferenceHeight());
  }

  @Test
  public void partialWeatherData() {
    WeatherData test = new WeatherData(new PointLocation("AAAA", new Point(0.0, 0.0)),
                                               null, null, 12.34, null, null);
    assertEquals("Temperature Average", new Double(12.34), test.getTempAverage());
    assertEquals("Reference Height", null, test.getReferenceHeight());
  }

  @Test
  public void completeWeatherData() {
    WeatherData test = new WeatherData(new PointLocation("AAAA", new Point(0.0, 0.0)),
                                               12.34, 12.34, 12.34, 12.34, 12.34, new HashMap(), new ArrayList());
    assertEquals("Reference Height", new Double(12.34), test.getReferenceHeight());
    assertEquals("Wind Height", new Double(12.34), test.getWindHeight());
    assertEquals("Temperature Average", new Double(12.34), test.getTempAverage());
    assertEquals("Temperature Amplitude", new Double(12.34), test.getTempAmplitude());
  }
}
