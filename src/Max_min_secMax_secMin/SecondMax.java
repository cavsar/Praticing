package Max_min_secMax_secMin;

import java.util.TreeSet;

public class SecondMax {  /*
    Write a method that takes an int array argument and returns the second max value as an int
    NOTE: Assume length of the array is always more than one

    TEST DATA:
    [-5, 4, 1, 10, 2]

    EXPECTED OUTPUT:
    4
     */

    public static int secondMaxValue(int[] numbers){
        TreeSet<Integer> uniques = new TreeSet<>();
        for(int number : numbers) uniques.add(number);
        uniques.pollLast();
        return uniques.last();

        //  return new ArrayList<>(uniques).get(uniques.size()-2);
    }


    //Testing method
    public static void main(String[] args) {
        System.out.println(secondMaxValue(new int[]{-5, 4, 1, 10, 2})); // 4
    }
}
