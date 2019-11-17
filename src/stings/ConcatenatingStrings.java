package stings;

public class ConcatenatingStrings {
    public static void main(String[] args) {

        //   Concatenating Strings
        String s1 = "Hello ";
        String s2 = "World !!!";

        System.out.println(s1 + s2);
      // task 1. use seperate variable for each word print it in one line
         //        using concatenating
         //        "What", "is", "your", "name?"
         //        Hint.you can also add extra variable with space  => String s= " ";
         // 1. method
        String s3 = "What";
        String s4 = "is";
        String s5 = "your";
        String s6 = "name?";
         // 2. method
        System.out.println(s3 + "\n" +s4+ "\n" +s5 +"\n" + s6);

        String s7 = "What";
        String s8 = "is";
        String s9 = "your";
        String s10 = "name?";
        String space = "\n";
        System.out.println(s7 + space + s8 + space +s9 + space + s10);




    }
}
