

package part4;

import java.util.*;

/**
 *
 * @author Tucker Stone
 * @version Oct 15, 2014
 * 
 */
public class FishingGame {
    
    private String []items = { "Old Shoe", "Guppie", "Catfish", "Dogfish", "Big Salmon", "MARLIN" };
    private int points;
    private int rounds;
    
    public FishingGame() {
        this.points = 0;
        this.rounds = 0;
    }
    
    public boolean goFish() {
        Random ran = new Random();
        int index = ran.nextInt(6);
        points+=(index+1);
        System.out.println("You found a " + items[index] + " for " + (index+1) + " points!");
        rounds++;
        System.out.println("Congrats! you found a " + items[index] + "!");
        if ( index >= 0 && index < 6)
            return true;
        else
            return false;
        
    }
    
    public int getRounds() {
        return this.rounds;
    }
    
    public void setRounds(int rounds) {
        this.rounds = rounds;
    }
    
    public int getPoints() {
        return this.points;
    }
    
    public void setPoints(int points) {
        this.points = points;
    }
    
    public String winMessage() {
        System.out.println("You got " + this.points + " points in "
                + this.rounds + " round(s)!");
        if ((points / rounds) <= 1)
            return "\nFish a little harder next time...\n";
        else if ((points / rounds) <= 3)
            return "Not a COMPLETE waste of time!\n";
        else if ((points / rounds) <= 4)
            return "Whoa! not bad...\n";
        else if ((points / rounds) < 5)
            return "Wait you're actually kind of good at this.\n";
        else
            return "You're a god\n";
    }
    
    
}
