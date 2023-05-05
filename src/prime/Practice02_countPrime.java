package prime;

public class Practice02_countPrime {
    /*
    Requirement:
-Create a method called countPrimes()
-This method will take an int array argument and it will return how many elements in the array are prime numbers

NOTE: Prime number is a number that can be divided only by 1 and itself
NOTE: Negative numbers cannot be prime
Examples: 2,3,5,7,11,13,17,19,23,29,31,37 etc.
NOTE: Smallest prime number is 2

Test Data 1: [-10, -3, 0, 1]
Expected Result 1: 0

Test Data 2: [7, 4, 11, 23, 17]
Expected Result 2: 4

Test Data 3: [41, 53, 19, 47, 67]
Expected Result 3:  5
     */
    public static void main(String[] args) {
        System.out.println(countPrime(new int[]{3, 7, 9, 10}));
    }
    public static int countPrime(int[]arr){
        int nonPrimeCount = 0;

        for (int i : arr) {
            if (i < 2) {
                nonPrimeCount++;
                continue;
            }
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    nonPrimeCount++;
                    break;
                }
            }
        }

        return arr.length - nonPrimeCount;
    }
}
