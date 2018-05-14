package piolab1;

import java.util.Random;

public class PlayerComp extends Player {

    int liczbaWymyslona;
    private Random rnd = new Random();

    @Override
    public int guess() {
        return liczbaWymyslona = rnd.nextInt(6) + 1;
    }
}
