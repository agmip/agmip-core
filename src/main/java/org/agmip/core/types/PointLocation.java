package org.agmip.core.types;

/**
 * A point-based location
 */

public class PointLocation implements Location {
  private String locationId;
  private Point  location;
  private Double elevation;

  public PointLocation(String locId, Point loc, Double elev) {
    locationId = locId;
    location   = loc;
    elevation  = elev;
  }
 
  public PointLocation(String locId, Point loc) {
    this(locId, loc, null);
  }

  public PointLocation(String locId, Double lat, Double lon, Double elev) {
    this(locId, new Point(lat, lon), elev);
  }

  public PointLocation(String locId, Double lat, Double lon) {
    this(locId, new Point(lat, lon), null);
  }

  public String getLocationId() {
    return locationId;
  }
  
  public Point getLocation() {
    return location;
  }

  public Double getElevation() {
    return elevation;
  }
}
