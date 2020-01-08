package H03;

import java.util.Scanner;

public class H3Opdracht1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("OPDRACHT 3.1\n");
        int random1 = (int) (Math.random() * 10 + 1);
        int random2 = (int) (Math.random() * 10 + 1);
        System.out.print("Hoeveel is " + random1 + " + " + random2 + " ? ");
        int userInput = scanner.nextInt();
        int uitkomst = random1 + random2;
        if (userInput == uitkomst) {
            System.out.println("Klopt!");
        } else {
            System.out.println("Onjuist maar dit is het goede antwoord " + uitkomst);
        }

    }
}
