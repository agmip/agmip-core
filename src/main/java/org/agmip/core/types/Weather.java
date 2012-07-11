package org.agmip.core.types;

import java.util.ArrayList;

/**
 * TODO clean this out with the comments
 *
 * Regex: [Find] public void (\w*)\(Double (\w*)\)( {\n.*\n.*})
 * [Replace] public void \1\(Double \2\)\3\n\npublic void \1\(String \2\) {\nif\( \2\.equals\(""\) \) \{\nthis\.\2 = null;\n} else {\n try \{\n this\.\2 = Double\.parseDouble\(\2\);\n\} catch \(NumberFormatException _ex\) \{\nthis\.\2 = null;\n\}\n\}\n\}\n
 *
 * @author meng zhang
 */
public class Weather {
    //    private String wid = null; Don't need an id on the class
    private String wst_id = null;
    private String wst_name = null;
    private String wst_loc_1 = null;
    private String wst_loc_2 = null;
    private String wst_loc_3 = null;
    private Double wst_lat = null;
    private Double wst_long = null;
    private Double wst_elev = null;
    private String wst_source = null;
    private Double tav = null;
    private Double tamp = null;
    private Double temht = null;
    private Double wndht = null;
    private Double refht = null;
    private Double co2y = null;
    private Double co2a = null;
    private Integer durn = null;
    private Integer gsdu = null;
    private Integer gsst = null;
    private Integer start_yr = null;
    private Double tmxy = null;
    private Double tmny = null;
    private Double raiy = null;
    private Double sray = null;
    private Double anga = null;
    private Double bmth = null;
    private String flaga = null;
    private ArrayList<DailyWeather> dailyWeather;


    /**
     * @return the wst_id
     */
    public String getWst_id() {
        return wst_id;
    }



    /**
     * @param wst_id the wst_id to set
     */
    public void setWst_id(String wst_id) {
        this.wst_id = wst_id;
    }



    /**
     * @return the wst_name
     */
    public String getWst_name() {
        return wst_name;
    }



    /**
     * @param wst_name the wst_name to set
     */
    public void setWst_name(String wst_name) {
        this.wst_name = wst_name;
    }



    /**
     * @return the wst_loc_1
     */
    public String getWst_loc_1() {
        return wst_loc_1;
    }



    /**
     * @param wst_loc_1 the wst_loc_1 to set
     */
    public void setWst_loc_1(String wst_loc_1) {
        this.wst_loc_1 = wst_loc_1;
    }



    /**
     * @return the wst_loc_2
     */
    public String getWst_loc_2() {
        return wst_loc_2;
    }



    /**
     * @param wst_loc_2 the wst_loc_2 to set
     */
    public void setWst_loc_2(String wst_loc_2) {
        this.wst_loc_2 = wst_loc_2;
    }



    /**
     * @return the wst_loc_3
     */
    public String getWst_loc_3() {
        return wst_loc_3;
    }



    /**
     * @param wst_loc_3 the wst_loc_3 to set
     */
    public void setWst_loc_3(String wst_loc_3) {
        this.wst_loc_3 = wst_loc_3;
    }



    /**
     * @return the wst_lat
     */
    public Double getWst_lat() {
        return wst_lat;
    }



    /**
     * @param wst_lat the wst_lat to set
     */
    public void setWst_lat(Double wst_lat) {
        this.wst_lat = wst_lat;
    }

    public void setWst_lat(String wst_lat) {
        if( wst_lat.equals("") ) {
            this.wst_lat = null;
        } else {
            try {
                this.wst_lat = Double.parseDouble(wst_lat);
            } catch (NumberFormatException _ex) {
                this.wst_lat = null;
            }
        }
    }




    /**
     * @return the wst_long
     */
    public Double getWst_long() {
        return wst_long;
    }



    /**
     * @param wst_long the wst_long to set
     */
    public void setWst_long(Double wst_long) {
        this.wst_long = wst_long;
    }

    public void setWst_long(String wst_long) {
        if( wst_long.equals("") ) {
            this.wst_long = null;
        } else {
            try {
                this.wst_long = Double.parseDouble(wst_long);
            } catch (NumberFormatException _ex) {
                this.wst_long = null;
            }
        }
    }




    /**
     * @return the wst_elev
     */
    public Double getWst_elev() {
        return wst_elev;
    }



    /**
     * @param wst_elev the wst_elev to set
     */
    public void setWst_elev(Double wst_elev) {
        this.wst_elev = wst_elev;
    }

