//Return true if the given string contains an appearance of "xyz" where the xyz is not directly preceeded by a period (.). So "xxyz" counts but "x.xyz" does not.
//xyzThere("abcxyz") → true
//xyzThere("abc.xyz") → false
//xyzThere("xyz.abc") → true

public class xyzThere{
    public static void main(String... args) {
        System.out.println(xyzThere("abcxyz"));
        System.out.println(xyzThere("abc.xyz"));
        System.out.println(xyzThere("xyz.abc"));
        System.out.println(xyzThere(".xyz.abc"));
        System.out.println(xyzThere(".axyz.abc"));
        System.out.println(xyzThere("abc.xyzxyz"));
    }
    public static boolean xyzThere(String str) {
        Boolean check = false;
        for (int x = 0; x < str.length() - 2; x ++) {
            if (x == 0) {
                if (str.substring(x, x + 3).equals("xyz")) {
                    check = true;
                }
            } else if (str.substring(x, x + 3).equals("xyz") && str.substring(x - 1, x).equals(".") == false) {
                    check = true;                
                }
            }
        return check;
    }
}