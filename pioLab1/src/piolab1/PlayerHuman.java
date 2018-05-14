package piolab1;

import java.util.Scanner;

public class PlayerHuman extends Player {

    Scanner reader = new Scanner(System.in);   
    private final String name;

    
    
    PlayerHuman(String name) {
        this.name = name;
    }

    public int guess() {
        return reader.nextInt();
    }
    
    @Override
    public String toString(){
        return name;
    }
}
