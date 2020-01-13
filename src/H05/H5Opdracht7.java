package H05;

import java.util.Scanner;

public class H5Opdracht7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("OPDRACHT 5.7\n");
        boolean proceed = true;
        int counter = 0;
        while (proceed) {
            int sqaure = counter * counter;
            if (sqaure < 1000) {
                System.out.println("het getal is " + counter);
                System.out.println("het kwadraat daarvan is " + sqaure);
                counter++;
            } else {
                proceed = false;
            }
        }
    }
}