    public void setWst_elev(String wst_elev) {
        if( wst_elev.equals("") ) {
            this.wst_elev = null;
        } else {
            try {
                this.wst_elev = Double.parseDouble(wst_elev);
            } catch (NumberFormatException _ex) {
                this.wst_elev = null;
            }
        }
    }




    /**
     * @return the wst_source
     */
    public String getWst_source() {
        return wst_source;
    }



    /**
     * @param wst_source the wst_source to set
     */
    public void setWst_source(String wst_source) {
        this.wst_source = wst_source;
    }



    /**
     * @return the tav
     */
    public Double getTav() {
        return tav;
    }



    /**
     * @param tav the tav to set
     */
    public void setTav(Double tav) {
        this.tav = tav;
    }

    public void setTav(String tav) {
        if( tav.equals("") ) {
            this.tav = null;
        } else {
            try {
                this.tav = Double.parseDouble(tav);
            } catch (NumberFormatException _ex) {
                this.tav = null;
            }
        }
    }




    /**
     * @return the tamp
     */
    public Double getTamp() {
        return tamp;
    }



    /**
     * @param tamp the tamp to set
     */
    public void setTamp(Double tamp) {
        this.tamp = tamp;
    }

    public void setTamp(String tamp) {
        if( tamp.equals("") ) {
            this.tamp = null;
        } else {
            try {
                this.tamp = Double.parseDouble(tamp);
            } catch (NumberFormatException _ex) {
                this.tamp = null;
            }
        }
    }




    /**
     * @return the temht
     */
    public Double getTemht() {
        return temht;
    }



    /**
     * @param temht the temht to set
     */
    public void setTemht(Double temht) {
        this.temht = temht;
    }

    public void setTemht(String temht) {
        if( temht.equals("") ) {
            this.temht = null;
        } else {
            try {
                this.temht = Double.parseDouble(temht);
            } catch (NumberFormatException _ex) {
                this.temht = null;
            }
        }
    }




    /**
     * @return the wndht
     */
    public Double getWndht() {
        return wndht;
    }



    /**
     * @param wndht the wndht to set
     */
    public void setWndht(Double wndht) {
        this.wndht = wndht;
    }

    public void setWndht(String wndht) {
        if( wndht.equals("") ) {
            this.wndht = null;
        } else {
            try {
                this.wndht = Double.parseDouble(wndht);
            } catch (NumberFormatException _ex) {
                this.wndht = null;
            }
        }
    }




    /**
     * @return the refht
     */
    public Double getRefht() {
        return refht;
    }



    /**
     * @param refht the refht to set
     */
    public void setRefht(Double refht) {
        this.refht = refht;
    }

    public void setRefht(String refht) {
        if( refht.equals("") ) {
            this.refht = null;
        } else {
            try {
                this.refht = Double.parseDouble(refht);
            } catch (NumberFormatException _ex) {
                this.refht = null;
            }
        }
    }




    /**
     * @return the co2y
     */
    public Double getCo2y() {
        return co2y;
    }



    /**
     * @param co2y the co2y to set
     */
    public void setCo2y(Double co2y) {
        this.co2y = co2y;
    }

    public void setCo2y(String co2y) {
        if( co2y.equals("") ) {
            this.co2y = null;
        } else {
            try {
                this.co2y = Double.parseDouble(co2y);
            } catch (NumberFormatException _ex) {
                this.co2y = null;
            }
        }
    }




    /**
     * @return the co2a
     */
    public Double getCo2a() {
        return co2a;
    }



    /**
     * @param co2a the co2a to set
     */
    public void setCo2a(Double co2a) {
        this.co2a = co2a;
    }

    public void setCo2a(String co2a) {
        if( co2a.equals("") ) {
            this.co2a = null;
        } else {
            try {
                this.co2a = Double.parseDouble(co2a);
            } catch (NumberFormatException _ex) {
                this.co2a = null;
            }
        }
    }




    /**
     * @return the durn
     */
    public Integer getDurn() {
        return durn;
    }



    /**
     * @param durn the durn to set
     */
    public void setDurn(Integer durn) {
        this.durn = durn;
    }

    public void setDurn(String durn) {
        if( durn.equals("") ) {
            this.durn = null;
        } else {
            try {
                this.durn = Integer.parseInt(durn);
            } catch (NumberFormatException _ex) {
                this.durn = null;
            }
        }
    }




    /**
     * @return the gsdu
     */
    public Integer getGsdu() {
        return gsdu;
    }



