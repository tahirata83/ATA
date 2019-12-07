package studyYourself;

public class StudyYourself3 {


    public static void main(String[] args) {

        // string tanımlanması
        String myString = "Merhaba dünya";

        if (myString.equals("merhaba dünya"))
            System.out.println("Aynı deger");
        else {
            System.out.println("Aynı deger degil");
        }
        System.out.println("1===================================================================================" );
        if (myString.equalsIgnoreCase("merhaba dünya"))
            System.out.println("Aynı deger");
        System.out.println("2===================================================================================" );
        System.out.println("Kucuk harfler : " + myString.toLowerCase());
        System.out.println("3===================================================================================" );
        System.out.println("buyuk harfler : " + myString.toUpperCase());
        System.out.println("4===================================================================================" );
        System.out.println("Bosluklar yok " + myString.trim());
        // basinda ve sonunda bosluk kalmaz
        System.out.println("5===================================================================================" );
        String[] words = myString.split(" ");

        System.out.println("6===================================================================================" );


    }
}



