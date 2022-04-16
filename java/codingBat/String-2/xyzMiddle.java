//Given a string, does "xyz" appear in the middle of the string?
//To define middle, we'll say that the number of chars to the left and right of the "xyz" must differ by at most one.
//This problem is harder than it looks.
//xyzMiddle("AAxyzBB") → true
//xyzMiddle("AxyzBB") → true
//xyzMiddle("AxyzBBB") → false

public class xyzMiddle{
    public static void main(String... args) {
        System.out.println(xyzMiddle("AAxyzBB"));
        System.out.println(xyzMiddle("AxyzBB"));
        System.out.println(xyzMiddle("AxyzBBB"));
    }
    public static boolean xyzMiddle(String str) {
        Boolean even = false;
        int middle = 0;

        if (str.length()%2 == 0) {
            even = true;
            middle = str.length() / 2;
        } else {
            middle = (str.length() - 1) / 2;
        }
        
        if (str.length() < 3) {
            return false;
        } else if (even == true) {
            if (str.substring(middle - 2, middle + 1).equals("xyz") == true) {
                return true;
            } else if (str.substring(middle - 1, middle + 2).equals("xyz") == true) {
                return true;
            } else {
                return false;
            }
        } else {
            if (str.substring(middle -1, middle + 2).equals("xyz") == true) {
                return true;
            } else {
                return false;
            }
        }
    }
}