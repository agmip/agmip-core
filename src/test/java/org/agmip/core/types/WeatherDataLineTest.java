package org.agmip.core.types;

import java.util.HashMap;
import org.junit.Test;
import static org.junit.Assert.*;

public class WeatherDataLineTest {

  @Test
  public void blankWeatherDataLine(){
    WeatherDataLine test = new WeatherDataLine(new HashMap<String, Object>());
    assertEquals("Max Temperature", null, test.getTempMax());
  }

  @Test
  public void stdWeatherDataLine(){
    WeatherDataLine test = new WeatherDataLine(new HashMap<String, Object>(){{
      put("tmax", 12.34);
    }});
    assertEquals("Max Temperature", new Double(12.34), test.getTempMax());
    assertEquals("Min Temperature", null, test.getTempMin());
  }

  @Test
  public void extraWeatherDataLine(){
    WeatherDataLine test = new WeatherDataLine(new HashMap<String, Object>(){{
      put("tmax", 12.34);
      put("tmin", 12.34);
      put("extra_one", 12.34);
      put("extra_two", "HELLO");
    }});
    HashMap extra = test.getExtraData();
    assertEquals("Min Temperature", new Double(12.34), test.getTempMin());
    assertEquals("Max Temperature", new Double(12.34), test.getTempMax());
    assertEquals("Extra One", 12.34, extra.get("extra_one"));
    assertEquals("Extra Two", "HELLO", test.getExtraData().get("extra_two"));
  }

  @Test
  public void addHashMapToExtraData() {
    WeatherDataLine test = new WeatherDataLine(new HashMap<String, Object>());
    HashMap<String, Object> adder = new HashMap<String, Object>();
    adder.put("extra_one", new Double(12.34));
    adder.put("extra_two", "HELLO");
    test.setExtraData(adder);
    HashMap extra = test.getExtraData();
    assertEquals("Extra One", new Double(12.34), extra.get("extra_one"));
    assertEquals("Extra Two", "HELLO", extra.get("extra_two"));
  }
  
  @Test
  public void addItemToExtraData() {
    WeatherDataLine test = new WeatherDataLine(new HashMap<String, Object>());
    test.setExtraData("extra_one", 12.34);
    test.setExtraData("extra_two", "HELLO");
    HashMap extra = test.getExtraData();
    assertEquals("Min Temperature", null, test.getTempMin());
    assertEquals("Extra One", 12.34, extra.get("extra_one"));
    assertEquals("Extra Two", "HELLO", extra.get("extra_two"));
  }
}
