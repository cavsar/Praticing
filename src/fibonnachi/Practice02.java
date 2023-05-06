package fibonnachi;

import java.util.Scanner;

public class Practice02 {
   /* Assume that you are given a number and you are
    asked to find series of Fibonacci numbers
•What is Fibonacci numbers: a series of numbers in
    which each number ( Fibonacci number ) is the sum
    of the two preceding numbers
•It always starts with 0 and 1
            •EX: 0, 1, 1, 2, 3, 5, 8, 13, 21
    NOTE: Write a program that handles any n series of
            numbers
    Test data 1:
            5
    Expected output 1:
            0 – 1 – 1 – 2 – 3
    Test data 2:
            7
    Expected output 2:
            0 – 1 – 1 – 2 – 3 – 5 - 8*/
    public static void main(String[] args) {
getFib(5);
    }

    public static void getFib(int n) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number");
        int fib = input.nextInt();


        int num1 = 0;
        int num2 = 1;
        int num3;
        String result ="";

        for (int i = 0; i < fib; i++) {
            result += num1 + " - ";
            num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
        }
        System.out.println(result.substring(0,result.length()-3));

        }

    }

