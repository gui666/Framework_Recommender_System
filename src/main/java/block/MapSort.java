package block;


import java.util.*;
import java.util.Map.Entry;

public class MapSort {
    public static <K, V extends Comparable<? super V>> Map<K, V> sortByValue(Map<K, V> map) {
        List<Entry<K, V>> list = new ArrayList<Entry<K, V>>(map.entrySet());
        Collections.sort(list, new Comparator<Entry<K, V>>() {
            @Override
            public int compare(Map.Entry<K, V> e1, Map.Entry<K, V> e2) {
                return ((e1.getValue()).compareTo(e2.getValue()));
            }
        });

        Map<K, V> result = new LinkedHashMap<>();
        for (Map.Entry<K, V> entry : list) {
            result.put(entry.getKey(), entry.getValue());
        }

        return result;
    }
    public static <K, V extends Comparable<? super V>> Map<K, V> sortByValueDes(Map<K, V> map) {
        List<Entry<K, V>> list = new ArrayList<Entry<K, V>>(map.entrySet());
        Collections.sort(list, new Comparator<Entry<K, V>>() {
            @Override
            public int compare(Map.Entry<K, V> e1, Map.Entry<K, V> e2) {
                return ((e2.getValue()).compareTo(e1.getValue()));
            }
        });

        Map<K, V> result = new LinkedHashMap<>();
        for (Map.Entry<K, V> entry : list) {
            result.put(entry.getKey(), entry.getValue());
        }

        return result;
    }
    public static <K, V>  Object getLast(Map<K, V> map) {
        List<Entry<K, V>> list = new ArrayList<Entry<K, V>>(map.entrySet());
        return list.get(list.size()-1).getKey();
    }
    public static <K, V>  Object getFirst(Map<K, V> map) {
        List<Entry<K, V>> list = new ArrayList<Entry<K, V>>(map.entrySet());
        return list.get(0);
    }
}
