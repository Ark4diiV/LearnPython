//Given a string, return a string length 2 made of its first 2 chars. If the string length is less than 2, use '@' for the missing chars.
//atFirst("hello") → "he"
//atFirst("hi") → "hi"
//atFirst("h") → "h@"

public class atFirst{
    public static void main(String... args) {
        System.out.println(atFirst("hello"));
        System.out.println(atFirst("hi"));
        System.out.println(atFirst("h"));
        System.out.println(atFirst(""));
    }
    public static String atFirst(String str) {
        String subString = str.length() < 1 ? "@@" : 
        str.length() == 1 ? str + "@" : str.substring(0, 2);
        return subString;
    }
}