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
    locationId = locId;
    location = loc;
    elevation = new Double(-99.99);
  }

  public PointLocation(String locId, Double lat, Double lon, Double elev) {
    locationId = locId;
    location = new Point(lat, lon);
    elevation = elev;
  }

  public PointLocation(String locId, Double lat, Double lon) {
    locationId = locId;
    location = new Point(lat, lon);
    elevation = new Double(-99.99);
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
