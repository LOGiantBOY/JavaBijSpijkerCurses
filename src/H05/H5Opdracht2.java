package H05;

import java.util.Scanner;

public class H5Opdracht2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("OPDRACHT 5.2\n");
        int score = 0;
        for (int i = 0; i <10 ; i++) {
            int getal1 = (int) (Math.random() * 10 + 1);
            int getal2 = (int) (Math.random() * 10 + 1);
            int optelsom = getal1 + getal2;
            System.out.print("Hoeveel is " + getal1 + " + " + getal2 + "? ");
            int userinput = scanner.nextInt();
            if (userinput == optelsom) {
                System.out.println("Dat Klopt!");
                score++;
            } else {
                System.out.println("Helaas het goede antwoor is " + optelsom + ".");
            }
            System.out.println("Je sore is: " + score);

        }
    }
}
