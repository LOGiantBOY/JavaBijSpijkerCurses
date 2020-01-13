package H05;

import java.util.Scanner;

public class H5Opdracht1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("OPDRACHT 5.1\n");
        boolean proceed = true;
        while (proceed) {
            System.out.print("Wat is je toetscijfer? ");
            double  grade = scanner.nextDouble();
            if (grade == -1) {
                proceed = false;
                System.out.println("tot ziens");
                continue;
            } else if (grade >= 5.5) {
                System.out.println("Je hebt een voldoende!");
            } else {
                System.out.println("helaas je hebt een onvodoende!");
            }
        }
    }
}
