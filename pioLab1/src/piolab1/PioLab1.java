package piolab1;

import java.util.Random;
import java.util.Scanner;

public class PioLab1 {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        boolean zgadl = false;
        int i = 0;
        PlayerComp playerComp = new PlayerComp();
        PlayerHuman playerHuman = new PlayerHuman();
        Player playerDumb = new PlayerDumb();

        //System.out.println("Wybierz '1' jeżeli wybierasz demo, wybierz '2' jeżeli chcesz grać ręcznie");
        //int wyborWersji = reader.nextInt();
        do {
            Random rnd = new Random();
            int rzut = rnd.nextInt(6) + 1;

            if (rzut == playerDumb.guess()) {
                System.out.println("Zgadłeś liczbę! " + "\nJest to liczba: " + rzut);
                zgadl = true;
            } else {
                System.out.println("Nie zgadłeś, próbuj dalej, na kostce było: " + rzut);
            }

            i++;

        } while (zgadl == false);

        System.out.println("Zgadłeś za " + i + " razem!");

    }
}
