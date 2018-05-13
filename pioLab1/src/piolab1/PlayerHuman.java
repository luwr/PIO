
package piolab1;

import java.util.Scanner;

public class PlayerHuman extends Player {
    
    Scanner reader = new Scanner(System.in);  
    private int liczbaWymyslona = 0;
    
    public int guess() {
        System.out.print("Podaj liczbę: ");
        System.out.println("");
        return liczbaWymyslona = reader.nextInt();    
    }
}
