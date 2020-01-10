package H04;

import java.util.Arrays;
import java.util.Scanner;

public class H4Opdracht7 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("OPDRACHT 4.7\n");
        System.out.print("land 1: ");
        String country1 = scanner.nextLine();
        System.out.print("land 2: ");
        String country2 = scanner.nextLine();
        System.out.print("land 3: ");
        String country3 = scanner.nextLine();
        String[] countries = {country1, country2, country3};
        Arrays.sort(countries);
        System.out.println(countries[0] + " - " + countries[1] + " - " + countries[2]);


    }
}
