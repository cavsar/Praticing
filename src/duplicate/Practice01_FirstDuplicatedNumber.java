package duplicate;

import java.util.ArrayList;

public class Practice01_FirstDuplicatedNumber {
    /*Requirement:
Write a method called as firstDuplicatedNumber to find the first duplicated number in an int array.
NOTE: Make your code dynamic that works for any given int array and return -1 if there are no duplicates in the array.

Test data 1:
int[] numbers = {-4, 0, -7, 0, 5, 10, 45, 45};

Expected output 1:
0

Test data 2:
int[] numbers = {-8, 56, 7, 8, 65};

Expected output 2:
-1


     */
    public static void main(String[] args) {
        int[] arr1 = {3, 4, 3, 3, 5, 5, 6, 6, 7};
        System.out.println(firstDuplicatedNumber(arr1));
        //System.out.println(firstDuplicatedNumber(new int[]{3, 4, 3, 3, 5, 5, 6, 6, 7}));
    }

    public static int firstDuplicatedNumber(int[]arr){
        ArrayList<Integer> container = new ArrayList<>();

        for (int i : arr) {
            if(container.contains(i)) return i;
            else  container.add(i);
        }
        return -1;}}
