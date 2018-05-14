package piolab1;

import java.util.Random;
import java.util.Scanner;

public class PioLab1 {

    public static void main(String[] args) {

        //ZMIENNE
        Scanner reader = new Scanner(System.in);
        boolean zgadl = false;
        int i = 0;
        Player player = null;
        int choose = 0;
        String name;

        //WSTĘP
        System.out.print("---------GUESS GAME!---------\n");

        
        //WYBÓR GRACZA
        while (choose != 1 && choose != 2 && choose != 3) {
            System.out.println("Wybierz '1' jeżeli wybierasz demo - komputer będzie grał za Ciebie.\nWybierz '2' jeżeli chcesz grać ręcznie.\nWybierz '3' jeżeli jesteś głupkiem.");
            System.out.print("Wybieram wersję numer: ");
            choose = reader.nextInt();
            
            switch (choose) {
                case 1:
                    player = new PlayerComp();
                    System.out.println("Wybrałeś wersję w której to komputer gra za Ciebie.");
                    break;

                case 2:
                    System.out.print("Podaj imię: ");
                    name = reader.next();
                    player = new PlayerHuman(name);
                    System.out.println("Cześć " + name + ". Trafiłeś do gry Guess Game.");
                    System.out.println("Wpisuj kolejno cyfry z zakresu <1;6> do momentu, aż trafisz odpowiednią liczbę!");
                    System.out.println("Powodzenia " + player.toString() + "!");
                    break;

                case 3:
                    player = new PlayerDumb();
                    System.out.println("\nWybrałeś gre głupkiem. Podajesz tylko szóstki!");
                    break;
            }
        }

        //GUESSGAME
        do {
            Random rnd = new Random();
            int rzut = rnd.nextInt(6) + 1;
            System.out.print("Podaj liczbę: ");

            if (rzut == player.guess()) {
                System.out.println("Zgadłeś liczbę! " + "\nJest to liczba: " + rzut);
                zgadl = true;
            } else {
                System.out.println("Nie zgadłeś, próbuj dalej, na kostce było: " + rzut);
            }
            i++;

        } while (zgadl == false);

        //PODSUMOWANIE
        System.out.println("Brawo! Zgadłeś za " + i + " razem!");

    }
}
