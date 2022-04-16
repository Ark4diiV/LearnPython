//Given a string and a second "word" string, we'll say that the word matches the string if it appears at the front of the string, except its first char does not need to match exactly.
//On a match, return the front of the string, or otherwise return the empty string.
//So, so with the string "hippo" the word "hi" returns "hi" and "xip" returns "hip". The word will be at least length 1.
//startWord("hippo", "hi") → "hi"
//startWord("hippo", "xip") → "hip"
//startWord("hippo", "i") → "h"

public class startWord{
    public static void main(String... args) {
        System.out.println(startWord("hippo", "hi"));
        System.out.println(startWord("hippo", "xip"));
        System.out.println(startWord("hippo", "i"));
        System.out.println(startWord("h", "ix"));
        System.out.println(startWord("", "i"));

    }
    public static String startWord(String str, String word) {
        int lWord = word.length();
        int lStr = str.length();
        if (str.equals("") || word.equals("")) {
            return "";
        } else if (lWord > lStr) {
            return "";
        } else if (lWord == 1 && lStr == 1) {
            return str;
        } else if (lWord == 1) {
            if (word.equals(str.substring(0, 1)) == true || word.equals(str.substring(1, 2)) == true) {
                return str.substring(0, 1);
            } else {
                return "";
            }
        } else if (word.substring(1, lWord).equals(str.substring(1, lWord)) == true) {
            return str.substring(0, lWord);
        } else {
            return "";
        }
    }
}
