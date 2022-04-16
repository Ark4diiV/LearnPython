//Given a string, compute a new string by moving the first char to come after the next two chars, so "abc" yields "bca".
//Repeat this process for each subsequent group of 3 chars, so "abcdef" yields "bcaefd". Ignore any group of fewer than 3 chars at the end.
//oneTwo("abc") → "bca"
//oneTwo("tca") → "cat"
//oneTwo("tcagdo") → "catdog"
//oneTwo("1231234") → "2312314"

public class oneTwo {
    public static void main(String... args) {
        System.out.println(oneTwo("abc"));
        System.out.println(oneTwo("tca"));
        System.out.println(oneTwo("tcagdo"));
        System.out.println(oneTwo("1231234"));
    }
    public static String oneTwo(String str) {
        String subString = "";
        boolean threechars = false;
        int end = 0;

        if (str.length() % 3 == 0) {
            threechars = true;
        } else {
            end = str.length() % 3;
        }

        if (threechars == true) {
            for (int i = 0; i < str.length() - 2; i += 3) {
                subString = subString + str.charAt(i + 1) + str.charAt(i + 2) + str.charAt(i);
            }
        } else {
            for (int i = 0; i < str.length() - 2 - end; i += 3) {
                subString = subString + str.charAt(i + 1) + str.charAt(i + 2) + str.charAt(i);
                }
        }
        return subString;
    }
}