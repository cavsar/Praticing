package factorial;

import com.sun.deploy.net.MessageHeader;

import java.util.Arrays;

public class Test {
    public static int factorial(int number) {
        if (number == 0 || number == 1) return 1;
        else {
            int a = number;
            for (int i = 2; i < a; i++) {
                number *= i;
            }
        }
        return number;
    }

    public static void main(String[] args) {

        System.out.println(factorial(5)); // 120
    }
}