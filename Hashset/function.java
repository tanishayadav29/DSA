package Hashset;

import java.util.HashSet;

public class function {
    public static void main(String[] args) {
        // Create a HashSet
        HashSet<Integer> set = new HashSet<>();

        // 1️⃣ add() → add elements to the HashSet
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(20); // duplicate, won't be added
        System.out.println("HashSet after adding elements: " + set);

        // 2️⃣ contains() → check if an element exists
        System.out.println("Does set contain 20? " + set.contains(20));
        System.out.println("Does set contain 50? " + set.contains(50));

        // 3️⃣ remove() → remove a specific element
        set.remove(10);
        System.out.println("HashSet after removing 10: " + set);

        // 4️⃣ size() → get the number of elements
        System.out.println("Current size of HashSet: " + set.size());

        // 5️⃣ isEmpty() → check if set is empty
        System.out.println("Is HashSet empty? " + set.isEmpty());

        // 6️⃣ clear() → remove all elements
        set.clear();
        System.out.println("HashSet after clear(): " + set);

        // check again
        System.out.println("Is HashSet empty now? " + set.isEmpty());
    }
}
