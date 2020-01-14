package H06;

import java.util.Scanner;

public class H6Opdracht7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("OPDRACHT 6.7\n");
        System.out.print("Van welk getal wil je weten of het een priemgetal is? ");
        int getal = scanner.nextInt();
        boolean isPriem = isPriemgetal(getal);
        if (isPriem) {
            System.out.println("het getal " + getal + " is inderdaad een priemgetal");
        } else {
            System.out.println("het getal " + getal + " is geen priemgetal");
        }
    }
    public static boolean isPriemgetal(int getal) {
        if (getal < 2) {
            return false;
        }
        if (getal == 2 || getal == 3) {
            return true;
        }
        for (int i = 2; i <= (getal / 2) ; i++) {
           if (getal % i == 0) {
               return false;
           }
        }
        return true;
    }
}
