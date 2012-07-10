package org.agmip.translators.dssat;

import java.util.ArrayList;

/**
 *
 * @author meng zhang
 */
public class Weather {
    private String wid;
    private String wst_id;
    private String wst_name;
    private String wst_loc_1;
    private String wst_loc_2;
    private String wst_loc_3;
    private String wst_lat ;
    private String wst_long ;
    private String wst_elev ;
    private String wst_source ;
    private String tav ;
    private String tamp ;
    private String temht ;
    private String wndht ;
    private String refht ;
    private String co2y ;
    private String co2a ;
    private String durn ;
    private String gsdu ;
    private String gsst ;
    private String start_yr ;
    private String tmxy ;
    private String tmny ;
    private String raiy ;
    private String sray ;
    private String anga ;
    private String bmth ;
    private String flaga ;
    private ArrayList<DailyWeather> daily;

    public static class DailyWeather {
        private String w_date ;
        private String wid ;
        private String wst_id ;
        private String year ;
        private String doy ;
        private String srad ;
        private String tmax ;
        private String tmin ;
        private String rain ;
        private String wind ;
        private String tdew ;
        private String co2d ;
        private String cldd ;
        private String dewp ;
        private String pard ;
        private String dtr ;
        private String sunh ;
        private String tdry ;
        private String evap ;
        private String twet ;
        private String dayd ;
        private String da3d ;
        private String twld ;
        private String tmen ;
        private String aco2 ;
        private String ts1d ;
        private String ts2d ;
        private String ts3d ;
        private String ts4d ;
        private String ts5d ;
        private String ts6d ;
        private String ts7d ;
        private String ts8d ;
        private String ts9d ;
        private String ts10d ;
        private String flagw ;
        private String tmxa ;
        private String tmna ;
        private String pred ;
        private String rhumd ;
        private String tavd ;
        private String tgad ;
        private String tdyd ;
        private String tgrd ;
        private String vprsd ;
    }
}
