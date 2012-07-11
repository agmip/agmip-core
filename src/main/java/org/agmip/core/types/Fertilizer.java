package org.agmip.translators.dssat;

/**
 *
 * @author Meng Zhang
 */
public class Fertilizer {

    /**
     * Fertilizer level name
     * Unit or Type: text
     */
    private String fe_name = null;
    /**
     * Fertilizer, comments or explanations of a given treatment
     * Unit or Type: text
     */
    private String fe_notes = null;
    /**
     * Indicates whether or not fertilizer was applied (Y or N)
     * Unit or Type: code
     */
    private String fertilizer = null;
    /**
     * Nitrogen, total amount over season
     * Unit or Type: kg[N]/ha
     */
    private Double fen_tot = null;
    /**
     * Nitrogen applications, total number at end season
     * Unit or Type: number
     */
    private Double fen_no = null;
    /**
     * Phosphorus, total amount over season
     * Unit or Type: kg[P]/ha
     */
    private Double fep_tot = null;
    /**
     * Phosphorus applications, total number at end season
     * Unit or Type: number
     */
    private Double fep_no = null;
    /**
     * Potassium, total amount over season
     * Unit or Type: kg[K]/ha
     */
    private Double fek_tot = null;
    /**
     * Potassium applications, total number at end season
     * Unit or Type: number
     */
    private Double fek_no = null;
    /**
     * Total number of fertilizer applications over season
     * Unit or Type: number
     */
    private Double fe_no = null;
}
