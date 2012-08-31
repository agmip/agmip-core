package org.agmip.core.types;

/**
 * The primary interface for translators to implement for output files.
 */

import java.util.Map;
import java.io.IOException;

public interface TranslatorOutput extends TranslatorIO {
    public void writeFile(String outputDirectory, Map data) throws IOException;
}
