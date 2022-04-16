//Return true if the given string contains a "bob" string, but where the middle 'o' char can be any char.
//bobThere("abcbob") → true
//bobThere("b9b") → true
//bobThere("bac") → false

public class bobThere{
    public static void main(String... args) {
        System.out.println(bobThere("abcbob"));
        System.out.println(bobThere("b9b"));
        System.out.println(bobThere("bac"));
    }
    public static boolean bobThere(String str) {
        Boolean check = false;
        for (int x = 0; x < str.length() - 2; x ++) {
            if (str.length() < 3) {
                check = false;
            } else if (str.substring(x, x + 1).equals("b") == true && str.substring(x + 2, x + 3).equals("b") == true) {
                check = true;
            }
        }
        return check;  
    }
}