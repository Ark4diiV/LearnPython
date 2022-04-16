//A sandwich is two pieces of bread with something in between.
//Return the string that is between the first and last appearance of "bread" in the given string, or return the empty string "" if there are not two pieces of bread.
//getSandwich("breadjambread") → "jam"
//getSandwich("xxbreadjambreadyy") → "jam"
//getSandwich("xxbreadyy") → ""

public class getSandwich{
    public static void main(String... args) {
        System.out.println(getSandwich("breadjambread"));
        System.out.println(getSandwich("xxbreadjambreadyy"));
        System.out.println(getSandwich("xxbreadyy"));
        System.out.println(getSandwich("xxbreadbreadjambreadyy"));
    }
    public static String getSandwich(String str) {
        int lastbread = 0;
        int breadcounter = 0;
        String subString = "";

        if (str.length() < 10) {
            breadcounter = 0;
        } else {
            for (int i = 0; i < str.length() - 4; i ++) {
                if (str.substring(i, i + 5).equals("bread")) {
                    breadcounter ++;
                    lastbread = i;
                }
            }
        }

        if (breadcounter >= 2) {
            for (int i = 0; i < str.length() - 4; i ++) {
                if (str.substring(i, i + 5).equals("bread") && i < lastbread)  {
                    subString = str.substring(i + 5, lastbread);
                    break;
                }
            }
        } else {
            return "";
        }
        return subString;
    }
}