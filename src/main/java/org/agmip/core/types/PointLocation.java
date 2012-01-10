package org.agmip.core.types;

public class PointLocation extends Location {
  private String locationId;
  private Point  location;
  private Double elevation;

  public PointLocation(String locId, Point loc, Double elev) {
    locationId = locId;
    location   = loc;
    elevation  = (elev == null) ? new Double(-99.99) : elev;
  }
  
  public PointLocation(String locId, Point loc) {
    this(locId, loc, new Double(-99.99));
  }

  public PointLocation(String locId, Double lat, Double lon, Double elev) {
    this(locId, new Point(lat, lon), elev);
  }

  public PointLocation(String locId, Double lat, Double lon) {
    this(locId, new Point(lat, lon), new Double(-99.99));
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
