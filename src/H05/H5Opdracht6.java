package H05;

import java.util.Scanner;

public class H5Opdracht6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("OPDRACHT 5.6");
        for (int i = 0; i < 100 ; i++) {
            if (i % 5 == 0) {
                System.out.println(i + " is delbaar door 5");
            }
        }
    }
}
