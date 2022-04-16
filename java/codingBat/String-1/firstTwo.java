public class firstTwo{
    public static void main(String... args) {
        System.out.println(firstTwo("Hello"));
        System.out.println(firstTwo("abcdefg"));
        System.out.println(firstTwo("a"));
    }
    public static String firstTwo(String str) {
        if (str.length() < 2) {
            int limit = str.length();
            return str.substring(0, limit);
        } else {
            return str.substring(0, 2);
        }
//        String subStr = str.length() > limit ? str.substring(0, limit) : str;
//        return subStr;
        //        return str.substring();
    }
}

//Given a string, return the string made of its first two chars, so the String "Hello" yields "He". 
//If the string is shorter than length 2, return whatever there is, so "X" yields "X", and the empty string "" yields the empty string "". 
//Note that str.length() returns the length of a string.
//firstTwo("Hello") → "He"
//firstTwo("abcdefg") → "ab"
//firstTwo("ab") → "ab"