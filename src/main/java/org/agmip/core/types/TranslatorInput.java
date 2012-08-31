package org.agmip.core.types;

/**
 * The primary interface for translators to implement for input files.
 */

import java.io.IOException;
import java.util.Map;

public interface TranslatorInput extends TranslatorIO {
    public Map readFile(String file) throws Exception;
}
