package H04;

import java.util.Scanner;

public class H4Opdracht3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("OPDRACHT 4.3\n");
        System.out.print("Van welke letter wil je weten of het een klinker is? ");
        char userInput = scanner.nextLine().toLowerCase().charAt(0);
        // A, E, I, O, U
        if (userInput == 'a' || userInput == 'e' || userInput == 'i' || userInput == 'o' || userInput == 'u' ) {
            System.out.println("De " + userInput + " is een klinker");
        } else {
            System.out.println("De " + userInput + " is een medeklinker");
        }

    }
}
