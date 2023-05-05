package remove;

public class Practice01_RemoveSpaces {
    /*
    Write a method that takes a String and return String back with all spaces removed

    TEST DATA:
    Java is fun

    EXPECTED OUTPUT:
    Javaisfun
     */

        public static String noSpaces(String str){
            return str.replaceAll(" ", "");
        }


        //Testing method
        public static void main(String[] args) {
            System.out.println(noSpaces("Java is fun")); // Javaisfun
        }

}
