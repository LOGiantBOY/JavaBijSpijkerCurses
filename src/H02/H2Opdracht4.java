package H02;

import java.util.Scanner;

public class H2Opdracht4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("OPDRACHT 2.4\n");

        System.out.print("Typ een getal tussen 10 en 100: ");
        int userInput = scanner.nextInt();
        int man1 = userInput - 2;
        int man2 = userInput - 1;
        int man3 = userInput + 1;
        int man4 = userInput + 2;
        System.out.println("De vijf getallen zijn " + man1 + " - " + man2 + " - " + userInput + " - " + man3 + " - " + man4);

    }
}
