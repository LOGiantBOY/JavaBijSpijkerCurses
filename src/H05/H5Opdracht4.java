package H05;

import java.util.Scanner;

public class H5Opdracht4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("OPDRACHT 5.4\n");
        int lowestNumber = 0;
        for (int i = 0; i <5 ; i++) {
            System.out.print("Typ een getal: ");
            int number = scanner.nextInt();
            if (i == 0) {
                lowestNumber = number;
            } else {
                if (number < lowestNumber ) {
                    lowestNumber = number;
                }
            }
        }
        System.out.println("Het laagste getal is " + lowestNumber);
    }
}
