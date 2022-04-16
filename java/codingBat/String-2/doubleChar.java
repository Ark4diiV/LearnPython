//Given a string, return a string where for every char in the original, there are two chars.
//doubleChar("The") → "TThhee"
//doubleChar("AAbb") → "AAAAbbbb"
//doubleChar("Hi-There") → "HHii--TThheerree"

public class doubleChar{
    public static void main(String... args) {
        System.out.println(doubleChar("The"));
        System.out.println(doubleChar("AAbb"));
        System.out.println(doubleChar("Hi-There"));

    }
    public static String doubleChar(String str) {
        String subString = "";
        int l = str.length();
        for (int x = 0; x < l; x++) {
            subString = subString + str.substring(x, x + 1) + str.substring(x, x + 1);
        }
        return subString;
    }
}