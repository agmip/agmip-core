package org.agmip.core.types;

import org.junit.Test;
import static org.junit.Assert.*;

public class WeatherLocationTest {

  @Test
  public void blankWeatherLocationData() {
    WeatherLocation test = new WeatherLocation(new PointLocation("AAAA", new Point(0.0, 0.0)));
    assertEquals("Temperature Average", null, test.getTempAverage());
    assertEquals("Reference Height", null, test.getReferenceHeight());
  }

  @Test
  public void partialWeatherLocationData() {
    WeatherLocation test = new WeatherLocation(new PointLocation("AAAA", new Point(0.0, 0.0)),
                                               null, null, 12.34, null);
    assertEquals("Temperature Average", new Double(12.34), test.getTempAverage());
    assertEquals("Reference Height", null, test.getReferenceHeight());
  }

  @Test
  public void completeWeatherLocationData() {
    WeatherLocation test = new WeatherLocation(new PointLocation("AAAA", new Point(0.0, 0.0)),
                                               12.34, 12.34, 12.34, 12.34);
    assertEquals("Reference Height", new Double(12.34), test.getReferenceHeight());
    assertEquals("Wind Height", new Double(12.34), test.getWindHeight());
    assertEquals("Temperature Average", new Double(12.34), test.getTempAverage());
    assertEquals("Temperature Amplitude", new Double(12.34), test.getTempAmplitude());
  }
}
