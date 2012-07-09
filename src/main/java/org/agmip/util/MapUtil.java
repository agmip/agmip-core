package org.agmip.util;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import com.google.common.base.Optional;

public class MapUtil {

    public static <K,V> V getValueOr(Map<K,V> m, K key, V orValue ) {
        Optional<V> opt = Optional.fromNullable(m.get(key));
        return opt.or(orValue);
    }

    public static <K,V> List<V> rawGetValuesOr(List<Map<K,V>> l, K key, V orValue) {
        ArrayList<V> acc = new ArrayList<V>();
        for(Map<K,V> m : l) {
            acc.add(getValueOr(m, key, orValue));
        }
        return acc;
    }

    public static <K,V> List<V> getValuesOr(List<Map<K,V>> l, K key, V orValue, boolean uniqueOnly) {
        ArrayList<V> acc = new ArrayList<V>();
        V stickyVal = orValue;

        for(Map<K,V> m : l) {
            if(acc.size() == 0) {
                stickyVal = getValueOr(m, key, orValue);
                acc.add(stickyVal);
            } else {
                acc.add(getValueOr(m, key, stickyVal));
            }
        }
        if(uniqueOnly) {
            return getUniqueValues(acc);
        } else {
            return acc;
        }
    }

    public static <K,V> List<V> getValuesOr(List<Map<K,V>> l, K key, V orValue) {
        return getValuesOr(l,key,orValue,false);
    }

    private static <V> List<V> getUniqueValues(List<V> l) {
        ArrayList<V> acc = new ArrayList<V>();
        for(V value : l) {
            if( ! acc.contains(value) ) {
                acc.add(value);
            }
        }
        return acc;
    }

    public static <K,V> List<Map<K,V>> rawExtractFromList(List<Map<K,V>> l, K[] keys, V orValue) {
        ArrayList<Map<K,V>> acc = new ArrayList<Map<K,V>>();

        for(Map<K,V> m : l) {
            acc.add(rawExtract(m, keys, orValue));
        }
        return acc;
    }

    public static <K,V> Map<K,V> rawExtract(Map<K,V> m, K[] keys, V orValue) {
        ArrayList<K> ks = new ArrayList<K>(Arrays.asList(keys));
        Map<K,V> extract = new LinkedHashMap<K,V>();
        for(K key : ks) {
            extract.put(key, getValueOr(m, key, orValue));
        }
        return extract;
    }
}
