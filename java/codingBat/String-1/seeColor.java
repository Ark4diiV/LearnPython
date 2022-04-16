//Given a string, if the string begins with "red" or "blue" return that color string, otherwise return the empty string.
//seeColor("redxx") → "red"
//seeColor("xxred") → ""
//seeColor("blueTimes") → "blue"

public class seeColor{
    public static void main(String... args) {
        System.out.println(seeColor("redxx"));
        System.out.println(seeColor("xxred"));
        System.out.println(seeColor("blutTimes"));
        System.out.println(seeColor("re"));
        System.out.println(seeColor("a"));
        System.out.println(seeColor(""));
    }
    public static String seeColor(String str) {
        int len=str.length();
             
        if(len>=3)
        {
          if(str.substring(0,3).equals("red"))
                 return "red";
          else if(str.substring(0,3).equals("blu"))
          {
                 if(len==3)
                      return "";
                 else
                      return "blue";
          }
            else
                return "";
        }
        else
        {
               return"";
        }
    }
}
