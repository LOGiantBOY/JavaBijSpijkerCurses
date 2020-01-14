package H07;

public class H7Opdracht1 {
    public static void main(String[] args) {
        System.out.println("OPDRACHT 7.1\n");
        System.out.println("Hierkomen 100 worpen met dec dobbelsteen: \n");
        int[] worpen = new int[100];
        for (int i = 0; i <100 ; i++) {
            int getal = (int) (Math.random() * 6 + 1);
            worpen[i] = getal;
        }
        int counter = 1;
        for (int worp : worpen) {
            System.out.print(worp + " ");
            if (counter % 10 == 0) {
                System.out.println();
            }
            counter++;
        }
    }

}