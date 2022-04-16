//Given a string, return a "rotated left 2" version where the first 2 chars are moved to the end. The string length will be at least 2.
//left2("Hello") → "lloHe"
//left2("java") → "vaja"
//left2("Hi") → "Hi"

public class left2{
    public static void main(String... args) {
        System.out.println(left2("Hello"));
        System.out.println(left2("java"));
        System.out.println(left2("Hi"));
    }
    public static String left2(String str) {
        return str.substring(2) + str.substring(0, 2);
//        int strLength = str.length();
//        String subStr = strLength > 2 ? str.substring(2, strLength) + str.substring(0, 2) : str;
//        return subStr;
    }
}