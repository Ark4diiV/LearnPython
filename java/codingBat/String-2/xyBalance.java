//We'll say that a String is xy-balanced if for all the 'x' chars in the string, there exists a 'y' char somewhere later in the string.
//So "xxy" is balanced, but "xyx" is not. One 'y' can balance multiple 'x's.
//Return true if the given string is xy-balanced.
//xyBalance("aaxbby") → true
//xyBalance("aaxbb") → false
//xyBalance("yaaxbb") → false

public class xyBalance{
    public static void main(String... args) {
        System.out.println(xyBalance("aaxbby"));
        System.out.println(xyBalance("aaxbb"));
        System.out.println(xyBalance("yaaxbb"));
        System.out.println(xyBalance("axyyaxbyb"));
    }
    public static boolean xyBalance(String str) {
        int counter = 0;
        String subString = "";
        for (int x = 0; x < str.length(); x ++) {
            if (str.substring(x, x + 1).equals("x") == true) {
                subString = str.substring(x);
            }
        }
        for (int i = 0; i < subString.length(); i ++) {
            if (subString.substring(i, i + 1).equals("x") == true) {
                counter ++;
            } else if (subString.substring(i, i + 1).equals("y") == true) {
                counter --;
            }
        }
        if (counter == 0) {
            return true;
        } else {
            return false;
        }
    }
}


//public boolean xyBalance(String str) {
    // Find the rightmost y
//    int y = -1;
//    for (int i = 0; i < str.length(); i++) {
//      if (str.charAt(i)=='y') y = i;
//    }
    
    // Look at the x's, return false if one is after y
//    for (int i = 0; i < str.length(); i++) {
//      if (str.charAt(i)=='x' && i > y) return false;
//    }
//    return true;
  
    // Solution notes: this solution uses two loops, each written the simple
    // 0..length way. You could do it with a single reverse loop, noticing
    // if you see an x before a y. Or use lastIndexOf().
//  }
//yxyxyxyxy
//y = 9
//yxyxyxyx