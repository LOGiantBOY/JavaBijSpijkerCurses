package H04;

import java.util.Scanner;

public class H4Opdracht1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("OPDRACHT 4.1\n");
        System.out.print("Van welk karakter wil je de ASCII waarde weten? ");
        char userInput = scanner.nextLine().charAt(0);
        int asciiValeu = (int) userInput;
        System.out.println("De ASCII waarde van het karakter " + userInput + " is " + asciiValeu + " .");
    }
}
