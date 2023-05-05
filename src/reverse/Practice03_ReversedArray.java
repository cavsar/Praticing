package reverse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Practice03_ReversedArray {

    /*Requirement:
Write a method called as reversedArray to reverse elements in an array, then print array.
NOTE: Make your code dynamic that works for any given array.

Test data 1:
String[] words1 = {“abc”, “foo”, “bar”};

Expected output 1:
[bar, foo, abc]

Test data 2:
String[] words2 = {“java”, “python”, “ruby”};

Expected output 2:
[ruby, python, java]

     */
    public static void main(String[] args) {
        String[] arr = {"Red", "Blue", "Yellow", "While"};
        reversedArray(arr);
    }
    public static void reversedArray(String[] arr){
        ArrayList<String> reversedList = new ArrayList<>();
        for (int i = arr.length-1; i >= 0 ; i--) {
            reversedList.add(arr[i]);
        }
        System.out.println(reversedList);

        // 2nd way
        //Collections.reverse(Arrays.asList(arr));
       // System.out.println(Arrays.toString(arr));


    }
}
