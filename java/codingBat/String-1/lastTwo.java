//Given a string of any length, return a new string where the last 2 chars, if present, are swapped, so "coding" yields "codign".
//lastTwo("coding") → "codign"
//lastTwo("cat") → "cta"
//lastTwo("ab") → "ba"

public class lastTwo{
    public static void main(String... args) {
        System.out.println(lastTwo("coding"));
        System.out.println(lastTwo("cat"));
        System.out.println(lastTwo("ab"));
        System.out.println(lastTwo("a"));
        System.out.println(lastTwo(""));
    }
    public static String lastTwo(String str) {
        String subString = str.length() < 2 ? str : 
            str.length() == 2 ? str.substring(1, 2) + str.substring(0, 1) :
            str.substring(0, str.length() - 2) + str.substring(str.length() - 1) + str.substring(str.length() - 2, str.length() - 1);
            return subString;
    }
}