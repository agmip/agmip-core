package org.agmip.core.types.weather;

import java.util.HashMap;
import org.junit.Test;
import static org.junit.Assert.*;
import org.agmip.core.types.*;
import org.agmip.core.types.weather.*;

public class DailyWeatherDataLineTest {

  @Test
  public void blankDailyWeatherDataLine(){
    DailyWeatherDataLine test = new DailyWeatherDataLine(new HashMap<String, Object>());
    assertEquals("Max Temperature", null, test.getTempMax());
  }

  @Test
  public void stdDailyWeatherDataLine(){
    HashMap <String, Object> data = new HashMap<String,Object>();
    data.put("tmax", 12.34);
    DailyWeatherDataLine test = new DailyWeatherDataLine(data);
    assertEquals("Max Temperature", new Double(12.34), test.getTempMax());
    assertEquals("Min Temperature", null, test.getTempMin());
  }

  @Test
  public void extraDailyWeatherDataLine(){
    HashMap<String, Object> data = new HashMap<String, Object>();
    data.put("tmax", 12.34);
    data.put("tmin", 12.34);
    data.put("extra_one", 12.34);
    data.put("extra_two", "HELLO");
    DailyWeatherDataLine test = new DailyWeatherDataLine(data);
    assertEquals("Min Temperature", new Double(12.34), test.getTempMin());
    assertEquals("Max Temperature", new Double(12.34), test.getTempMax());
    assertEquals("Extra One", 12.34, test.get("extra_one"));
    assertEquals("Extra Two", "HELLO", test.get("extra_two"));
  }

  @Test
  public void addHashMapToExtraData() {
    DailyWeatherDataLine test = new DailyWeatherDataLine(new HashMap<String, Object>());
    HashMap<String, Object> adder = new HashMap<String, Object>();
    adder.put("extra_one", new Double(12.34));
    adder.put("extra_two", "HELLO");
    test.set(adder);
    assertEquals("Extra One", new Double(12.34), test.get("extra_one"));
    assertEquals("Extra Two", "HELLO", test.get("extra_two"));
  }

  @Test
  public void addItemToExtraData() {
    DailyWeatherDataLine test = new DailyWeatherDataLine(new HashMap<String, Object>());
    test.set("extra_one", 12.34);
    test.set("extra_two", "HELLO");
    assertEquals("Min Temperature", null, test.getTempMin());
    assertEquals("Extra One", 12.34, test.get("extra_one"));
    assertEquals("Extra Two", "HELLO", test.get("extra_two"));
  }
}
