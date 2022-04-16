//Look for patterns like "zip" and "zap" in the string -- length-3, starting with 'z' and ending with 'p'.
//Return a string where for all such words, the middle letter is gone, so "zipXzap" yields "zpXzp".
//zipZap("zipXzap") → "zpXzp"
//zipZap("zopzop") → "zpzp"
//zipZap("zzzopzop") → "zzzpzp"

public class zipZap {
    public static void main(String... args) {
        System.out.println(zipZap("zipXzap"));
        System.out.println(zipZap("zopzop"));
        System.out.println(zipZap("zzzopzop"));
    }
    public static String zipZap(String str) {
        String subString = "";
        int i = 0;

        if (str.length() < 3) {
            subString = str;
        } else {
            do {
                if (str.charAt(i) == 'z' && str.charAt(i + 2) == 'p' && i < str.length() - 2) {
                    subString = subString + "zp";
                    i += 3;
                } else {
                    subString = subString + str.charAt(i);
                    i ++;
                }
            } while (i < str.length());
        }
        return subString;
    }
}