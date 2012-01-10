package org.agmip.core.types;

import org.junit.Test;
import static org.junit.Assert.*;

public class PointLocationTest {
  @Test
  public void createFromPoint() {
    PointLocation test = new PointLocation("AAAA", new Point(0.0, 0.0), 12.34);
    org.junit.Assert.assertEquals("Elevation check", new Double(12.34), test.getElevation());
  }

  @Test
  public void createFromNativeDouble() {
    PointLocation test = new PointLocation("AAAA", 1.0, 1.0);
    org.junit.Assert.assertEquals("Lat test", new Double(1.0), test.getLocation().getLat());
  }

  @Test
  public void createFromObjectDouble() {
    PointLocation test = new PointLocation("AAAA", new Double(1.0), new Double(1.0));
    org.junit.Assert.assertEquals("Lat test", new Double(1.0), test.getLocation().getLat());
  }
}
