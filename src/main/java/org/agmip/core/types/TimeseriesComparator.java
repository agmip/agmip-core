package org.agmip.core.types;

import java.util.Comparator;
import java.util.Map;

@SuppressWarnings("unchecked")
public class TimeseriesComparator implements Comparator {
    private final String sortingKey;

    public TimeseriesComparator(String index) {
        this.sortingKey = index;
    }

    public int compare(Object item, Object otherItem) {
        if ((item instanceof Map) && (otherItem instanceof Map)) {
            if (validateStringStringMap(item) && validateStringStringMap(otherItem)) {
                Map<String, String> a = (Map<String, String>) item;
                Map<String, String> b = (Map<String, String>) otherItem;

                String itemValue = a.get(sortingKey);
                String otherValue = b.get(sortingKey);
                if (itemValue != null && otherValue != null) {
                    return itemValue.compareTo(otherValue);
                } else {
                    if (itemValue == null && otherValue == null) {
                        return 0;
                    } else {
                        if (itemValue == null) {
                            return 1;
                        } else {
                            return -1;
                        }
                    }
                }
            } else {
                return 0;
            }
        } else {
            return 0;
        }
    }

    public boolean validateStringStringMap(Object m) {
        Map<Object, Object> map = (Map<Object, Object>) m;
        for (Map.Entry<Object, Object> entry :  map.entrySet()) {
            if ((entry.getKey() instanceof String) && (entry.getValue() instanceof String)) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }
}
