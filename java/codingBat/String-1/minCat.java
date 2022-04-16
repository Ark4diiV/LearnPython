//Given two strings, append them together (known as "concatenation") and return the result.
//However, if the strings are different lengths, omit chars from the longer string so it is the same length as the shorter string.
//So "Hello" and "Hi" yield "loHi". The strings may be any length.
//minCat("Hello", "Hi") → "loHi"
//minCat("Hello", "java") → "ellojava"
//minCat("java", "Hello") → "javaello"

public class minCat{
    public static void main(String... args) {
        System.out.println(minCat("Hello", "Hi"));
        System.out.println(minCat("Hello", "java"));
        System.out.println(minCat("java", "Hello"));
    }
    public static String minCat(String a, String b) {
        int lengthA = a.length();
        int lengthB = b.length();
        int lengthX = 0;

        if (lengthA >= lengthB) {
            lengthX = lengthB;
        } else {
            lengthX = lengthA;
        }

        String str = a.substring(lengthA - lengthX) + b.substring(lengthB - lengthX);
        return str;
    }
}