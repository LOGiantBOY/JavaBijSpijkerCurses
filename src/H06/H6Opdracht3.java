package H06;

import java.util.Scanner;

public class H6Opdracht3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("OPDRACHT 6.3\n");
        int getal1 = (int) (Math.random() * 10 + 1);
        int getal2 = (int) (Math.random() * 10 + 1);
        int product = berekenProduct(getal1,getal2);
        System.out.println("het product van " + getal1 + " x " + getal2 + " = " + product);

    }
    public static int berekenProduct(int getal1, int getal2) {
        int product = getal1 * getal2;
        return product;
    }
}
