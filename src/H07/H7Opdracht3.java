package H07;

import java.util.Scanner;

public class H7Opdracht3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter;
        System.out.println("Opdracht 7.3\n");
        System.out.println("geef me nu 10 dubbels dan bereken ik het gemiddelde en dan tel ik hoeveel getallen hoger zijn dan het gemiddelde:");
        double[] userinput = new double[10];
        for (int i = 0; i <10 ; i++) {
            userinput[i] = scanner.nextDouble();

        }
        double optelsom = 0;
        for (double waarde : userinput) {
            optelsom += waarde;
        }
        double gemiddelde = optelsom / 10;
        System.out.println("het gemiddelde is " + gemiddelde);
        counter = 0;
        for (double waarde : userinput) {
            if (waarde > gemiddelde) {
                counter++;
            }
        }
        System.out.println("het aantal doubels boven het gemiddelde is " + counter);
    }
}
