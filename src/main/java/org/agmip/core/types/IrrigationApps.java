package org.agmip.translators.dssat;

/**
 *
 * @author Meng Zhang
 */
public class IrrigationApps {

    /**
     * Irrigation date
     * Unit or Type: date
     */
    private String idate = null;
    /**
     * Irrigation operation (e.g., furrow, sprinkler, drip…)
     * Unit or Type: code
     */
    private String irop = null;
    /**
     * Irrigation amount, depth of water
     * Unit or Type: mm
     */
    private Double irval = null;
    /**
     * Irrigation application depth (e.g., for depth to drip line)
     * Unit or Type: cm
     */
    private Double iradp = null;
    /**
     * Irrigation water nitrogen concentration
     * Unit or Type: %
     */
    private Double irnpc = null;
    /**
     * Bund height (e.g., for flooded rice)
     * Unit or Type: mm
     */
    private Double abund = null;
}
