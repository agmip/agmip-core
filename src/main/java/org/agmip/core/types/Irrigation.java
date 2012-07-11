package org.agmip.translators.dssat;

/**
 *
 * @author Meng Zhang
 */
public class Irrigation {

    /**
     * id
     * Unit or Type: 
     */
    private Double id = null;
    /**
     * Irrigation level in treatment structure
     * Unit or Type: number
     */
    private Double ir = null;
    /**
     * Irrigation level name
     * Unit or Type: text
     */
    private String ir_name = null;
    /**
     * Irrigation, notes on irrigation application
     * Unit or Type: text
     */
    private String ir_notes = null;
    /**
     * Method for automatic applications
     * Unit or Type: code
     */
    private String iame = null;
    /**
     * Irrigation amount, automatic application
     * Unit or Type: mm
     */
    private Double iamt = null;
    /**
     * Irrigation application efficiency as fraction (0 to 1)
     * Unit or Type: unitless
     */
    private Double ireff = null;
    /**
     * Irrigation, growth stage, automatic appn
     * Unit or Type: code
     */
    private String irstg = null;
    /**
     * Irrigation management, reference soil depth for automatic application
     * Unit or Type: cm
     */
    private Double irmdp = null;
    /**
     * Irrigation threshold water content for automatic application
     * Unit or Type: %
     */
    private Double irthr = null;
    /**
     * Irrigation, ending % avail, automatic application
     * Unit or Type: %
     */
    private Double irept = null;
    /**
     * Indicates whether or not the field was irrigated
     * Unit or Type: code
     */
    private String irrig = null;
    /**
     * Irrigation, total amount over season
     * Unit or Type: mm
     */
    private Double ir_tot = null;
    /**
     * Irrigation applications, total number at end season
     * Unit or Type: number
     */
    private Double ir_no = null;
}
