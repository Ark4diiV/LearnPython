//Given a string, if a length 2 substring appears at both its beginning and end,
//return a string without the substring at the beginning, so "HelloHe" yields "lloHe".
//The substring may overlap with itself, so "Hi" yields "". Otherwise, return the original string unchanged.
//without2("HelloHe") → "lloHe"
//without2("HelloHi") → "HelloHi"
//without2("Hi") → ""
//without2("Hii")) → ""
//without2("HiHi")) → ""
//without2("HiiHi")) → ""
//without2("x") → "x"
//without2("") → ""

public class without2{
    public static void main(String... args) {
        System.out.println(without2("HelloHe"));
        System.out.println(without2("HelloHi"));
        System.out.println(without2("x"));
        System.out.println(without2(""));
    }
    public static String without2(String str) {
        int l = str.length();
        if (l < 2) {
            return str;
        } else if (str.substring(0, 2).equals(str.substring(l - 2)) == true) {
            return str.substring(2, l);
        } else {
            return str;
        }
    }
}