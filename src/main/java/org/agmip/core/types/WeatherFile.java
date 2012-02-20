package org.agmip.core.types;

/**
 * The primary interface that translators will interface with to
 * read and write Weather Files
 */

public interface WeatherFile {
  void readFile(String file);
  void writeFile(String file);
}
