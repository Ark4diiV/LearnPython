//Given a string, return true if "bad" appears starting at index 0 or 1 in the string, such as with "badxxx" or "xbadxx" but not "xxbadxx".
//The string may be any length, including 0. Note: use .equals() to compare 2 strings.
//hasBad("badxx") → true
//hasBad("xbadxx") → true
//hasBad("xxbadxx") → false

public class hasBad{
    public static void main(String... args) {
        System.out.println(hasBad("badxx"));
        System.out.println(hasBad("xbadxx"));
        System.out.println(hasBad("xxbadxx"));
        System.out.println(hasBad("bad"));
        System.out.println(hasBad("xba"));
    }
    public static Boolean hasBad(String str) {
        String strCheck = "bad";
        if (str.length() < 3) {
            return false;
        } else if (str.length() == 3 && strCheck.equals(str) == false) {
            return false;
        } else if (strCheck.equals(str.substring(0, 3)) || strCheck.equals(str.substring(1, 4))) {
            return true;
        } else {
            return false;
        }
    }
}