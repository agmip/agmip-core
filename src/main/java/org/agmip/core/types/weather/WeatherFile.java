package org.agmip.core.types.weather;

/**
 * The primary interface that translators will interface with to
 * read and write Weather Files
 */
 
import org.agmip.core.types.AdvancedHashMap;

public interface WeatherFile {
  public AdvancedHashMap readFile(String file);
  public void writeFile(String file, AdvancedHashMap data);
}