    /**
     * @param gsdu the gsdu to set
     */
    public void setGsdu(Integer gsdu) {
        this.gsdu = gsdu;
    }

    public void setGsdu(String gsdu) {
        if( gsdu.equals("") ) {
            this.gsdu = null;
        } else {
            try {
                this.gsdu = Integer.parseInt(gsdu);
            } catch (NumberFormatException _ex) {
                this.gsdu = null;
            }
        }
    }




    /**
     * @return the gsst
     */
    public Integer getGsst() {
        return gsst;
    }



    /**
     * @param gsst the gsst to set
     */
    public void setGsst(Integer gsst) {
        this.gsst = gsst;
    }

    public void setGsst(String gsst) {
        if( gsst.equals("") ) {
            this.gsst = null;
        } else {
            try {
                this.gsst = Integer.parseInt(gsst);
            } catch (NumberFormatException _ex) {
                this.gsst = null;
            }
        }
    }




    /**
     * @return the start_yr
     */
    public Integer getStart_yr() {
        return start_yr;
    }



    /**
     * @param start_yr the start_yr to set
     */
    public void setStart_yr(Integer start_yr) {
        this.start_yr = start_yr;
    }

    public void setStart_yr(String start_yr) {
        if( start_yr.equals("") ) {
            this.start_yr = null;
        } else {
            try {
                this.start_yr = Integer.parseInt(start_yr);
            } catch (NumberFormatException _ex) {
                this.start_yr = null;
            }
        }
    }




    /**
     * @return the tmxy
     */
    public Double getTmxy() {
        return tmxy;
    }



    /**
     * @param tmxy the tmxy to set
     */
    public void setTmxy(Double tmxy) {
        this.tmxy = tmxy;
    }

    public void setTmxy(String tmxy) {
        if( tmxy.equals("") ) {
            this.tmxy = null;
        } else {
            try {
                this.tmxy = Double.parseDouble(tmxy);
            } catch (NumberFormatException _ex) {
                this.tmxy = null;
            }
        }
    }




    /**
     * @return the tmny
     */
    public Double getTmny() {
        return tmny;
    }



    /**
     * @param tmny the tmny to set
     */
    public void setTmny(Double tmny) {
        this.tmny = tmny;
    }

    public void setTmny(String tmny) {
        if( tmny.equals("") ) {
            this.tmny = null;
        } else {
            try {
                this.tmny = Double.parseDouble(tmny);
            } catch (NumberFormatException _ex) {
                this.tmny = null;
            }
        }
    }




    /**
     * @return the raiy
     */
    public Double getRaiy() {
        return raiy;
    }



    /**
     * @param raiy the raiy to set
     */
    public void setRaiy(Double raiy) {
        this.raiy = raiy;
    }

    public void setRaiy(String raiy) {
        if( raiy.equals("") ) {
            this.raiy = null;
        } else {
            try {
                this.raiy = Double.parseDouble(raiy);
            } catch (NumberFormatException _ex) {
                this.raiy = null;
            }
        }
    }




    /**
     * @return the sray
     */
    public Double getSray() {
        return sray;
    }



    /**
     * @param sray the sray to set
     */
    public void setSray(Double sray) {
        this.sray = sray;
    }

    public void setSray(String sray) {
        if( sray.equals("") ) {
            this.sray = null;
        } else {
            try {
                this.sray = Double.parseDouble(sray);
            } catch (NumberFormatException _ex) {
                this.sray = null;
            }
        }
    }




    /**
     * @return the anga
     */
    public Double getAnga() {
        return anga;
    }



    /**
     * @param anga the anga to set
     */
    public void setAnga(Double anga) {
        this.anga = anga;
    }

    public void setAnga(String anga) {
        if( anga.equals("") ) {
            this.anga = null;
        } else {
            try {
                this.anga = Double.parseDouble(anga);
            } catch (NumberFormatException _ex) {
                this.anga = null;
            }
        }
    }




    /**
     * @return the bmth
     */
    public Double getBmth() {
        return bmth;
    }



    /**
     * @param bmth the bmth to set
     */
    public void setBmth(Double bmth) {
        this.bmth = bmth;
    }

    public void setBmth(String bmth) {
        if( bmth.equals("") ) {
            this.bmth = null;
        } else {
            try {
                this.bmth = Double.parseDouble(bmth);
            } catch (NumberFormatException _ex) {
                this.bmth = null;
            }
        }
    }




