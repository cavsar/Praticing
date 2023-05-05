package Max_min_secMax_secMin;

import java.util.TreeSet;

public class Min {
     /*
    Write a method that takes 3 int arguments and returns the smallest number
    NOTE: 2 or 3 numbers being same is okay

    TEST DATA:
    1, 7, 13

    EXPECTED OUTPUT:
    1
     */

    /* public static int getSmallest(int a, int b, int c){

         return Math.min(a, Math.min(b, c));
     }

     */
    public static int getSmallest(int a, int b, int c){
        TreeSet<Integer> n= new TreeSet<>();
        n.add(a);
        n.add(b);
        n.add(c);
        return n.first();
    }


    //Testing method
    public static void main(String[] args) {
        System.out.println(getSmallest(1, 7, 13)); // 1
    }

}
