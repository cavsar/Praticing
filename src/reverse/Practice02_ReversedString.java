package reverse;

public class Practice02_ReversedString {
    public static void main(String[] args) {
        System.out.println(reversedStr("Hello"));
 /*
    Write a method that takes a String and returns reversed String

    TEST DATA:
    Hello

    EXPECTED OUTPUT:
    olleH
     */

    }
    public static String reversedStr(String s){
        String rev="";
        for (int i = s.length()-1 ; i >=0; i--) {

            rev+= s.charAt(i);
        }
        return rev;

        //return new StringBuilder(str).reverse().toString();

    }
}
