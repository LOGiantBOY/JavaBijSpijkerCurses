package H02;

import java.util.Scanner;

public class H2Opdracht2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("OPDRACHT 2.2\n");
        System.out.print("Hoeveel jaar oud ben je? ");
        int leeftijd = scanner.nextInt();
        System.out.print("Hoeveel maanden komen daar nog bij? ");
        int maanden = scanner.nextInt();
        int minuten = leeftijd * 365 * 24 * 60 + maanden * 30 * 24 * 60;
        System.out.println("Dan benn je ongeveer " + minuten + " minuten oud");
    }
}
