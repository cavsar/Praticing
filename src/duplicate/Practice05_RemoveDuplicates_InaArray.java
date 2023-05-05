package duplicate;

import java.util.ArrayList;
import java.util.HashSet;

public class Practice05_RemoveDuplicates_InaArray {/*
    Write a method that takes an Integer ArrayList argument and returns the list back with all duplicates removed
    NOTE: the order of elements returned is not an issue.

    TEST DATA:
    [0, 5, 4, 0, 0]

    EXPECTED OUTPUT:
    [0, 4, 5]
     */

    public static ArrayList<Integer> removeDuplicateNumbers(ArrayList<Integer> numbers) {
        return new ArrayList<>(new HashSet<>(numbers));
    }
}