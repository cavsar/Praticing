package duplicate;

import java.util.ArrayList;

public class Practice04_DuplicatedStringsInArray {
    /*Requirement:
Write a method called as duplicatedStrings to find the all duplicates in a String array, ignore cases.
NOTE: Make your code dynamic that works for any given String array and return and empty ArrayList if there are no duplicates in the array.

Test data 1:
String[] words = {“A”, “foo”, “12” , “Foo”, “bar”, “a”, “a”, “java”};

Expected output 1:
[A, foo]

Test data 2:
String[] words = {“python”, “foo”, “bar”, “java”, “123” };

Expected output 2:
[]

     */
    public static void main(String[] args) {
        System.out.println(duplicatedStrings(new String[]{"abbc", "abc", "abc", "a", "b", "a"}));
    }
    public static ArrayList<String> duplicatedStrings( String[]arr){
        ArrayList<String> duplicates = new ArrayList<>();
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (!duplicates.contains(arr[i]) && arr[i].equalsIgnoreCase(arr[j])) {
                    duplicates.add(arr[i]);
                    break;

                }
            }
        }

        return duplicates;
    }
    }

