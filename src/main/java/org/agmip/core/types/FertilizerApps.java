package org.agmip.translators.dssat;

/**
 *
 * @author Meng Zhang
 */
public class FertilizerApps {

    /**
     * Fertilization date
     * Unit or Type: date
     */
    private String fedate = null;
    /**
     * Fertilizer material
     * Unit or Type: code
     */
    private String fecd = null;
    /**
     * Fertilizer application method
     * Unit or Type: code
     */
    private String feacd = null;
    /**
     * Fertilizer application depth
     * Unit or Type: cm
     */
    private Double fedep = null;
    /**
     * Nitrogen in applied fertilizer
     * Unit or Type: kg[N]/ha
     */
    private Double feamn = null;
    /**
     * Phosphorus in applied fertilizer
     * Unit or Type: kg[P]/ha
     */
    private Double feamp = null;
    /**
     * Potassium in applied fertilizer
     * Unit or Type: kg[K]/ha
     */
    private Double feamk = null;
    /**
     * Ca in applied fertilizer
     * Unit or Type: kg/ha
     */
    private Double feamc = null;
    /**
     * Other elements in applied fertilizer
     * Unit or Type: kg/ha
     */
    private Double feamo = null;
    /**
     * Fertilizer code for other elements (e.g., Mg for magnesium)
     * Unit or Type: code
     */
    private String feocd = null;
}
