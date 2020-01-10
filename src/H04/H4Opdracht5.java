package H04;

import java.util.Scanner;

public class H4Opdracht5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("OPDRACHT 4.5\n");
        int randomNumber = (int) (Math.random() * 26 + 97);
        char assciiChar = (char) randomNumber;
        System.out.println("uw willekeurige letter is de " + assciiChar + ".");
    }
}
