package H06;

import java.util.Scanner;

public class H6Opdracht4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("OPDRACHT 6.4\n");
        System.out.println("We gaan twee getallen vermenigvuldigen. ");
        System.out.print("Wat is getal 1 ");
        int getal1 = scanner.nextInt();
        System.out.print("Wat is getal 2 ");
        int getal2 = scanner.nextInt();
        int product = berekenProduct(getal1,getal2);
        System.out.println("het product van " + getal1 + " x " + getal2 + " = " + product);


    }
    public static int berekenProduct(int getal1, int getal2) {
        int product = getal1 * getal2;
        return product;
    }
}
