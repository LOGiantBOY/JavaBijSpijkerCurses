package H02;

import java.util.Scanner;

public class H2Opdracht3 {

    public static void main(String[] args) {
        System.out.println("OPDRACHT 2.3\n");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Typ het sart bedrag: ");
        double startBedrag = scanner.nextDouble();
        System.out.print("Typ het rentepercentage: ");
        double rente = scanner.nextDouble();
        double renteBedrag = rente / 100.0 * startBedrag;
        double totaal = startBedrag + renteBedrag;
        System.out.println("De rente is " + renteBedrag + " en het totaalbedrag is " + totaal);




    }
}
