package duplicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;

public class Practice06_RemoveDuplicatesInaArray {/*
    Write a method that takes a String ArrayList argument and returns the list back with all duplicates removed
    NOTE: the order of elements returned is not an issue.

    TEST DATA:
    ["foo", "bar", "foo", "123", "bar"]

    EXPECTED OUTPUT:
    [bar, 123, foo]
     */

    public static ArrayList<String> removeDuplicateStrings(ArrayList<String> strings){
      //  return new ArrayList<>(new HashSet<>(strings));
       // return new ArrayList<>(new TreeSet<>(strings));
        ArrayList<String> newList = new ArrayList<>();

        for (String s : strings) {
            if(!newList.contains(s)) newList.add(s);
        }
        return newList;

    }


    //Testing method
    public static void main(String[] args) {
        System.out.println(removeDuplicateStrings(new ArrayList(Arrays.asList("foo", "bar", "foo", "123", "bar")))); // [bar, 123, foo]
    }
}
