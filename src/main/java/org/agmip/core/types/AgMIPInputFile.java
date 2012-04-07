package org.agmip.core.types;

/**
 * The primary interface for translators to implement for input files.
 */

import org.agmip.core.types.AdvancedHashMap;

public interface AgMIPInputFile {
    public AdvancedHashMap readFile(String file);
}
