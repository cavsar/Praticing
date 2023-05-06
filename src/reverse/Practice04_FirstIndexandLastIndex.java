package reverse;

public class Practice04_FirstIndexandLastIndex {
    public static String replaceFirstLast(String str){
        String str1 = str.trim();// ======> //Ignore all before and after spaces
        for(int i=0; i<= str1.length()-1; i++){
            if (str1.length()<2)
                return ("");
        }
        return str1.charAt(str1.length()-1) + str1.substring(1,str1.length()-1) + str1.charAt(0);
    }

    public static void main (String [] args){
        System.out.println(replaceFirstLast("Hello"));//=======> oellH
    }
}