    /**
     * @return the flaga
     */
    public String getFlaga() {
        return flaga;
    }



    /**
     * @param flaga the flaga to set
     */
    public void setFlaga(String flaga) {
        this.flaga = flaga;
    }



    /**
     * @return the daily
     */
    public ArrayList<DailyWeather> getDailyWeather() {
        return dailyWeather;
    }



    /**
     * @param daily the daily to set
     */
    public void setDailyWeather(ArrayList<DailyWeather> daily) {
        this.dailyWeather = dailyWeather;
    }







    public static class DailyWeather {
        private String w_date = null;
        //        private long wid = null; don't need an id on this class
        private String wst_id = null;
        //        private Integer year = null;
        //        private Integer doy = null;
        private Double srad = null;
        private Double tmax = null;
        private Double tmin = null;
        private Double rain = null;
        private Double wind = null;
        private Double tdew = null;
        private Double co2d = null;
        private Double cldd = null;
        private Double dewp = null;
        private Double pard = null;
        private Double dtr = null;
        private Double sunh = null;
        private Double tdry = null;
        private Double evap = null;
        private Double twet = null;
        private Double dayd = null;
        private Double da3d = null;
        private Double twld = null;
        private Double tmen = null;
        private Double aco2 = null;
        private Integer ts1d = null;
        private Integer ts2d = null;
        private Integer ts3d = null;
        private Integer ts4d = null;
        private Integer ts5d = null;
        private Integer ts6d = null;
        private Integer ts7d = null;
        private Integer ts8d = null;
        private Integer ts9d = null;
        private Integer ts10d = null;
        private String flagw = null;
        private Double tmxa = null;
        private Double tmna = null;
        private Double pred = null;
        private Double rhumd = null;
        private Double tavd = null;
        private Double tgad = null;
        private Double tdyd = null;
        private Double tgrd = null;
        private Double vprsd = null;
        /**
         * @return the w_date
         */
        public String getW_date() {
            return w_date;
        }
        /**
         * @param w_date the w_date to set
         */
        public void setW_date(String w_date) {
            this.w_date = w_date;
        }
        /**
         * @return the wst_id
         */
        public String getWst_id() {
            return wst_id;
        }
        /**
         * @param wst_id the wst_id to set
         */
        public void setWst_id(String wst_id) {
            this.wst_id = wst_id;
        }
        /**
         * @return the srad
         */
        public Double getSrad() {
            return srad;
        }
        /**
         * @param srad the srad to set
         */
        public void setSrad(Double srad) {
            this.srad = srad;
        }

        public void setSrad(String srad) {
            if( srad.equals("") ) {
                this.srad = null;
            } else {
                try {
                    this.srad = Double.parseDouble(srad);
                } catch(NumberFormatException ex) {
                    this.srad = null;
                }
            }
        }
        /**
         * @return the tmax
         */
        public Double getTmax() {
            return tmax;
        }
        /**
         * @param tmax the tmax to set
         */
        public void setTmax(Double tmax) {
            this.tmax = tmax;
        }

        public void setTmax(String tmax) {
            if( tmax.equals("") ) {
                this.tmax = null;
            } else {
                try {
                    this.tmax = Double.parseDouble(tmax);
                } catch (NumberFormatException _ex) {
                    this.tmax = null;
                }
            }
        }

        /**
         * @return the tmin
         */
        public Double getTmin() {
            return tmin;
        }
        /**
         * @param tmin the tmin to set
         */
        public void setTmin(Double tmin) {
            this.tmin = tmin;
        }

        public void setTmin(String tmin) {
            if( tmin.equals("") ) {
                this.tmin = null;
            } else {
                try {
                    this.tmin = Double.parseDouble(tmin);
                } catch (NumberFormatException _ex) {
                    this.tmin = null;
                }
            }
        }

        /**
         * @return the rain
         */
        public Double getRain() {
            return rain;
        }
        /**
         * @param rain the rain to set
         */
        public void setRain(Double rain) {
            this.rain = rain;
        }

        public void setRain(String rain) {
            if( rain.equals("") ) {
                this.rain = null;
            } else {
                try {
                    this.rain = Double.parseDouble(rain);
                } catch (NumberFormatException _ex) {
                    this.rain = null;
                }
            }
        }

        /**
         * @return the wind
         */
        public Double getWind() {
            return wind;
        }
        /**
         * @param wind the wind to set
         */
        public void setWind(Double wind) {
            this.wind = wind;
        }

