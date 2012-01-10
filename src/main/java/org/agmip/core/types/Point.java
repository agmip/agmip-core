package org.agmip.core.types;

public class Point {
  private Double latitude;
  private Double longitude;

  public Point(Double lat,
               Double lon) {
    latitude  = lat;
    longitude = lon;
  }

  public Point(double lat,
               double lon) {
    this(new Double(lat), new Double(lon));
  }

  public Point() {
    this( new Double(-99.99), new Double(-99.99));
  }

  public Double getLatitude() { 
    return latitude;
  }

  public Double getLat() {
    return this.getLatitude();
  }

  public Double getLongitude() {
    return longitude;
  }

  public Double getLon() {
    return this.getLongitude();
  }

  public void setLatitude(Double newLat) {
    latitude = newLat;
  }

  public void setLongitude(Double newLon) {
    longitude = newLon;
  }

}
