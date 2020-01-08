package H03;

import java.util.Scanner;

public class H3Opdracht5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("OPDRACHT 3.5");
        System.out.print("Wat is uw gewicht (kg) ? ");
        double gewicht = scanner.nextDouble();
        System.out.print("wat is uw lengte (m) ? ");
        double lengte = scanner.nextDouble();
        double teller = gewicht;
        double noemer = lengte * lengte;
        double bmi = teller / noemer;
        int tussenstap = (int) (bmi * 100);
        bmi = tussenstap / 100.0;
        System.out.println("Uw BMI is " + bmi + ".");
        String conclusie = "onbekend";
        if (bmi < 18.5) {
            conclusie = "ondergewicht heeft";
        } else if (bmi < 25) {
            conclusie = "dat u een normaal gewicht heeft";
        } else {
            conclusie = "zwaar overgewicht heeft";
        }
        System.out.println("Als u minstens 20 jaar bent betekent dit dat u " + conclusie + ".");

    }
}
