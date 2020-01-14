package H06;

import java.util.Scanner;

public class H6opdracht6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("OPDRACHT 6.6\n");
        System.out.print("Van welk getal wil je weten of het een even getal is? ");
        int getal = scanner.nextInt();
        boolean isEvenGetal = isEvenGetal(getal);
        if (isEvenGetal) {
            System.out.println("het getal " + getal + " is even");
        } else {
            System.out.println("het getal " + getal + " is oneven");

        }

    }
    public static boolean  isEvenGetal(int getal) {
        if (getal % 2 == 0) {
            return  true;
        } else {
            return false;
        }
    }
}
