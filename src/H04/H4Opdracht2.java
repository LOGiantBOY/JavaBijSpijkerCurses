package H04;

import java.util.Scanner;

public class H4Opdracht2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Van welk karakter wil je weten of het een getal of letter is? ");
        char userInput = scanner.nextLine().charAt(0);
        if (Character.isLetter(userInput)) {
            System.out.println("De " + userInput + " is een letter.");
        } else if (Character.isDigit(userInput)) {
            System.out.println("De " + userInput + " is een getal.");
        } else {
            System.out.println("De " + userInput + " is geen getal of letter");
        }
    }
}
