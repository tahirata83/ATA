package extra;

public class studyYourself {
        public static void main(String[] args) {
            //    What is the numerical range of a char data type in Java?
//    a) -128 to 127
//    b) 0 to 256
//    c) 0 to 32767
//    d) 0 to 65535
//
//        answer is d
//    What is the output of this program?
//
//    class mainclass {
//        public static void main(String args[])
//        {
//            char a = 'A';
//            a++;
//            System.out.print((int)a);
//        }
//    }
//    a) 66
//    b) 67
//    c) 65
//    d) 64

//
//    What is the output of this program?
//
          //  answer is 66


//    class asciicodes {
//        public static void main(String args[])
//        {
//            char var1 = 'A';
//            char var2 = 'a';
//            System.out.println((int)var1 + " " + (int)var2);
//        }
//    }
//    a) 162
//    b) 65 97
//    c) 67 95
//    d) 66 98

//
//
//
//    Which of these methods can be used to convert all characters in a String into a character array?
//    a) charAt()
//    b) both getChars() & charAt()
//    c) both toCharArray() & getChars()
//    d) All of the mentioned



            char a = 'A';
            a++;
            System.out.println((int)a);




            char var1 = 'A';
            char var2 = 'a';
          System.out.println((int)var1 + " " + (int)var2);


            char [] charArray = { 'T', 'A', 'H','Y', 'R' };
            String str = new String(charArray);
            System.out.println((str));



        }
    }