        public void setWind(String wind) {
            if( wind.equals("") ) {
                this.wind = null;
            } else {
                try {
                    this.wind = Double.parseDouble(wind);
                } catch (NumberFormatException _ex) {
                    this.wind = null;
                }
            }
        }

        /**
         * @return the tdew
         */
        public Double getTdew() {
            return tdew;
        }
        /**
         * @param tdew the tdew to set
         */
        public void setTdew(Double tdew) {
            this.tdew = tdew;
        }

        public void setTdew(String tdew) {
            if( tdew.equals("") ) {
                this.tdew = null;
            } else {
                try {
                    this.tdew = Double.parseDouble(tdew);
                } catch (NumberFormatException _ex) {
                    this.tdew = null;
                }
            }
        }

        /**
         * @return the co2d
         */
        public Double getCo2d() {
            return co2d;
        }
        /**
         * @param co2d the co2d to set
         */
        public void setCo2d(Double co2d) {
            this.co2d = co2d;
        }

        public void setCo2d(String co2d) {
            if( co2d.equals("") ) {
                this.co2d = null;
            } else {
                try {
                    this.co2d = Double.parseDouble(co2d);
                } catch (NumberFormatException _ex) {
                    this.co2d = null;
                }
            }
        }

        /**
         * @return the cldd
         */
        public Double getCldd() {
            return cldd;
        }
        /**
         * @param cldd the cldd to set
         */
        public void setCldd(Double cldd) {
            this.cldd = cldd;
        }

        public void setCldd(String cldd) {
            if( cldd.equals("") ) {
                this.cldd = null;
            } else {
                try {
                    this.cldd = Double.parseDouble(cldd);
                } catch (NumberFormatException _ex) {
                    this.cldd = null;
                }
            }
        }

        /**
         * @return the dewp
         */
        public Double getDewp() {
            return dewp;
        }
        /**
         * @param dewp the dewp to set
         */
        public void setDewp(Double dewp) {
            this.dewp = dewp;
        }

        public void setDewp(String dewp) {
            if( dewp.equals("") ) {
                this.dewp = null;
            } else {
                try {
                    this.dewp = Double.parseDouble(dewp);
                } catch (NumberFormatException _ex) {
                    this.dewp = null;
                }
            }
        }

        /**
         * @return the pard
         */
        public Double getPard() {
            return pard;
        }
        /**
         * @param pard the pard to set
         */
        public void setPard(Double pard) {
            this.pard = pard;
        }

        public void setPard(String pard) {
            if( pard.equals("") ) {
                this.pard = null;
            } else {
                try {
                    this.pard = Double.parseDouble(pard);
                } catch (NumberFormatException _ex) {
                    this.pard = null;
                }
            }
        }

        /**
         * @return the dtr
         */
        public Double getDtr() {
            return dtr;
        }
        /**
         * @param dtr the dtr to set
         */
        public void setDtr(Double dtr) {
            this.dtr = dtr;
        }

        public void setDtr(String dtr) {
            if( dtr.equals("") ) {
                this.dtr = null;
            } else {
                try {
                    this.dtr = Double.parseDouble(dtr);
                } catch (NumberFormatException _ex) {
                    this.dtr = null;
                }
            }
        }

        /**
         * @return the sunh
         */
        public Double getSunh() {
            return sunh;
        }
        /**
         * @param sunh the sunh to set
         */
        public void setSunh(Double sunh) {
            this.sunh = sunh;
        }

        public void setSunh(String sunh) {
            if( sunh.equals("") ) {
                this.sunh = null;
            } else {
                try {
                    this.sunh = Double.parseDouble(sunh);
                } catch (NumberFormatException _ex) {
                    this.sunh = null;
                }
            }
        }

        /**
         * @return the tdry
         */
        public Double getTdry() {
            return tdry;
        }
        /**
         * @param tdry the tdry to set
         */
        public void setTdry(Double tdry) {
            this.tdry = tdry;
        }

        public void setTdry(String tdry) {
            if( tdry.equals("") ) {
                this.tdry = null;
            } else {
                try {
                    this.tdry = Double.parseDouble(tdry);
                } catch (NumberFormatException _ex) {
                    this.tdry = null;
                }
            }
        }

        /**
         * @return the evap
         */
        public Double getEvap() {
            return evap;
        }
        /**
         * @param evap the evap to set
         */
        public void setEvap(Double evap) {
            this.evap = evap;
        }

