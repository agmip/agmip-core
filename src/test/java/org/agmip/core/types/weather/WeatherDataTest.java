package org.agmip.core.types.weather;

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;
import org.agmip.core.types.*;
import org.agmip.core.types.weather.*;

public class WeatherDataTest {

  @Test
  public void blankWeatherData() {
    WeatherData test = new WeatherData(new PointLocation("AAAA", new Point(0.0, 0.0)));
    assertEquals("Temperature Average", null, test.weatherMetadata.get("tav"));
    assertEquals("Reference Height", new Double(1.1), test.weatherMetadata.getOr("refht", new Double(1.1)));
  }

  @Test
  public void partialWeatherData() {
    WeatherData test = new WeatherData(new PointLocation("AAAA", new Point(0.0, 0.0)),
                                               null, null, 12.34, null, null);
    assertEquals("Temperature Average", new Double(12.34), test.weatherMetadata.get("tav"));
    assertEquals("Reference Height", null, test.weatherMetadata.get("refht"));
  }

  @Test
  public void completeWeatherData() {
    WeatherData test = new WeatherData(new PointLocation("AAAA", new Point(0.0, 0.0)),
                                               12.34, 12.34, 12.34, 12.34, 12.34, new ArrayList());
    assertEquals("Reference Height", new Double(12.34), test.weatherMetadata.getOr("refht", new Double(43.21)));
    assertEquals("Wind Height", new Double(12.34), test.weatherMetadata.getOr("wndht", new Double(43.21)));
    assertEquals("Temperature Average", new Double(12.34), test.weatherMetadata.getOr("tav", new Double(43.21)));
    assertEquals("Temperature Amplitude", new Double(12.34), test.weatherMetadata.get("tamp"));
  }
}
