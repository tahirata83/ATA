package day4;

public class day4 {

        public static void main(String[] args) {


        String first = "hi";
        String second = "Bye";

        anyMethod(first, second);

    }

        static void anyMethod(String first, String second)    {
            System.out.println(first + second + first + second);
        }


    //   exampla 2


    {

    String first1 = "hi";
    String second1 = "Bye";

    makeAbba(first1, second1);

}
    static void makeAbba(String first1, String second1)    {
        System.out.println(first1 + second1 + first1 + second1);
    }

    //

    {
        int num = 54;
        String first2= "Yo";
        String second2 = "Alice";

        anyNameYouWant(first2, second2, num);

    }
    static void anyNameYouWant(String first2, String second2, Integer third)    {
        System.out.println(first2 + second2 + first2 + second2);
    }


    public static class studyYourself {

        public static void main(String[] args) {

            System.out.println("Welcome\nto\nJava\nProgramming!");

            System.out.println("Merhaba\nAhmet\nBey!");
            int number1 = 6;
            int number2 = 7;
            int sum;
            sum = number1 + number2;

            System.out.println("sum" + sum);


            //   9 september (java book)


            System.out.printf("%s\n%s\n",
                    "Welcome to", "Java Programming!");

            }
        }
}












