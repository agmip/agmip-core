package org.agmip.translators.dssat;

/**
 *
 * @author Meng Zhang
 */
public class InitialConditions {

    /**
     * Initial residues measurement year
     * Unit or Type: date
     */
    private String icrdat = null;
    /**
     * Initial conditions measurement date
     * Unit or Type: date
     */
    private String icdat = null;
    /**
     * id
     * Unit or Type: 
     */
    private Double id = null;
    /**
     * Initial conditions level, link to TREATMENTS table
     * Unit or Type: number
     */
    private Double ic = null;
    /**
     * Initial conditions name
     * Unit or Type: text
     */
    private String ic_name = null;
    /**
     * Residue, crop code for previous crop
     * Unit or Type: code
     */
    private String icpcr = null;
    /**
     * Residue incorporation depth
     * Unit or Type: cm
     */
    private Double icrdp = null;
    /**
     * Residue incorporation percentage
     * Unit or Type: %
     */
    private Double icrip = null;
    /**
     * Residue above-ground weight
     * Unit or Type: kg/ha
     */
    private Double icrag = null;
    /**
     * Residue, above-ground, nitrogen concentration
     * Unit or Type: %
     */
    private Double icrn = null;
    /**
     * Residue, above-ground, phosphorus concentration
     * Unit or Type: %
     */
    private Double icrp = null;
    /**
     * Residue, above-ground, potassium concentration
     * Unit or Type: %
     */
    private Double icrk = null;
    /**
     * Residue, above-ground, lignin concentration
     * Unit or Type: %
     */
    private Double icrli = null;
    /**
     * Root weight from previous crop
     * Unit or Type: kg/ha
     */
    private Double icrt = null;
    /**
     * Nodule weight from previous crop
     * Unit or Type: kg/ha
     */
    private Double icnd = null;
    /**
     * Initial water content of entire profile
     * Unit or Type: cm
     */
    private Double icsw = null;
    /**
     * Initial water table depth
     * Unit or Type: cm
     */
    private Double icwt = null;
    /**
     * Initial profile inorganic nitrogen con
     * Unit or Type: kg/ha
     */
    private Double icin = null;
    /**
     * Rhizobia number (count)
     * Unit or Type: counts/cm3
     */
    private Double icrzc = null;
    /**
     * Rhizobia effectiveness on 0-1 scale
     * Unit or Type: number
     */
    private Double icrze = null;
    /**
     * Rhizobia nitrogen amount
     * Unit or Type: kg/ha
     */
    private Double icrzn = null;
}
