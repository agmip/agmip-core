package org.agmip.util;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import static org.junit.Assert.*;

import static org.agmip.util.MapUtil.*;

public class MapUtilTest {
    @Test
    public void getValueOrTest() {
        Map<String,String> ex = new LinkedHashMap<String,String>();
        ex.put("one", "Big");
        ex.put("two", "Small");
        assertTrue(getValueOr(ex, "one", "HUGE").equals("Big"));
        assertTrue(getValueOr(ex, "three", "tiny").equals("tiny"));
    }

    @Test
    public void nestedGetValueOrTest() {
        Map<String, Object> ex = new LinkedHashMap<String, Object>();
        Map<String, String> n1 = new LinkedHashMap<String, String>();

        n1.put("a", "A");
        n1.put("b", "B");

        ex.put("one", "1");
        ex.put("two", "two");
        ex.put("three", n1);

        assertFalse(getValueOr(ex, "one", "FAIL").equals("FAIL"));
        assertTrue(getValueOr(ex, "five", "PASS").equals("PASS"));
        assertFalse(getValueOr((Map) getValueOr(ex, "three", new LinkedHashMap()), "a", "FAIL").equals("FAIL"));
        assertTrue(getValueOr((Map) getValueOr(ex, "three",  new LinkedHashMap()), "c", "PASS").equals("PASS"));
    }

    @Test
    public void rawGetValuesOrTest() {
        Map<String, String> l1 = new LinkedHashMap<String, String>();
        Map<String, String> l2 = new LinkedHashMap<String, String>();

        List<Map<String, String>> ex = new ArrayList<Map<String,String>>();

        List<String> t1 = new ArrayList<String>();
        List<String> t2 = new ArrayList<String>();

        l1.put("a", "Alice");
        l1.put("b", "Bob");
        l2.put("a", "Allison");

        ex.add(l1);
        ex.add(l2);

        t1.add("Alice");
        t1.add("Allison");

        t2.add("Bob");
        t2.add("PASS");

       
        assertTrue(rawGetValuesOr(ex, "a", "FAIL").equals(t1));
        assertTrue(rawGetValuesOr(ex, "b", "PASS").equals(t2)); 

    }

    @Test
    public void getValuesOrTest() {
        Map<String, String> l1 = new LinkedHashMap<String, String>();
        Map<String, String> l2 = new LinkedHashMap<String, String>();

        List<Map<String, String>> ex = new ArrayList<Map<String,String>>();

        List<String> t1 = new ArrayList<String>();
        List<String> t2 = new ArrayList<String>();
        List<String> t3 = new ArrayList<String>();
        List<String> t4 = new ArrayList<String>();

        l1.put("a", "Alice");
        l1.put("b", "Bob");
        l2.put("a", "Alison");
        l2.put("c", "");

        ex.add(l1);
        ex.add(l2);

        t1.add("Alice");
        t1.add("Alison");

        t2.add("Bob");
        t2.add("Bob");

        t3.add("PASS");
        t3.add("");

        t4.add("Bob");
      
        System.out.println(getValuesOr(ex, "b", "PASS"));
        assertTrue("A1", getValuesOr(ex, "a", "FAIL").equals(t1));
        assertTrue("B1", getValuesOr(ex, "b", "PASS").equals(t2)); 
        assertTrue("C1", getValuesOr(ex, "c", "PASS").equals(t3));
        assertTrue("B2", getValuesOr(ex, "b", "PASS", true).equals(t4));
    }


    @Test
    public void rawExtractTest() {
        List<Map<String, String>> ex = new ArrayList<Map<String, String>>();
        Map<String, String> l1 = new LinkedHashMap<String, String>();
        Map<String, String> l2 = new LinkedHashMap<String, String>();

        Map<String, String> tl1 = new LinkedHashMap<String, String>();
        Map<String, String> tl2 = new LinkedHashMap<String, String>();
        Map<String, String> tl3 = new LinkedHashMap<String, String>();
        Map<String, String> tl4 = new LinkedHashMap<String, String>();
        
        List<Map<String, String>> t1 = new ArrayList<Map<String, String>>();
        List<Map<String, String>> t2 = new ArrayList<Map<String, String>>();

        String[] x1 = new String[] {"a", "c"};
        String[] x2 = new String[] {"b", "c"};

        l1.put("a", "Alice");
        l1.put("b", "Bob");
        l2.put("a", "Alison");

        ex.add(l1);
        ex.add(l2);

        tl1.put("a", "Alice");
        tl1.put("c", "PASS");

        tl2.put("a", "Alison");
        tl2.put("c", "PASS");

        tl3.put("b", "Bob");
        tl3.put("c", "PASS");

        tl4.put("b", "PASS");
        tl4.put("c", "PASS");

        t1.add(tl1);
        t1.add(tl2);

        t2.add(tl3);
        t2.add(tl4);


        System.out.println(rawExtractFromList(ex, x1, "PASS"));
        assertTrue("A1", rawExtractFromList(ex, x1, "PASS").equals(t1));
        assertTrue("B1", rawExtractFromList(ex, x2, "PASS").equals(t2));
    }

    @Test
    public void extractTest() {
        List<Map<String, String>> ex = new ArrayList<Map<String, String>>();
        Map<String, String> l1 = new LinkedHashMap<String, String>();
        Map<String, String> l2 = new LinkedHashMap<String, String>();

        Map<String, String> tl1 = new LinkedHashMap<String, String>();
        Map<String, String> tl2 = new LinkedHashMap<String, String>();
        Map<String, String> tl3 = new LinkedHashMap<String, String>();
        Map<String, String> tl4 = new LinkedHashMap<String, String>();
        
        List<Map<String, String>> t1 = new ArrayList<Map<String, String>>();
        List<Map<String, String>> t2 = new ArrayList<Map<String, String>>();

        String[] x1 = new String[] {"a", "c"};
        String[] x2 = new String[] {"b", "c"};

        l1.put("a", "Alice");
        l1.put("b", "Bob");
        l2.put("a", "Alison");

        ex.add(l1);
        ex.add(l2);

        tl1.put("a", "Alice");
        tl1.put("c", "PASS");

        tl2.put("a", "Alison");
        tl2.put("c", "PASS");

        tl3.put("b", "Bob");
        tl3.put("c", "PASS");

        tl4.put("b", "Bob");
        tl4.put("c", "PASS");

        t1.add(tl1);
        t1.add(tl2);

        t2.add(tl3);
        t2.add(tl4);


        System.out.println(rawExtractFromList(ex, x1, "PASS"));
        assertTrue("A1", extractFromList(ex, x1, "PASS").equals(t1));
        assertTrue("B1", extractFromList(ex, x2, "PASS").equals(t2));

    }
}
