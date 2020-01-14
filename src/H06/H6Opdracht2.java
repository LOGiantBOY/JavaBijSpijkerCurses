package H06;

import java.util.Scanner;

public class H6Opdracht2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("OPDRACHT 6.2\n");
        System.out.print("welk zinnetje wil je printen ");
        String userinput = scanner.nextLine();
        printZinnetje(userinput);

    }

    public static void  printZinnetje(String zinnetje) {
        System.out.println(zinnetje);
    }

}