        public void setEvap(String evap) {
            if( evap.equals("") ) {
                this.evap = null;
            } else {
                try {
                    this.evap = Double.parseDouble(evap);
                } catch (NumberFormatException _ex) {
                    this.evap = null;
                }
            }
        }

        /**
         * @return the twet
         */
        public Double getTwet() {
            return twet;
        }
        /**
         * @param twet the twet to set
         */
        public void setTwet(Double twet) {
            this.twet = twet;
        }

        public void setTwet(String twet) {
            if( twet.equals("") ) {
                this.twet = null;
            } else {
                try {
                    this.twet = Double.parseDouble(twet);
                } catch (NumberFormatException _ex) {
                    this.twet = null;
                }
            }
        }

        /**
         * @return the dayd
         */
        public Double getDayd() {
            return dayd;
        }
        /**
         * @param dayd the dayd to set
         */
        public void setDayd(Double dayd) {
            this.dayd = dayd;
        }

        public void setDayd(String dayd) {
            if( dayd.equals("") ) {
                this.dayd = null;
            } else {
                try {
                    this.dayd = Double.parseDouble(dayd);
                } catch (NumberFormatException _ex) {
                    this.dayd = null;
                }
            }
        }

        /**
         * @return the da3d
         */
        public Double getDa3d() {
            return da3d;
        }
        /**
         * @param da3d the da3d to set
         */
        public void setDa3d(Double da3d) {
            this.da3d = da3d;
        }

        public void setDa3d(String da3d) {
            if( da3d.equals("") ) {
                this.da3d = null;
            } else {
                try {
                    this.da3d = Double.parseDouble(da3d);
                } catch (NumberFormatException _ex) {
                    this.da3d = null;
                }
            }
        }

        /**
         * @return the twld
         */
        public Double getTwld() {
            return twld;
        }
        /**
         * @param twld the twld to set
         */
        public void setTwld(Double twld) {
            this.twld = twld;
        }

        public void setTwld(String twld) {
            if( twld.equals("") ) {
                this.twld = null;
            } else {
                try {
                    this.twld = Double.parseDouble(twld);
                } catch (NumberFormatException _ex) {
                    this.twld = null;
                }
            }
        }

        /**
         * @return the tmen
         */
        public Double getTmen() {
            return tmen;
        }
        /**
         * @param tmen the tmen to set
         */
        public void setTmen(Double tmen) {
            this.tmen = tmen;
        }

        public void setTmen(String tmen) {
            if( tmen.equals("") ) {
                this.tmen = null;
            } else {
                try {
                    this.tmen = Double.parseDouble(tmen);
                } catch (NumberFormatException _ex) {
                    this.tmen = null;
                }
            }
        }

        /**
         * @return the aco2
         */
        public Double getAco2() {
            return aco2;
        }
        /**
         * @param aco2 the aco2 to set
         */
        public void setAco2(Double aco2) {
            this.aco2 = aco2;
        }

        public void setAco2(String aco2) {
            if( aco2.equals("") ) {
                this.aco2 = null;
            } else {
                try {
                    this.aco2 = Double.parseDouble(aco2);
                } catch (NumberFormatException _ex) {
                    this.aco2 = null;
                }
            }
        }

        /**
         * @return the ts1d
         */
        public Integer getTs1d() {
            return ts1d;
        }
        /**
         * @param ts1d the ts1d to set
         */
        public void setTs1d(Integer ts1d) {
            this.ts1d = ts1d;
        }

        public void setTs1d(String ts1d) {
            if( ts1d.equals("") ) {
                this.ts1d = null;
            } else {
                try {
                    this.ts1d = Integer.parseInt(ts1d);
                } catch (NumberFormatException _ex) {
                    this.ts1d = null;
                }
            }
        }

        /**
         * @return the ts2d
         */
        public Integer getTs2d() {
            return ts2d;
        }
        /**
         * @param ts2d the ts2d to set
         */
        public void setTs2d(Integer ts2d) {
            this.ts2d = ts2d;
        }

        public void setTs2d(String ts2d) {
            if( ts2d.equals("") ) {
                this.ts2d = null;
            } else {
                try {
                    this.ts2d = Integer.parseInt(ts2d);
                } catch (NumberFormatException _ex) {
                    this.ts2d = null;
                }
            }
        }

        /**
         * @return the ts3d
         */
        public Integer getTs3d() {
            return ts3d;
        }
        /**
         * @param ts3d the ts3d to set
         */
        public void setTs3d(Integer ts3d) {
            this.ts3d = ts3d;
        }

