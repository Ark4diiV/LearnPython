//Return the number of times that the string "hi" appears anywhere in the given string.
//countHi("abc hi ho") → 1
//countHi("ABChi hi") → 2
//countHi("hihi") → 2

public class countHi{
    public static void main(String... args) {
        System.out.println(countHi("abc hi ho"));
        System.out.println(countHi("ABChi hi"));
        System.out.println(countHi("hihi"));

    }
    public static int countHi(String str) {
        int count = 0;
        for (int x = 0; x < str.length() - 1; x += 1) {
            if (str.substring(x, x + 2).equals("hi")) {
                count += 1;
            }
        } return count;

    }
}