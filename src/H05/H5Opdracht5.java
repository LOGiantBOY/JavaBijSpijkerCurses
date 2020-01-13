package H05;

import java.util.Scanner;

public class H5Opdracht5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("OPDRACHT 5.5\n");
        double hihgestGrade = 0;
        String student = "unkonwn";
        for (int i = 1; i <=5 ; i++) {
            System.out.print("Hoe heet de" + i + " student? ");
            String name = scanner.nextLine();
            System.out.println("Wat is je cijfer");
            double grade = scanner.nextDouble();
            scanner.nextLine();
            if (i == 0) {
                hihgestGrade = grade;
                student = name;
            } else {
                if (grade > hihgestGrade) {
                    hihgestGrade = grade;
                    student = name;
                }
            }
        }
        System.out.println("het hoogste cijfer is behaald " + student + " en dat cijfer is " + hihgestGrade);
    }
}
