package org.agmip.core.types;

/**
 * The point class describes a point on a map, without regard to projection
 * @author Christopher Villalobos
 */
public class Point {
  private Double latitude;
  private Double longitude;

  /**
   * Initializes a point with a user-defined latitde and longitude
   * latitude and longitude.
   *
   * @param lat the latitude of the point
   * @param lon the longitude of the point
   */
  public Point(Double lat,
               Double lon) {
    latitude  = lat;
    longitude = lon;
  }

  /**
   * Initializes a point with the latitude and longitude set to -99.99
   */
  public Point() {
    this( new Double(-99.99), new Double(-99.99));
  }

  /**
   * Returns the latitude of the point.
   *
   * @return the latitude
   */
  public Double getLatitude() { 
    return latitude;
  }

  /**
   * Alias of getLatitude()
   * @see org.agmip.core.types.Point#getLatitude()
   */
  public Double getLat() {
    return this.getLatitude();
  }

  /**
   * Return the longitude of the point
   *
   * @return the longitude
   */
  public Double getLongitude() {
    return longitude;
  }

  /**
   * Alias of getLongitude()
   * @see org.agmip.core.types.Point#getLongitude
   */
  public Double getLon() {
    return this.getLongitude();
  }

  /**
   * Set the latitude of the point
   */
  public void setLatitude(Double newLat) {
    latitude = newLat;
  }

   /** 
    * Alias of setLatitude()
    * @see org.agmip.core.types.Point#setLatitude
    */
  public void setLat(Double newLat) {
    this.setLatitude(newLat);
  }

  /**
   * Set the longitude of the point
   */
  public void setLongitude(Double newLon) {
    longitude = newLon;
  }

  /**
   * Alias of setLongitude()
   * @see org.agmip.core.types.Point#setLongitude
   */
  public void setLon(Double newLon) {
    this.setLongitude(newLon);
  }
}
