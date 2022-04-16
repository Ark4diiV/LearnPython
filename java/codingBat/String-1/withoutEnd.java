//Given a string, return a version without the first and last char, so "Hello" yields "ell". The string length will be at least 2.
//withoutEnd("Hello") → "ell"
//withoutEnd("java") → "av"
//withoutEnd("coding") → "odin"

public class withoutEnd{
    public static void main(String... args) {
        System.out.println(withoutEnd("Hello"));
        System.out.println(withoutEnd("java"));
        System.out.println(withoutEnd("coding"));
        System.out.println(withoutEnd("AB"));
    }
    public static String withoutEnd(String str) {
        if (str.length() > 2) {
            int stringLength = str.length();
            return str.substring(1, stringLength - 1);
        } else {
            String subStr = "";
            return subStr;
        }
    }
}