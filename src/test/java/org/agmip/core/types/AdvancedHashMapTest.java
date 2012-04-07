package org.agmip.core.types;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class AdvancedHashMapTest {
    @Test
    public void advancedHashMapFilterTest() {
        List filter = new ArrayList();
        AdvancedHashMap source = new AdvancedHashMap<String, String>();

        source.put("a", "Hello");
        source.put("b", "There");
        source.put("c", "Don't keep this one");

        filter.add("a");
        filter.add("b");

        AdvancedHashMap dest = source.filter(filter);

        org.junit.Assert.assertEquals("Overlay check - valid", "Hello", dest.getOr("a", "FAILED"));
        org.junit.Assert.assertEquals("Overlay check - invalid", "INVALID", dest.getOr("c", "INVALID"));
    }
}
