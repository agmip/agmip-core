package org.agmip.core.types;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.List;
import java.util.Iterator;

/**
 * An extension of the <tt>LinkedHashMap</tt> class. This implementation
 * provides all the <tt>LinkedHashMap</tt> operations with modifications
 * of the following:
 * <ul>
 * <li>Does <strong>not</strong> permit <tt>null</tt>values.
 * <li>Provides a <tt>getOr()</tt> method which provides an override in case of null.
 * <li>Provides a <tt>filter()</tt> method which allows filtering of keys in an external <tt>ArrayList</tt>.
 * </ul>
 *
 * @author Christopher Villalobos
 * @see LinkedHashMap
 * @see ArrayList
 * @since 0.5
 */

public class AdvancedHashMap<K, V> extends LinkedHashMap<K,V> {

  public AdvancedHashMap(int initialCapacity, float loadFactor) {
    super(initialCapacity, loadFactor);
  }
  
  public AdvancedHashMap(int initialCapacity) {
    super(initialCapacity);
  }
  
  public AdvancedHashMap(Map map) {
    super(map);
  }
  
  public AdvancedHashMap() {
    super();
  }  

  /**
   * Returns the value to which the specified key is mapped,
   * or {@code defaultValue} if this map contains no mapping for
   * the key or the key is {@code null}.
   */
  public V getOr(K key, V defaultValue) {
    V realValue = super.get(key);
    return (realValue == null) ? defaultValue : realValue;
  }

  /**
   * Associates the specified value with the specified key in this map,
   * given the value is not {@code null}. Otherwise, this key is not added.
   * If the map previously contained a mapping for the key, the old value
   * is replaced. In the case of passing a {@code null} to an existing
   * key, this key will be removed.
   *
   * @param key key with which the specified value is to be associated
   * @param value value to be associated with <tt>key</tt>.
   * @return the previous value associated with <tt>key</tt> or <tt>null</tt>.
   */
  public V put(K key, V value) {
    if(value == null) {
      if(super.get(key) != null) {
        super.remove(key);
      }
      return null;
    } else {
      V oldValue = super.put(key, value);
      return oldValue;
    }
  }

  /**
   * A convience wrapper around putAll()
   * @see HashMap#putAll
   */
  public void put(Map<? extends K, ? extends V>m) {
    super.putAll(m);
  }

  /**
   * Create a new <tt>AdvancedHashMap</tt> containing the <i>key-value</i>
   * mappings that match a the {@code list} passed in.
   *
   * @param list A <tt>List</tt> of keys to filter
   * @return An <tt>AdvancedHashMap</tt> containing the keys and values
   *         contained in <tt>list</tt>.
   */
  public AdvancedHashMap filter(List<? extends K> list) {
      AdvancedHashMap<K, V> destination = new AdvancedHashMap<K,V>();
      Iterator iter = list.iterator();
      while(iter.hasNext()) {
          K key = (K) iter.next();
          destination.put(key, this.getOr(key, null));
      }
      return destination;
  }

  /**
   * An alias of <tt>AdvancedHashMap#filter</tt>.
   *
   * @see AdvancedHashMap#filter
   */
  public AdvancedHashMap extract(List<? extends K> list) {
      return filter(list);
  }
}
