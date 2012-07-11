package org.agmip.translators.dssat;

/**
 *
 * @author Meng Zhang
 */
public class TillageEvents {

    /**
     * Tillage date
     * Unit or Type: date
     */
    private String tdate = null;
    /**
     * Tillage operations, name of specific event
     * Unit or Type: text
     */
    private String ti_op_name = null;
    /**
     * Tillage operations order within a single day
     * Unit or Type: number
     */
    private Double tiord = null;
    /**
     * Tillage implement
     * Unit or Type: code
     */
    private String tiimp = null;
    /**
     * Tillage operations depth
     * Unit or Type: cm
     */
    private Double tidep = null;
    /**
     * Tillage operations mixing effectiveness
     * Unit or Type: %
     */
    private Double timix = null;
}
