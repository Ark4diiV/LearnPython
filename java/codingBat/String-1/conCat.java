//Given two strings, append them together (known as "concatenation") and return the result. 
//However, if the concatenation creates a double-char, then omit one of the chars, so "abc" and "cat" yields "abcat".
//conCat("abc", "cat") → "abcat"
//conCat("dog", "cat") → "dogcat"
//conCat("abc", "") → "abc"

public class conCat{
    public static void main(String... args) {
        System.out.println(conCat("abc", "cat"));
        System.out.println(conCat("dog", "cat"));
        System.out.println(conCat("abc", ""));
        System.out.println(conCat("", ""));
        System.out.println(conCat("", "abc"));
    }
    public static String conCat(String a, String b) {
        String subString = a.length() == 0 && b.length() == 0 ? "" :
            a.length() == 0 || b.length() == 0 ? a + b :
            a.substring(a.length() - 1).equals(b.substring(0,1)) == true ? a.substring(0, a.length() - 1) + b : a + b;
        return subString;
    }
}