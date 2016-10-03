package org.agmip.core.types;

import java.util.Map;

/**
 *
 * @author Meng Zhang
 */
public interface DividableOutputTranslator {
    public void writeFile(String filePath, Map input, int size);
}
