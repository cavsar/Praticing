package Max_min_secMax_secMin;

import java.util.TreeSet;

public class SecondMin { /*
    Write a method that takes an int array argument and returns the second min value as an int
    NOTE: Assume length of the array is always more than one

    TEST DATA:
    [-5, 4, 1, 10, 2]

    EXPECTED OUTPUT:
    1
     */

    public static int secondMinValue(int[] numbers) {
        TreeSet<Integer> uniques = new TreeSet<>();
        for (int number : numbers) uniques.add(number);
        uniques.pollFirst();
        return uniques.first();
        // return new ArrayList<>(uniques).get(1);
    }


    //Testing method
    public static void main(String[] args) {
        System.out.println(secondMinValue(new int[]{-5, 4, 1, 10, 2})); // 1
    }
}