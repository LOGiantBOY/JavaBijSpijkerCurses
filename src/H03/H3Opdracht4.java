package H03;

import java.util.Scanner;

public class H3Opdracht4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("OPDRACHT 3.4\n");
        System.out.print("Welke weekdag is het nu? ( 1 = ma / 2 = di / 3 = wo / 4 = do / 5 = vr / 6 = za / 7 = zo ) ");
        int weekdag = scanner.nextInt();
        System.out.print("En van hoeveel dagen in de toekomst wil je de weekdag berekenen? ");
        int toekomst = scanner.nextInt();

        int resultaat = weekdag + toekomst;
        if (resultaat > 7) {
            resultaat = resultaat % 7;
        }
        String[] weekdagen = {"onbekend","maandag","dinsdag","woensdag","donderdag","vrijdag","zaterdag","zondag"};



        System.out.println("Vandaag is het " + weekdagen[weekdag] + " en over " + toekomst + " dagen is het " + weekdagen[resultaat]);

    }
}
