package day6;




    class StringSubstrings {

        //Substrings
        public static void main(String[] args) {
            //0123456789
            String string1 = "Hello World";
            System.out.println(string1.substring(6)); // World
            System.out.println(string1.substring(3));
            System.out.println(string1.substring(8));
            System.out.println(string1.substring(0,1)); // H
            System.out.println(string1.substring(6,7)); // W
            System.out.println(string1.substring(11,11));
            System.out.println(string1.substring(7,9));
            System.out.println(string1.substring(0));




            String string2 = "Michela Jackson";

            System.out.println(string2.substring(0,1)+string2.substring(8,9));



            String string3 = "The quick brown fox jumps over the lazy dog";

            System.out.println(string3.substring(10,25));







        }
    }





