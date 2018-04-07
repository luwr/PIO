
package piolab1;

import java.util.Random;

public class Player {
    
    int liczbaWymyslona;
    private Random rnd = new Random();
    
    public int guess(){
        return liczbaWymyslona = rnd.nextInt(6)+1;
            }    
}
