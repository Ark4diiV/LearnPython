//Given two strings, return true if either of the strings appears at the very end of the other string, ignoring upper/lower case differences (in other words, the computation should not be "case sensitive"). 
//Note: str.toLowerCase() returns the lowercase version of a string.
//endOther("Hiabc", "abc") → true
//endOther("AbC", "HiaBc") → true
//endOther("abc", "abXabc") → true

public class endOther{
    public static void main(String... args) {
        System.out.println(endOther("Hiabc", "abc"));
        System.out.println(endOther("AbC", "HiaBc"));
        System.out.println(endOther("abc", "abXabc"));
    }
    public static boolean endOther(String a, String b) {
        if (a.length() > b.length()) {
            if (b.compareToIgnoreCase(a.substring(a.length() - b.length())) == 0) {
                return true;
            } else {
                return false;
            }
        } else if (a.length() < b.length()) {
            if (a.compareToIgnoreCase(b.substring(b.length() - a.length())) == 0) {
                return true;
            } else {
                return false;
            }            

        } else if (a.length() == b.length()) {
            if (a.compareToIgnoreCase(b) == 0) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}