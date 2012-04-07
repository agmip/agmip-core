package org.agmip.core.types;

/**
 * The primary interface for translators to implement for output files.
 */

import org.agmip.core.types.AdvancedHashMap;

public interface AgMIPOutputFile {
    public void writeFile(String file, AdvancedHashMap data);
}
