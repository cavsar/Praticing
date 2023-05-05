package duplicate;

import java.util.ArrayList;

public class Practice02_FirstDuplicatedElement {
    /*Write a method called as firstDuplicatedString to find the first duplicated String in a String array, ignore cases.
NOTE: Make your code dynamic that works for any given String array and return “There is no duplicates” if there are no duplicates in the array.

Test data 1:
String[] words = {“Z”, “abc”, “z”, “123”, “#” };

Expected output 1:
Z

Test data 2:
String[] words = {“xyz”, “java”, ”abc”};

Expected output 2:
There is no duplicates


     */
    public static void main(String[] args) {
        System.out.println(firstDuplicatedString(new String[]{"aa", "vv", "vv", "aa"}));
    }

    public static String firstDuplicatedString(String[] arr) {
        ArrayList<String> container = new ArrayList<>();

        for (String s : arr) {
            if (container.contains(s.toLowerCase())) return s;
            else container.add(s.toLowerCase());
        }
        return "There is no duplicates";
    }
}