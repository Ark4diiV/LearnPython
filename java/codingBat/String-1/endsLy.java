//Given a string, return true if it ends in "ly".
//endsLy("oddly") → true
//endsLy("y") → false
//endsLy("oddy") → false

public class endsLy{
    public static void main(String... args) {
        System.out.println(endsLy("oddly"));
        System.out.println(endsLy("y"));
        System.out.println(endsLy("oddy"));
    }
    public static Boolean endsLy(String str) {
        String strCheck = "ly";
        Boolean strSubstr = (str.length() < 2) ? false :
        (strCheck.compareTo(str.substring(str.length() - 2)) == 0) ? true : false;
        return strSubstr;
    } 
}