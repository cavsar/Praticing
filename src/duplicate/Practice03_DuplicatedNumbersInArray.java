package duplicate;

import java.util.ArrayList;

public class Practice03_DuplicatedNumbersInArray {
    /*
    Requirement:
Write a method called as duplicatedNumbers to find the all duplicates in an int array.
NOTE: Make your code dynamic that works for any given int array and return empty ArrayList if there are no duplicates in the array.

Test data 1:
int[] numbers = {0, -4, -7, 0, 5, 10, 45, -7, 0};

Expected output 1:
[0, -7]

Test data 2:
int[] numbers = {1, 2, 5, 0, 7};

Expected output 2:
[]
     */
    public static void main(String[] args) {
        System.out.println(duplicatedNumbers(new int[]{0, -4, -7, 0, 5, 10, 45, -7, 0}));
    }
    public static ArrayList<Integer> duplicatedNumbers(int[] arr){
        ArrayList<Integer> dupContainer = new ArrayList<>();

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[i] == arr[j] && !dupContainer.contains(arr[i])) dupContainer.add(arr[i]);
            }
        }
        return dupContainer;
    }
    }