        public void setTs3d(String ts3d) {
            if( ts3d.equals("") ) {
                this.ts3d = null;
            } else {
                try {
                    this.ts3d = Integer.parseInt(ts3d);
                } catch (NumberFormatException _ex) {
                    this.ts3d = null;
                }
            }
        }

        /**
         * @return the ts4d
         */
        public Integer getTs4d() {
            return ts4d;
        }
        /**
         * @param ts4d the ts4d to set
         */
        public void setTs4d(Integer ts4d) {
            this.ts4d = ts4d;
        }

        public void setTs4d(String ts4d) {
            if( ts4d.equals("") ) {
                this.ts4d = null;
            } else {
                try {
                    this.ts4d = Integer.parseInt(ts4d);
                } catch (NumberFormatException _ex) {
                    this.ts4d = null;
                }
            }
        }

        /**
         * @return the ts5d
         */
        public Integer getTs5d() {
            return ts5d;
        }
        /**
         * @param ts5d the ts5d to set
         */
        public void setTs5d(Integer ts5d) {
            this.ts5d = ts5d;
        }

        public void setTs5d(String ts5d) {
            if( ts5d.equals("") ) {
                this.ts5d = null;
            } else {
                try {
                    this.ts5d = Integer.parseInt(ts5d);
                } catch (NumberFormatException _ex) {
                    this.ts5d = null;
                }
            }
        }

        /**
         * @return the ts6d
         */
        public Integer getTs6d() {
            return ts6d;
        }
        /**
         * @param ts6d the ts6d to set
         */
        public void setTs6d(Integer ts6d) {
            this.ts6d = ts6d;
        }

        public void setTs6d(String ts6d) {
            if( ts6d.equals("") ) {
                this.ts6d = null;
            } else {
                try {
                    this.ts6d = Integer.parseInt(ts6d);
                } catch (NumberFormatException _ex) {
                    this.ts6d = null;
                }
            }
        }

        /**
         * @return the ts7d
         */
        public Integer getTs7d() {
            return ts7d;
        }
        /**
         * @param ts7d the ts7d to set
         */
        public void setTs7d(Integer ts7d) {
            this.ts7d = ts7d;
        }

        public void setTs7d(String ts7d) {
            if( ts7d.equals("") ) {
                this.ts7d = null;
            } else {
                try {
                    this.ts7d = Integer.parseInt(ts7d);
                } catch (NumberFormatException _ex) {
                    this.ts7d = null;
                }
            }
        }

        /**
         * @return the ts8d
         */
        public Integer getTs8d() {
            return ts8d;
        }
        /**
         * @param ts8d the ts8d to set
         */
        public void setTs8d(Integer ts8d) {
            this.ts8d = ts8d;
        }

        public void setTs8d(String ts8d) {
            if( ts8d.equals("") ) {
                this.ts8d = null;
            } else {
                try {
                    this.ts8d = Integer.parseInt(ts8d);
                } catch (NumberFormatException _ex) {
                    this.ts8d = null;
                }
            }
        }

        /**
         * @return the ts9d
         */
        public Integer getTs9d() {
            return ts9d;
        }
        /**
         * @param ts9d the ts9d to set
         */
        public void setTs9d(Integer ts9d) {
            this.ts9d = ts9d;
        }

        public void setTs9d(String ts9d) {
            if( ts9d.equals("") ) {
                this.ts9d = null;
            } else {
                try {
                    this.ts9d = Integer.parseInt(ts9d);
                } catch (NumberFormatException _ex) {
                    this.ts9d = null;
                }
            }
        }

        /**
         * @return the ts10d
         */
        public Integer getTs10d() {
            return ts10d;
        }
        /**
         * @param ts10d the ts10d to set
         */
        public void setTs10d(Integer ts10d) {
            this.ts10d = ts10d;
        }

        public void setTs10d(String ts10d) {
            if( ts10d.equals("") ) {
                this.ts10d = null;
            } else {
                try {
                    this.ts10d = Integer.parseInt(ts10d);
                } catch (NumberFormatException _ex) {
                    this.ts10d = null;
                }
            }
        }

        /**
         * @return the flagw
         */
        public String getFlagw() {
            return flagw;
        }
        /**
         * @param flagw the flagw to set
         */
        public void setFlagw(String flagw) {
            this.flagw = flagw;
        }
        /**
         * @return the tmxa
         */
        public Double getTmxa() {
            return tmxa;
        }
        /**
         * @param tmxa the tmxa to set
         */
        public void setTmxa(Double tmxa) {
            this.tmxa = tmxa;
        }

