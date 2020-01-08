package H03;

import java.util.Arrays;
import java.util.Scanner;

public class H3Opdracht6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("OPDRACHT 3.6\n");
        System.out.print("getal 1: ");
        int getal1 = scanner.nextInt();
        System.out.print("getal 2: ");
        int getal2 = scanner.nextInt();
        System.out.print("getal 3: ");
        int getal3 = scanner.nextInt();
        int[] getallen = { getal1,getal2,getal3};
        Arrays.sort(getallen);
        System.out.println("van klein naar groot: " + getallen[0] + " - " + getallen[1] + " - " + getallen[2]);

    }
}
