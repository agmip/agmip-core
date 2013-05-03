package org.agmip.logging;


import org.slf4j.Marker;
import org.slf4j.MarkerFactory;

public class AgmipMarkers {
    /**
     * TRANSLATE_MISSING_VALUE is to be used when a translator needs a value that
     * is missing in the base data.
     */
    public static final Marker TRANSLATE_MISSING_VALUE = MarkerFactory.getMarker("TRANSLATE_MISSING_VALUE");
}
