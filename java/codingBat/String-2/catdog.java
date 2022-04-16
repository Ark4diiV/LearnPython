//Return true if the string "cat" and "dog" appear the same number of times in the given string.
//catDog("catdog") → true
//catDog("catcat") → false
//catDog("1cat1cadodog") → true

public class catdog{
    public static void main(String... args) {
        System.out.println(catdog("catdog"));
        System.out.println(catdog("catcat"));
        System.out.println(catdog("1cat1cadodog"));
    }
    public static Boolean catdog(String str) {
        int counterCat = 0;
        int counterDog = 0;
        for (int x = 0; x <= str.length() - 3; x ++) {
            if (str.substring(x, x + 3).equals("cat")) {
                counterCat ++;
            } else if (str.substring(x, x + 3).equals("dog")) {
                counterDog ++;
            }
        }
        if (str.length() < 3) {
            return true;
        } else if (counterCat == counterDog && counterDog > 0) {
            return true;
        } else {
            return false;
        }
    }
}