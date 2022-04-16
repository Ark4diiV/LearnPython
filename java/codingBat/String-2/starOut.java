//Return a version of the given string, where for every star (*) in the string the star and the chars immediately to its left and right are gone. 
//So "ab*cd" yields "ad" and "ab**cd" also yields "ad".
//starOut("ab*cd") → "ad"
//starOut("ab**cd") → "ad"
//starOut("sm*eilly") → "silly"

public class starOut {
    public static void main(String... args) {
        System.out.println(starOut("ab*cd"));
        System.out.println(starOut("ab**cd"));
        System.out.println(starOut("*sm*eilly"));
        System.out.println(starOut("sm****eilly"));
        System.out.println(starOut("a"));
        System.out.println(starOut("a*"));
        System.out.println(starOut("*a"));
        System.out.println(starOut("a*b"));
    }
    public static String starOut(String str) {
        String subString = "";

        for (int i = 0; i < str.length(); i ++) {
            if (str.charAt(i) == '*' || (i > 0 && str.charAt(i - 1) == '*')) {
                continue;
            }

            if (i < str.length() - 1 && str.charAt(i + 1) == '*') {
                continue;
            }
            subString = subString + str.charAt(i);
        }
        return subString;
    }
}