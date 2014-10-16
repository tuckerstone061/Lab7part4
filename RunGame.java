

package part4;

import java.util.*;

/**
 *
 * @author Tucker Stone
 * @version Oct 15, 2014
 */
public class RunGame {
    
    public static void main( String [] args ) {
        String []items = { "Old Shoe", "Guppie", "Catfish", "Dogfish", "Big Salmon", "MARLIN" };
        
        FishingGame game = new FishingGame();
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Welcome to the new Fishing Game!");        
        System.out.println("Ready to start fishin?!? (yes/no)");
        while (scan.next().equalsIgnoreCase("yes"))
        {
            System.out.println(game.goFish());    
            System.out.println("\nKeep fishing? (yes/no)");
            
        }
        
        if (game.getRounds() > 0) {
            System.out.println("\n" + game.winMessage());
        }
        System.out.println("\nI hope it was fun! Bye");

        
    }

}
