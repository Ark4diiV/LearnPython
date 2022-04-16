//Given 2 strings, return their concatenation, except omit the first char of each. The strings will be at least length 1.
//nonStart("Hello", "There") → "ellohere"
//nonStart("java", "code") → "avaode"
//nonStart("shotl", "java") → "hotlava"

public class nonStart{
    public static void main(String... args) {
        System.out.println(nonStart("Hello", "There"));
        System.out.println(nonStart("java", "code"));
        System.out.println(nonStart("shotl", "java"));
        System.out.println(nonStart("a", "b"));
        System.out.println(nonStart("a", "bb"));
    }
    public static String nonStart(String a, String b) {
        int aLength = a.length();
        int bLength = b.length();
        if (aLength > 1 && bLength > 1) {
            return a.substring(1, a.length()) + b.substring(1, b.length());
        } else if (aLength == 1 && bLength > 1) {
            return b.substring(1, b.length());
        } else if (aLength > 1 && bLength == 1) {
            return a.substring(1, a.length());
        } else {
            return "";
        }
    }
}