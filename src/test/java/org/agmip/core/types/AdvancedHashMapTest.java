package org.agmip.core.types;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.Iterator;

public class AdvancedHashMapTest {
    @Test
    public void advancedHashMapFilterTest() {
        Set filter = new CopyOnWriteArraySet();
        AdvancedHashMap source = new AdvancedHashMap<String, String>();

        source.put("a", "Hello");
        source.put("b", "There");
        source.put("c", "Don't keep this one");

        filter.add("a");
        filter.add("b");

        AdvancedHashMap dest = source.extract(filter);

        org.junit.Assert.assertEquals("Overlay check - valid", "Hello", dest.getOr("a", "FAILED"));
        org.junit.Assert.assertEquals("Overlay check - invalid", "INVALID", dest.getOr("c", "INVALID"));
    }
    
    @Test
    public void advancedHashMapNullOrBlankTest() {
        // Make sure that both null and empty string are handled the same
        AdvancedHashMap source = new AdvancedHashMap<String, String>();
        
        source.put("a", "Hello");
        source.put("b", null);
        source.put("c", "");
        source.put("d", "There");
        
        org.junit.Assert.assertEquals("Null Check - valid", "VALID", source.getOr("b", "VALID"));
        org.junit.Assert.assertEquals("Blank Check - valid", "VALID", source.getOr("c", "VALID"));
        org.junit.Assert.assertEquals("Valid Check - valid", "There", source.getOr("d", "INVALID"));
        
    }


}
