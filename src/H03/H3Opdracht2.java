package H03;

import java.util.Scanner;

public class H3Opdracht2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("OPDRACHT 3.2\n");
        int random1 = (int) (Math.random() * 10 + 1);
        int random2 = (int) (Math.random() * 10 + 1);
        int random3 = (int) (Math.random() * 10 + 1);
        System.out.print("Hoeveel is " + random1 + " x " + random2 + " x " + random3 + " ? ");
        int userInput = scanner.nextInt();
        int uitkomst = random1 * random2 * random3;
        if (userInput == uitkomst) {
            System.out.println("Helemaal goed!");
        } else {
            System.out.println("Onjuist maar dit is het goede antwoord " + uitkomst);
        }

    }
}
