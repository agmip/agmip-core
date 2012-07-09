package org.agmip.core.types;

/**
 * The primary interface for translators to implement for input files.
 */

import java.util.Map;

public interface TranslatorInput {
    public Map readFile(String file);
}
