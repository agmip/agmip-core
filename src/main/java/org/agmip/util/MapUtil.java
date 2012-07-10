package org.agmip.util;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import com.google.common.base.Optional;

public class MapUtil {
    public static class BucketEntry {
        private LinkedHashMap<String, String> values = new LinkedHashMap();
        private ArrayList<LinkedHashMap<String, String>> dataList = new ArrayList();
        private ArrayList<String> subBucketEntriesList = new ArrayList();
        private LinkedHashMap<String, Object> subBucketEntries = new LinkedHashMap();

        public BucketEntry(LinkedHashMap<String, Object> m) {
            for(Map.Entry<String, Object> entry : m.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();

                if(key.equals("data")) {
                    this.dataList = (ArrayList<LinkedHashMap<String, String>>) value;
                } else if ( value instanceof Map ) {
                    this.subBucketEntriesList.add(key);
                    this.subBucketEntries.put(key, value);
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

        public ArrayList<String> getSubBucketEntries() {
            return subBucketEntriesList;
        }

        public BucketEntry getSubBucketEntry(String key) {
            return (BucketEntry) getObjectOr(subBucketEntries, key, new BucketEntry());
        }

        public ArrayList<LinkedHashMap<String, String>> parseDataList(Map<String, String> mapOrValues) {
            ArrayList<LinkedHashMap<String, String>> acc = new ArrayList();
            LinkedHashMap<String, String> stickyMap = new LinkedHashMap();
            for(Map<String, String> sourceMap : dataList) {
                if( acc.size() == 0 ) {
                    for(Map.Entry<String, String> e : mapOrValues.entrySet()) {
                        stickyMap.put(e.getKey(), getObjectOr(sourceMap, e.getKey(), e.getValue()));
                        acc.add(stickyMap);
                    }
                } else {
                    LinkedHashMap<String, String> mergedMap = new LinkedHashMap();
                    for(Map.Entry<String, String> e : stickyMap.entrySet()) {
                        String val = getObjectOr(sourceMap, e.getKey(), e.getValue());
                        mergedMap.put(e.getKey(), ( val.equals("") ? mapOrValues.get(e.getKey()) : val ));
                        acc.add(mergedMap);
                    }
                }
            }
            return acc;
        }
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

    public static ArrayList<BucketEntry> getBucket(Map<String, Object> m, String key) {
        ArrayList<BucketEntry> acc = new ArrayList();
        Object source = getObjectOr(m, key, new ArrayList());
        if( isValidBucket(source) ) {
            for(LinkedHashMap<String, Object> map : (ArrayList<LinkedHashMap<String,Object>>) source) {
                acc.add(new BucketEntry(map));
            }
        }
        return acc;
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


    /**
     * Check to see if the passed Object is a valid Bucket
     */
    private static boolean isValidBucket(Object test) {
        if( test instanceof List ) {
            if( ((List) test).size() == 0 ) {
                return false;
            } else {
                if( ((List) test).get(0) instanceof Map ) {
                    return true;
                } else {
                    return false;
                }
            }
        } else if ( test instanceof Map ) {
            return true;
        } else {
            return false;
        }
    }
}
