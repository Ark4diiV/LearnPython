//Given two strings, a and b, create a bigger string made of the first char of a, the first char of b, the second char of a, the second char of b, and so on. 
//Any leftover chars go at the end of the result.
//mixString("abc", "xyz") → "axbycz"
//mixString("Hi", "There") → "HTihere"
//mixString("xxxx", "There") → "xTxhxexre"

public class mixString{
    public static void main(String... args) {
        System.out.println(mixString("abc", "xyz"));
        System.out.println(mixString("Hi", "There"));
        System.out.println(mixString("xxxx", "There"));
    }
    public static String mixString(String a, String b) {
        int l = 0;
        String subString = "";

        if (a.length() > b.length()) {
            l = b.length();
            for (int i =0; i < l; i ++) {
                subString = subString + a.charAt(i) + b.charAt(i);
            }
            subString = subString + a.substring(l); 
        } else {
            l = a.length();
            for (int i =0; i < l; i ++) {
                subString = subString + a.charAt(i) + b.charAt(i);
            }
            subString = subString + b.substring(l);            
        }
        return subString;
    }
}