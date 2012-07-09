package org.agmip.core.types;

/**
 * The primary interface for translators to implement for output files.
 */

import java.util.Map;

public interface TranslatorOutput {
    public void writeFile(String file, Map data);
}
