//Given a string and a non-empty word string, return a version of the original String where all chars have been replaced by pluses ("+"), except for appearances of the word string which are preserved unchanged.
//plusOut("12xy34", "xy") → "++xy++"
//plusOut("12xy34", "1") → "1+++++"
//plusOut("12xy34xyabcxy", "xy") → "++xy++xy+++xy"

public class plusOut {
    public static void main(String... args) {
        System.out.println(plusOut("12xy34", "xy"));
        System.out.println(plusOut("12xy34", "1"));
        System.out.println(plusOut("12xy34xyabcxy", "xy"));
    }
    public static String plusOut(String str, String word) {
        String subString = "";
        int g = word.length();
        int i = 0;

        do {
            if (i <= str.length() - g && str.substring(i, i + g).equals(word)) {
                subString = subString + word;
                i += g;
            } else {
                subString = subString + '+';
                i ++;
            }
        } while (i < str.length());
        return subString;
    }
}
