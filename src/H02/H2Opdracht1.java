package H02;

import java.util.Scanner;

public class H2Opdracht1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("OPDRACHT 2.1\n");
        System.out.print("Typ het aantal mijlen: ");
        double miles = scanner.nextDouble();
        double kilometers = miles * 1.6;
        int tussenstap = (int) (kilometers * 10);
        kilometers = tussenstap / 10.0;
        System.out.println(miles + " mijlen is " + kilometers + " kilometer");


    }
}
