package org.agmip.core.types.weather;

/**
 * The primary interface that translators will interface with to
 * read and write Weather Files
 */

public interface WeatherFile {
  void readFile(String file, WeatherData data);
  void writeFile(String file, WeatherData data);
}
