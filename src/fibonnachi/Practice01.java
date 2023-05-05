package fibonnachi;

public class Practice01 {
     /*
    Write method that takes an int argument and prints the Fibonacci series of given number
    DEFINITION: Fibonacci is a series of numbers in which each number ( Fibonacci number ) is the sum of the two preceding numbers.
    The simplest is the series 0, 1, 1, 2, 3, 5, 8, 13, 21

    TEST DATA:
    8

    EXPECTED OUTPUT:
    0
    1
    1
    2
    3
    5
    8
    13
     */

    public static void main(String[] args) {
getFibonnachiSeries(8);
    }

    public static void getFibonnachiSeries(int number) {
        int zero = 0;
        int one = 1;
        int sum;
        for (int i = 0; i < number; i++) {
            System.out.println(zero);
            sum = zero + one;
            zero = one;
            one = sum;

        }
    }
}
