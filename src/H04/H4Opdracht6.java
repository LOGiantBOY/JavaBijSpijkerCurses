package H04;

import java.util.Scanner;

public class H4Opdracht6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("OPDRACHT 4.6\n");
        System.out.print("Typ een string ");
        String userString = scanner.nextLine();
        int lengte = userString.length();
        System.out.println("De lengte van de String is " + lengte + ".");
        char firstChar = userString.charAt(0);
        System.out.println("Het eerste karakter is " + firstChar + ".");
        char lastChar = userString.charAt(lengte - 1);
        System.out.println("Het laatste karakter is " + lastChar + ".");

    }
}
