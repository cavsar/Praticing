package fibonnachi;

import java.util.Scanner;

public class Practice02 {
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

