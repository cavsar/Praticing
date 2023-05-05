package prime;

public class Practice01 {

    /*-Write a method that called Prime() and generates a random number between 1 to 35 (1 and 35 are included)
-Find if the given number is a Prime Number
-If random number generated is a prime one, then print “{NUMBER} IS A PRIME NUMBER”.
-Otherwise, print “{NUMBER} IS NOT A PRIME NUMBER”

Prime number is a number that can be divided only by itself and 1. It cannot be divided by any other number. The smallest prime number is 2 and 2 is the only even prime number.
So, from this definition, prime numbers between 1 and 35 are: 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31

Test data 1:
Random number = 11

Expected result 1:
11 IS A PRIME NUMBER



     */
    public static void main(String[] args) {
        prime();
    }

    public static void prime() {
        int ranNum = 1 + (int) (Math.random() * 35);

        // if the number is divisible by 2 (unless it is 2), then it is not prime number
        if (ranNum == 2 || ranNum == 3 || ranNum == 5) {
            System.out.println(ranNum + " IS A PRIME NUMBER");
        } else if (ranNum == 1 || ranNum % 2 == 0 || ranNum % 3 == 0 || ranNum % 5 == 0) { // ranNum = 24 { 2 % 2 = 0
            System.out.println(ranNum + " IS NOT A PRIME NUMBER");
        } else System.out.println(ranNum + " IS A PRIME NUMBER");
    }
}
