package piolab1;

import java.util.Random;

public class PioLab1 {

    public static void main(String[] args) {

        boolean zgadl = false;
        int i = 0;

        do {
            Random rnd = new Random();
            int rzut = rnd.nextInt(6)+1;
            Player player = new Player();

            if (rzut == player.guess()) {
                System.out.println("Zgadłeś liczbę! " + "\nJest to liczba: " + rzut);
                zgadl = true;
            } else {
                System.out.println("Nie zgadłeś, próbuj dalej.");
            }

            i++;

        } while (zgadl == false);

        System.out.println("Zgadłeś za " + i +" razem!");

    }
}
