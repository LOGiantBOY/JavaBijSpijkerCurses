package H04;

import java.util.Scanner;

public class H4Opdracht4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("OPDRACHT 4.4\n");
        System.out.print("Van welke letter wil je het nummer in de oude telefoon weten? ");
        char userInput = scanner.nextLine().toLowerCase().charAt(0);
        if (userInput == 'a' || userInput == 'b' || userInput == 'c') {
            System.out.println("De letter " + userInput + " staat op de 2 toets .");
        } else if (userInput == 'd' || userInput == 'e' || userInput == 'f') {
            System.out.println("De letter " + userInput + " staat op de 3 toets .");
        } else if (userInput == 'g' || userInput == 'h' || userInput == '1') {
            System.out.println("De letter " + userInput + " staat op de 4 toets .");
        } else if (userInput == 'j' || userInput == 'k' || userInput == 'l') {
            System.out.println("De letter " + userInput + " staat op de 5 toets .");
        } else if (userInput == 'm' || userInput == 'n' || userInput == 'o') {
            System.out.println("De letter " + userInput + " staat op de 6 toets .");
        } else if (userInput == 'p' || userInput == 'q' || userInput == 'r' || userInput == 's') {
            System.out.println("De letter " + userInput + " staat op de 7 toets .");
        } else if (userInput == 't' || userInput == 'u' || userInput == 'v') {
            System.out.println("De letter " + userInput + " staat op de 8 toets .");
        } else if (userInput == 'w' || userInput == 'x' || userInput == 'y' || userInput == 'z') {
            System.out.println("De letter " + userInput + " staat op de 9 toets .");
        }
    }
}
