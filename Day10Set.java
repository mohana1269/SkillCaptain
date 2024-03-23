
//        1. add(int num): Adds an integer to the set if it doesn't already exist.
//        2. remove(int num): Removes an integer from the set if it exists.
//        3. contains(int num): Checks if the set contains a specific integer and returns a boolean value.
//        4. size(): Returns the number of unique integers in the set.
//        5. isEmpty(): Checks if the set is empty and returns a boolean value.
//
//        Explanation: :
//        Given the Set: [5, 10, 15]
//        Perform the following operations:
//        add(10): Add 10 to the set. Set: [5, 10, 15]
//        add(20): Add 20 to the set. Set: [5, 10, 15, 20]
//        remove(5): Remove 5 from the set. Set: [10, 15, 20]
//        remove(25): Attempt to remove 25 (not in the set). Set: [10, 15, 20]
//        contains(10): Check if 10 is in the set. Result: true
//        contains(25): Check if 25 is in the set. Result: false
//        size(): Get the size of the set. Result: 3
//        isEmpty(): Check if the set is empty. Result: false

import java.util.*;

public class Day10Set{
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();

        set.add(5);
        set.add(10);
        set.add(15);
        System.out.println(set);

        set.add(10);
        System.out.println(set);

        set.add(20);
        System.out.println(set);

        set.remove(5);
        System.out.println(set);

        set.remove(25);
        System.out.println(set);

        System.out.println( "Result : " + set.contains(10));
        System.out.println("Result : " + set.contains(25));
        System.out.println("Result : "+ set.size());
        System.out.println("Result : "+ set.isEmpty());
    }
}

