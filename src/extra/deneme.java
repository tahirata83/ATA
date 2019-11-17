package extra;

public class deneme {

        public static void main(String[] args) {
            int num1 = 5;
            int num2 = 7;
            addMethod(num1, num2);

            int num3 = 6;
            int num4 = 8;

            multiplyMethod(num3, num4);

            int num5 = 21;
            int num6 = 34;

            deductMethod(num5, num6);

            int num7 =35;
            int num8 = 5;

            divideMethod(num7, num8);

        }

        static void addMethod ( int num1, int num2){

        System.out.println(num1 + num2);
    }
        static void multiplyMethod ( int num3, int num4){
            System.out.println(num3 * num4);

        }

        static void deductMethod ( int num5, int num6){
        System.out.println(num5 - num6);

    }

        static void divideMethod ( int num7, int num8){
            System.out.println(num7 / num8);

    }



    }




