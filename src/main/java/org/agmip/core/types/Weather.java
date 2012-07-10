package org.agmip.core.types;

import java.util.ArrayList;

/**
 * TODO clean this out with the comments
 *
 * @author meng zhang
 */
public class Weather {
//    private String wid; Don't need an id on the class
    private String wst_id;
	private String wst_name;
    private String wst_loc_1;
    private String wst_loc_2;
    private String wst_loc_3;
    private double wst_lat ;
    private double wst_long ;
    private double wst_elev ;
    private String wst_source ;
    private double tav ;
    private double tamp ;
    private double temht ;
    private double wndht ;
    private double refht ;
    private double co2y ;
    private double co2a ;
    private int durn ;
    private int gsdu ;
    private int gsst ;
    private int start_yr ;
    private double tmxy ;
    private double tmny ;
    private double raiy ;
    private double sray ;
    private double anga ;
    private double bmth ;
    private String flaga ;
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
	public double getWst_lat() {
		return wst_lat;
	}



	/**
	 * @param wst_lat the wst_lat to set
	 */
	public void setWst_lat(double wst_lat) {
		this.wst_lat = wst_lat;
	}



	/**
	 * @return the wst_long
	 */
	public double getWst_long() {
		return wst_long;
	}



	/**
	 * @param wst_long the wst_long to set
	 */
	public void setWst_long(double wst_long) {
		this.wst_long = wst_long;
	}



	/**
	 * @return the wst_elev
	 */
	public double getWst_elev() {
		return wst_elev;
	}



