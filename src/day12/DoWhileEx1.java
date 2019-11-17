import java.util.Scanner;
// == sign -> equal
// != sign -> not equal

public class DoWhileEx1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int pin = 0;
        do {
            System.out.println("Write your PIN: ");
            pin = scan.nextInt();

        } while (pin != 9999);
        System.out.println("Take you card");











    }
}
