package H07;

import java.util.Scanner;

public class H7Opdracht2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("OPDRACHT 7.2\n");
        System.out.print("geef me 9 intergers: ");
        int[] getallen = new int[9];
        for (int i = 0; i <9 ; i++) {
            getallen[i] = scanner.nextInt();
        }
        System.out.println("daar komen ze in omgekeerde volgorde");

        for (int i = 8; i >= 0 ; i--) {
            System.out.print(getallen[i] + " ");
        }
    }
}