        public void setTmxa(String tmxa) {
            if( tmxa.equals("") ) {
                this.tmxa = null;
            } else {
                try {
                    this.tmxa = Double.parseDouble(tmxa);
                } catch (NumberFormatException _ex) {
                    this.tmxa = null;
                }
            }
        }

        /**
         * @return the tmna
         */
        public Double getTmna() {
            return tmna;
        }
        /**
         * @param tmna the tmna to set
         */
        public void setTmna(Double tmna) {
            this.tmna = tmna;
        }

        public void setTmna(String tmna) {
            if( tmna.equals("") ) {
                this.tmna = null;
            } else {
                try {
                    this.tmna = Double.parseDouble(tmna);
                } catch (NumberFormatException _ex) {
                    this.tmna = null;
                }
            }
        }

        /**
         * @return the pred
         */
        public Double getPred() {
            return pred;
        }
        /**
         * @param pred the pred to set
         */
        public void setPred(Double pred) {
            this.pred = pred;
        }

        public void setPred(String pred) {
            if( pred.equals("") ) {
                this.pred = null;
            } else {
                try {
                    this.pred = Double.parseDouble(pred);
                } catch (NumberFormatException _ex) {
                    this.pred = null;
                }
            }
        }

        /**
         * @return the rhumd
         */
        public Double getRhumd() {
            return rhumd;
        }
        /**
         * @param rhumd the rhumd to set
         */
        public void setRhumd(Double rhumd) {
            this.rhumd = rhumd;
        }

        public void setRhumd(String rhumd) {
            if( rhumd.equals("") ) {
                this.rhumd = null;
            } else {
                try {
                    this.rhumd = Double.parseDouble(rhumd);
                } catch (NumberFormatException _ex) {
                    this.rhumd = null;
                }
            }
        }

        /**
         * @return the tavd
         */
        public Double getTavd() {
            return tavd;
        }
        /**
         * @param tavd the tavd to set
         */
        public void setTavd(Double tavd) {
            this.tavd = tavd;
        }

        public void setTavd(String tavd) {
            if( tavd.equals("") ) {
                this.tavd = null;
            } else {
                try {
                    this.tavd = Double.parseDouble(tavd);
                } catch (NumberFormatException _ex) {
                    this.tavd = null;
                }
            }
        }

        /**
         * @return the tgad
         */
        public Double getTgad() {
            return tgad;
        }
        /**
         * @param tgad the tgad to set
         */
        public void setTgad(Double tgad) {
            this.tgad = tgad;
        }

        public void setTgad(String tgad) {
            if( tgad.equals("") ) {
                this.tgad = null;
            } else {
                try {
                    this.tgad = Double.parseDouble(tgad);
                } catch (NumberFormatException _ex) {
                    this.tgad = null;
                }
            }
        }

        /**
         * @return the tdyd
         */
        public Double getTdyd() {
            return tdyd;
        }
        /**
         * @param tdyd the tdyd to set
         */
        public void setTdyd(Double tdyd) {
            this.tdyd = tdyd;
        }

        public void setTdyd(String tdyd) {
            if( tdyd.equals("") ) {
                this.tdyd = null;
            } else {
                try {
                    this.tdyd = Double.parseDouble(tdyd);
                } catch (NumberFormatException _ex) {
                    this.tdyd = null;
                }
            }
        }

        /**
         * @return the tgrd
         */
        public Double getTgrd() {
            return tgrd;
        }
        /**
         * @param tgrd the tgrd to set
         */
        public void setTgrd(Double tgrd) {
            this.tgrd = tgrd;
        }

        public void setTgrd(String tgrd) {
            if( tgrd.equals("") ) {
                this.tgrd = null;
            } else {
                try {
                    this.tgrd = Double.parseDouble(tgrd);
                } catch (NumberFormatException _ex) {
                    this.tgrd = null;
                }
            }
        }

        /**
         * @return the vprsd
         */
        public Double getVprsd() {
            return vprsd;
        }
        /**
         * @param vprsd the vprsd to set
         */
        public void setVprsd(Double vprsd) {
            this.vprsd = vprsd;
        }

        public void setVprsd(String vprsd) {
            if( vprsd.equals("") ) {
                this.vprsd = null;
            } else {
                try {
                    this.vprsd = Double.parseDouble(vprsd);
                } catch (NumberFormatException _ex) {
                    this.vprsd = null;
                }
            }
        }

    }
}
