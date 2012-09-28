package org.agmip.util;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import com.google.common.base.Optional;

public class MapUtil {
    public static class BucketEntry {
        private LinkedHashMap<String, String> values = new LinkedHashMap();
        private ArrayList<LinkedHashMap<String, String>> dataList = new ArrayList();
        private LinkedHashMap<String, BucketEntry> subBuckets = new LinkedHashMap();

        public BucketEntry(LinkedHashMap<String, Object> m) {
            for(Map.Entry<String, Object> entry : m.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();

                if( key.equals("data") || key.equals("soilLayer") || key.equals("dailyWeather") || key.equals("events") || key.equals("timeSeries") ) {
                    this.dataList = (ArrayList<LinkedHashMap<String, String>>) value;
                    if(! key.equals("events") ) {
                        this.parseDataList();
                    }
                } else {
                    values.put(key, (String) value);
                }
            }
        }

        public BucketEntry() {}

        public LinkedHashMap<String, String> getValues() {
            return values;
        }

        public ArrayList<LinkedHashMap<String, String>> getDataList() {
            return dataList;
        }

        public void parseDataList() {
            ArrayList<LinkedHashMap<String, String>> acc = new ArrayList();
            LinkedHashMap<String, String> stickyMap = new LinkedHashMap();
            for(Map<String, String> sourceMap : dataList) {
                if( acc.size() == 0 ) {
                    for(Map.Entry<String, String> e : sourceMap.entrySet()) {
                        stickyMap.put(e.getKey(), sourceMap.get(e.getKey()));
                    }
                    acc.add(stickyMap);
                } else {
                    LinkedHashMap<String, String> mergedMap = new LinkedHashMap();
                    for(Map.Entry<String, String> e : stickyMap.entrySet()) {
                        String sourceValue = sourceMap.get(e.getKey());
                        if ( null == sourceValue ) {
                            mergedMap.put(e.getKey(), getValueOr(sourceMap, e.getKey(), e.getValue()));
                        } else if ( sourceValue.equals("") ){ } else {
                            mergedMap.put(e.getKey(), getValueOr(sourceMap, e.getKey(), e.getValue()));
                        }
                    }
                    acc.add(mergedMap);
                }
            }
            this.dataList = acc;
        }
    }

    public static LinkedHashMap<String, Object> decompressAll(Map<String, Object> m) {
        LinkedHashMap<String, Object> all = new LinkedHashMap(getGlobalValues(m));
        LinkedHashMap<String, String> translate = new LinkedHashMap();
        translate.put("initial_condition", "soilLayer");
        translate.put("soil", "soilLayer");
        translate.put("weather", "dailyWeather");
        translate.put("management", "events");
        translate.put("observed", "timeSeries");

        ArrayList<String> buckets = listBucketNames(m);
        for(String bucket : buckets) {
            BucketEntry b = getBucket(m, bucket);
            LinkedHashMap<String, Object> sub = new LinkedHashMap<String, Object>(b.getValues());
            sub.put(translate.get(bucket), b.getDataList());
            all.put(bucket, sub);
        }

        return all;
    }


    public static <K,V> V getObjectOr(Map<K,V> m, K key, V orValue ) {
        Optional<V> opt = Optional.fromNullable(m.get(key));
        return opt.or(orValue);
    }

    /**
     * Returns a list of all buckets in the provided Map.
     */ 
    public static ArrayList<String> listBucketNames(Map<String, Object> m) {
        ArrayList<String> acc = new ArrayList<String>();
        for(Map.Entry<String, Object> entry : m.entrySet()) {
            if( isValidBucket(entry.getValue()) ) {
                acc.add(entry.getKey());
            }
        }
        return acc;
    }

    public static BucketEntry getBucket(Map<String, Object> m, String key) {
        LinkedHashMap<String, Object> b = (LinkedHashMap<String,Object>) getObjectOr(m, key, new LinkedHashMap<String, Object>());
        return new BucketEntry(b);
    }

    public static LinkedHashMap<String, String> getGlobalValues(Map<String, Object> m) {
        LinkedHashMap<String, String> globals = new LinkedHashMap<String, String>();
        for(Map.Entry<String, Object> entry : m.entrySet()) {
            if(entry.getValue() instanceof String) {
                globals.put(entry.getKey(), (String) entry.getValue());
            }
        }
        return globals;
    }

    public static String getValueOr(Map<String, String> m, String key, String orValue) {
        return getObjectOr(m, key, orValue);
    }

    public static LinkedHashMap<String, String> flattenGlobals(Map<String, Object> m) {
        LinkedHashMap<String, String> globals = new LinkedHashMap<String, String>(getGlobalValues(m));
        ArrayList<String> buckets = listBucketNames(m);
        Iterator iter = buckets.iterator();
        
        while(iter.hasNext()) {
            BucketEntry b = getBucket(m, (String) iter.next());
            globals.putAll(b.getValues());
        }

        return globals;
    }

    public static LinkedHashMap<String, String> extract(Map<String,Object> m, Set<String> s) {
        LinkedHashMap<String, String> extracted = new LinkedHashMap<String,String>();
        LinkedHashMap<String, String> flatMap = flattenGlobals(m);

        Iterator i = s.iterator();
        while(i.hasNext()) {
            String key = (String) i.next();
            if( flatMap.containsKey(key) ) {
                extracted.put(key, flatMap.get(key));
            }
        }

        return extracted;
    }


    /**
     * Check to see if the passed Object is a valid Bucket
     */
    private static boolean isValidBucket(Object test) {
        if ( test instanceof Map ) {
            return true;
        } else {
            return false;
        }
    }
}
