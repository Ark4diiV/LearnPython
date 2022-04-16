//Given a string, return a version without the first 2 chars. 
//Except keep the first char if it is 'a' and keep the second char if it is 'b'. The string may be any length. Harder than it looks.
//deFront("Hello") → "llo"
//deFront("java") → "va"
//deFront("away") → "aay"
//deFront("abc") → "abc"
//deFront("ab") → "ab"
//deFront("abxyz") → "abxyz"


public class deFront{
    public static void main(String... args) {
        System.out.println(deFront("Hello"));
        System.out.println(deFront("java"));
        System.out.println(deFront("away"));
        System.out.println(deFront("ebay"));
        System.out.println(deFront("abc"));
        System.out.println(deFront("ab"));
        System.out.println(deFront("abxyz"));

    }
    public static String deFront(String str) {
        int l = str.length();
        if (str.substring(0, 1).equals("a") == true && (str.substring(1, 2).equals("b") == true)) {
            return str;
        } else if (str.substring(0, 1).equals("a") == true) {
            return "a" + str.substring(2, l);
        } else if (str.substring(1, 2).equals("b") == true) {
            return "b" + str.substring(2, l);
        } else {
            return str.substring(2, l);
        }
    }
}