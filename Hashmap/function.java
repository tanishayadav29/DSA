package Hashmap;
import java.util.HashMap;
import java.util.Map;

//java.util.Map is used for enrtySet() function
//entrySet() of a HashMap returns a set of entries of type Map.Entry<K, V> —not HashMap.Entry<K, V>.
//Even though HashMap implements Map, its entrySet() method is defined in the Map interface, and its entries are typed as Map.Entry.

public class function {
    public static void main(String[] args) {
        // Create a HashMap
        HashMap<Integer, String> map = new HashMap<>();

        // 1️⃣ put() → insert key-value pairs
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cherry");
        map.put(4, "Date");
        System.out.println("Initial HashMap: " + map);

        // 2️⃣ get() → retrieve value using key
        System.out.println("Value for key 2: " + map.get(2));
        System.out.println("Value for key 5 (not present): " + map.get(5));

        // 3️⃣ containsKey() → check if a key exists
        System.out.println("Does map contain key 3? " + map.containsKey(3));

        // 4️⃣ containsValue() → check if a value exists
        System.out.println("Does map contain value 'Apple'? " + map.containsValue("Apple"));
        System.out.println("Does map contain value 'Mango'? " + map.containsValue("Mango"));

        // 5️⃣ remove() → remove a key-value pair
        map.remove(4);
        System.out.println("After removing key 4: " + map);

        // 6️⃣ size() → total number of key-value pairs
        System.out.println("Size of HashMap: " + map.size());

        // 7️⃣ isEmpty() → check if map is empty
        System.out.println("Is HashMap empty? " + map.isEmpty());

        // 8️⃣ keySet() → get all keys
        System.out.println("Keys in map: " + map.keySet());
        System.out.println("Iterating using keySet():");
        for (Integer key : map.keySet()) {
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }

        // 9️⃣ values() → get all values
        System.out.println("Values in map: " + map.values());

        // 🔟 entrySet() → get all key-value pairs
        System.out.println("Entries in map: " + map.entrySet());
        System.out.println("Iterating using entrySet():");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // 1️⃣1️⃣ clear() → remove all entries
        map.clear();
        System.out.println("After clear(): " + map);
        System.out.println("Is HashMap empty now? " + map.isEmpty());
    }
}
