package reverse;

public class Practice01_ReversedString {
    public static void main(String[] args) {
        System.out.println(reversedString("Java   is fun   "));
    }
    public static String reversedString (String str){
        //"Java is fun"-->"avaJ si nuf"

        String reversedStr= " ";
        String[] strAsArr = str.trim().split("\\s+");

        for(String s : strAsArr){

            reversedStr+= new StringBuffer(s).reverse()+ " ";
        }
        return reversedStr.trim();


}}
