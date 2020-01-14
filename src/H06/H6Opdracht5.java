package H06;

import java.util.Scanner;

public class H6Opdracht5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("OPDRACHT 6.5\n");
        System.out.print("Van welk getal wil je de dag weten? ");
        int getal = scanner.nextInt();
        String dag = bepaalDag(getal);
        System.out.println("bij nummer " + getal + " Hoort de weekdag " + dag);


    }

    public static String bepaalDag(int dagnummer) {
        switch (dagnummer) {
            case 1:
                return "maandag";
            case 2:
                return "dinsdag";

            case 3:
                return "woensdag";

            case 4:
                return "donderdag";

            case 5:
                return "vrijdag";

            case 6:
                return "zaterdag";

            case 7:
                return "zondag";

            default:
                return "Onbekende dag";
        }
    }
}