	/**
	 * @param wst_elev the wst_elev to set
	 */
	public void setWst_elev(double wst_elev) {
		this.wst_elev = wst_elev;
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
	public double getTav() {
		return tav;
	}



	/**
	 * @param tav the tav to set
	 */
	public void setTav(double tav) {
		this.tav = tav;
	}



	/**
	 * @return the tamp
	 */
	public double getTamp() {
		return tamp;
	}



	/**
	 * @param tamp the tamp to set
	 */
	public void setTamp(double tamp) {
		this.tamp = tamp;
	}



	/**
	 * @return the temht
	 */
	public double getTemht() {
		return temht;
	}



	/**
	 * @param temht the temht to set
	 */
	public void setTemht(double temht) {
		this.temht = temht;
	}



	/**
	 * @return the wndht
	 */
	public double getWndht() {
		return wndht;
	}



	/**
	 * @param wndht the wndht to set
	 */
	public void setWndht(double wndht) {
		this.wndht = wndht;
	}



	/**
	 * @return the refht
	 */
	public double getRefht() {
		return refht;
	}



	/**
	 * @param refht the refht to set
	 */
	public void setRefht(double refht) {
		this.refht = refht;
	}



	/**
	 * @return the co2y
	 */
	public double getCo2y() {
		return co2y;
	}



	/**
	 * @param co2y the co2y to set
	 */
	public void setCo2y(double co2y) {
		this.co2y = co2y;
	}



	/**
	 * @return the co2a
	 */
	public double getCo2a() {
		return co2a;
	}



	/**
	 * @param co2a the co2a to set
	 */
	public void setCo2a(double co2a) {
		this.co2a = co2a;
	}



	/**
	 * @return the durn
	 */
	public int getDurn() {
		return durn;
	}



	/**
	 * @param durn the durn to set
	 */
	public void setDurn(int durn) {
		this.durn = durn;
	}



	/**
	 * @return the gsdu
	 */
	public int getGsdu() {
		return gsdu;
	}



	/**
	 * @param gsdu the gsdu to set
	 */
	public void setGsdu(int gsdu) {
		this.gsdu = gsdu;
	}



	/**
	 * @return the gsst
	 */
	public int getGsst() {
		return gsst;
	}



	/**
	 * @param gsst the gsst to set
	 */
	public void setGsst(int gsst) {
		this.gsst = gsst;
	}



	/**
	 * @return the start_yr
	 */
	public int getStart_yr() {
		return start_yr;
	}



	/**
	 * @param start_yr the start_yr to set
	 */
	public void setStart_yr(int start_yr) {
		this.start_yr = start_yr;
	}



	/**
	 * @return the tmxy
	 */
	public double getTmxy() {
		return tmxy;
	}



	/**
	 * @param tmxy the tmxy to set
	 */
	public void setTmxy(double tmxy) {
		this.tmxy = tmxy;
	}



	/**
	 * @return the tmny
	 */
	public double getTmny() {
		return tmny;
	}



	/**
	 * @param tmny the tmny to set
	 */
	public void setTmny(double tmny) {
		this.tmny = tmny;
	}



	/**
	 * @return the raiy
	 */
	public double getRaiy() {
		return raiy;
	}



	/**
	 * @param raiy the raiy to set
	 */
	public void setRaiy(double raiy) {
		this.raiy = raiy;
	}



	/**
	 * @return the sray
	 */
	public double getSray() {
		return sray;
	}



	/**
	 * @param sray the sray to set
	 */
	public void setSray(double sray) {
		this.sray = sray;
	}



	/**
	 * @return the anga
	 */
	public double getAnga() {
		return anga;
	}



	/**
	 * @param anga the anga to set
	 */
	public void setAnga(double anga) {
		this.anga = anga;
	}



	/**
	 * @return the bmth
	 */
	public double getBmth() {
		return bmth;
	}



	/**
	 * @param bmth the bmth to set
	 */
	public void setBmth(double bmth) {
		this.bmth = bmth;
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
        private long w_date ;
//        private long wid ; don't need an id on this class
        private String wst_id ;
//        private int year ;
//        private int doy ;
        private double srad ;
        private double tmax ;
        private double tmin ;
        private double rain ;
        private double wind ;
        private double tdew ;
        private double co2d ;
        private double cldd ;
        private double dewp ;
        private double pard ;
        private double dtr ;
        private double sunh ;
        private double tdry ;
        private double evap ;
        private double twet ;
        private double dayd ;
        private double da3d ;
        private double twld ;
        private double tmen ;
        private double aco2 ;
        private int ts1d ;
        private int ts2d ;
        private int ts3d ;
        private int ts4d ;
        private int ts5d ;
        private int ts6d ;
        private int ts7d ;
        private int ts8d ;
        private int ts9d ;
        private int ts10d ;
        private String flagw ;
        private double tmxa ;
        private double tmna ;
        private double pred ;
        private double rhumd ;
        private double tavd ;
        private double tgad ;
        private double tdyd ;
        private double tgrd ;
        private double vprsd ;
		/**
		 * @return the w_date
		 */
		public long getW_date() {
			return w_date;
		}
		/**
		 * @param w_date the w_date to set
		 */
		public void setW_date(long w_date) {
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
		public double getSrad() {
			return srad;
		}
		/**
		 * @param srad the srad to set
		 */
		public void setSrad(double srad) {
			this.srad = srad;
		}
		/**
		 * @return the tmax
		 */
		public double getTmax() {
			return tmax;
		}
		/**
		 * @param tmax the tmax to set
		 */
		public void setTmax(double tmax) {
			this.tmax = tmax;
		}
		/**
		 * @return the tmin
		 */
		public double getTmin() {
			return tmin;
		}
		/**
		 * @param tmin the tmin to set
		 */
		public void setTmin(double tmin) {
			this.tmin = tmin;
		}
		/**
		 * @return the rain
		 */
		public double getRain() {
			return rain;
		}
		/**
		 * @param rain the rain to set
		 */
		public void setRain(double rain) {
			this.rain = rain;
		}
		/**
		 * @return the wind
		 */
		public double getWind() {
			return wind;
		}
		/**
		 * @param wind the wind to set
		 */
		public void setWind(double wind) {
			this.wind = wind;
		}
		/**
		 * @return the tdew
		 */
		public double getTdew() {
			return tdew;
		}
		/**
		 * @param tdew the tdew to set
		 */
		public void setTdew(double tdew) {
			this.tdew = tdew;
		}
		/**
		 * @return the co2d
		 */
		public double getCo2d() {
			return co2d;
		}
		/**
		 * @param co2d the co2d to set
		 */
		public void setCo2d(double co2d) {
			this.co2d = co2d;
		}
		/**
		 * @return the cldd
		 */
		public double getCldd() {
			return cldd;
		}
		/**
		 * @param cldd the cldd to set
		 */
		public void setCldd(double cldd) {
			this.cldd = cldd;
		}
		/**
		 * @return the dewp
		 */
		public double getDewp() {
			return dewp;
		}
		/**
		 * @param dewp the dewp to set
		 */
		public void setDewp(double dewp) {
			this.dewp = dewp;
		}
		/**
		 * @return the pard
		 */
		public double getPard() {
			return pard;
		}
		/**
		 * @param pard the pard to set
		 */
		public void setPard(double pard) {
			this.pard = pard;
		}
		/**
		 * @return the dtr
		 */
		public double getDtr() {
			return dtr;
		}
		/**
		 * @param dtr the dtr to set
		 */
		public void setDtr(double dtr) {
			this.dtr = dtr;
		}
		/**
		 * @return the sunh
		 */
		public double getSunh() {
			return sunh;
		}
		/**
		 * @param sunh the sunh to set
		 */
		public void setSunh(double sunh) {
			this.sunh = sunh;
		}
		/**
		 * @return the tdry
		 */
		public double getTdry() {
			return tdry;
		}
		/**
		 * @param tdry the tdry to set
		 */
		public void setTdry(double tdry) {
			this.tdry = tdry;
		}
		/**
		 * @return the evap
		 */
		public double getEvap() {
			return evap;
		}
		/**
		 * @param evap the evap to set
		 */
		public void setEvap(double evap) {
			this.evap = evap;
		}
		/**
		 * @return the twet
		 */
		public double getTwet() {
			return twet;
		}
		/**
		 * @param twet the twet to set
		 */
		public void setTwet(double twet) {
			this.twet = twet;
		}
		/**
		 * @return the dayd
		 */
		public double getDayd() {
			return dayd;
		}
		/**
		 * @param dayd the dayd to set
		 */
		public void setDayd(double dayd) {
			this.dayd = dayd;
		}
		/**
		 * @return the da3d
		 */
		public double getDa3d() {
			return da3d;
		}
		/**
		 * @param da3d the da3d to set
		 */
		public void setDa3d(double da3d) {
			this.da3d = da3d;
		}
		/**
		 * @return the twld
		 */
		public double getTwld() {
			return twld;
		}
		/**
		 * @param twld the twld to set
		 */
		public void setTwld(double twld) {
			this.twld = twld;
		}
		/**
		 * @return the tmen
		 */
		public double getTmen() {
			return tmen;
		}
		/**
		 * @param tmen the tmen to set
		 */
		public void setTmen(double tmen) {
			this.tmen = tmen;
		}
		/**
		 * @return the aco2
		 */
		public double getAco2() {
			return aco2;
		}
		/**
		 * @param aco2 the aco2 to set
		 */
		public void setAco2(double aco2) {
			this.aco2 = aco2;
		}
		/**
		 * @return the ts1d
		 */
		public int getTs1d() {
			return ts1d;
		}
		/**
		 * @param ts1d the ts1d to set
		 */
		public void setTs1d(int ts1d) {
			this.ts1d = ts1d;
		}
		/**
		 * @return the ts2d
		 */
		public int getTs2d() {
			return ts2d;
		}
		/**
		 * @param ts2d the ts2d to set
		 */
		public void setTs2d(int ts2d) {
			this.ts2d = ts2d;
		}
		/**
		 * @return the ts3d
		 */
		public int getTs3d() {
			return ts3d;
		}
		/**
		 * @param ts3d the ts3d to set
		 */
		public void setTs3d(int ts3d) {
			this.ts3d = ts3d;
		}
		/**
		 * @return the ts4d
		 */
		public int getTs4d() {
			return ts4d;
		}
		/**
		 * @param ts4d the ts4d to set
		 */
		public void setTs4d(int ts4d) {
			this.ts4d = ts4d;
		}
		/**
		 * @return the ts5d
		 */
		public int getTs5d() {
			return ts5d;
		}
		/**
		 * @param ts5d the ts5d to set
		 */
		public void setTs5d(int ts5d) {
			this.ts5d = ts5d;
		}
		/**
		 * @return the ts6d
		 */
		public int getTs6d() {
			return ts6d;
		}
		/**
		 * @param ts6d the ts6d to set
		 */
		public void setTs6d(int ts6d) {
			this.ts6d = ts6d;
		}
		/**
		 * @return the ts7d
		 */
		public int getTs7d() {
			return ts7d;
		}
		/**
		 * @param ts7d the ts7d to set
		 */
		public void setTs7d(int ts7d) {
			this.ts7d = ts7d;
		}
		/**
		 * @return the ts8d
		 */
		public int getTs8d() {
			return ts8d;
		}
		/**
		 * @param ts8d the ts8d to set
		 */
		public void setTs8d(int ts8d) {
			this.ts8d = ts8d;
		}
		/**
		 * @return the ts9d
		 */
		public int getTs9d() {
			return ts9d;
		}
		/**
		 * @param ts9d the ts9d to set
		 */
		public void setTs9d(int ts9d) {
			this.ts9d = ts9d;
		}
		/**
		 * @return the ts10d
		 */
		public int getTs10d() {
			return ts10d;
		}
		/**
		 * @param ts10d the ts10d to set
		 */
		public void setTs10d(int ts10d) {
			this.ts10d = ts10d;
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
		public double getTmxa() {
			return tmxa;
		}
		/**
		 * @param tmxa the tmxa to set
		 */
		public void setTmxa(double tmxa) {
			this.tmxa = tmxa;
		}
		/**
		 * @return the tmna
		 */
		public double getTmna() {
			return tmna;
		}
		/**
		 * @param tmna the tmna to set
		 */
		public void setTmna(double tmna) {
			this.tmna = tmna;
		}
		/**
		 * @return the pred
		 */
		public double getPred() {
			return pred;
		}
		/**
		 * @param pred the pred to set
		 */
		public void setPred(double pred) {
			this.pred = pred;
		}
		/**
		 * @return the rhumd
		 */
		public double getRhumd() {
			return rhumd;
		}
		/**
		 * @param rhumd the rhumd to set
		 */
		public void setRhumd(double rhumd) {
			this.rhumd = rhumd;
		}
		/**
		 * @return the tavd
		 */
		public double getTavd() {
			return tavd;
		}
		/**
		 * @param tavd the tavd to set
		 */
		public void setTavd(double tavd) {
			this.tavd = tavd;
		}
		/**
		 * @return the tgad
		 */
		public double getTgad() {
			return tgad;
		}
		/**
		 * @param tgad the tgad to set
		 */
		public void setTgad(double tgad) {
			this.tgad = tgad;
		}
		/**
		 * @return the tdyd
		 */
		public double getTdyd() {
			return tdyd;
		}
		/**
		 * @param tdyd the tdyd to set
		 */
		public void setTdyd(double tdyd) {
			this.tdyd = tdyd;
		}
		/**
		 * @return the tgrd
		 */
		public double getTgrd() {
			return tgrd;
		}
		/**
		 * @param tgrd the tgrd to set
		 */
		public void setTgrd(double tgrd) {
			this.tgrd = tgrd;
		}
		/**
		 * @return the vprsd
		 */
		public double getVprsd() {
			return vprsd;
		}
		/**
		 * @param vprsd the vprsd to set
		 */
		public void setVprsd(double vprsd) {
			this.vprsd = vprsd;
		}
    }
}
