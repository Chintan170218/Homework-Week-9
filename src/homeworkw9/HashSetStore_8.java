package homeworkw9;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
8. Use a HashSet that stores Integer Objects. Store the number 4, 7 and 8 to Sets.
Show which numbers are between 1 and 10 are in the set. (Hint: use for loop
and if else).
*/

public class HashSetStore_8 {

    public static void main(String[] args) {

        Set<Integer> hash_Set = new HashSet<>();

        hash_Set.add(4);
        hash_Set.add(7);
        hash_Set.add(8);


        for (int i = 1; i <= 10; i++) {
            if (hash_Set.contains(i)) {
                System.out.println(i + " is in the set.");
            } else {
                System.out.println(i + " is NOT in the set.");
            }
        }
    }
}
