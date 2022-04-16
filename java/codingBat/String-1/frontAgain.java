//Given a string, return true if the first 2 chars in the string also appear at the end of the string, such as with "edited".
//frontAgain("edited") → true
//frontAgain("edit") → false
//frontAgain("ed") → true

public class frontAgain{
    public static void main(String... args) {
        System.out.println(frontAgain("edited"));
        System.out.println(frontAgain("edit"));
        System.out.println(frontAgain("ed"));
    }
    public static boolean frontAgain(String str) {
        int l = str.length();
        if (l < 2) {
            return false;
        } else if (str.substring(0, 2).equals(str.substring(l -2, l))) {
            return true;
        } else {
            return false;
        }
    }
}
