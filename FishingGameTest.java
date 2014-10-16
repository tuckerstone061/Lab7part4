/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package part4;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author sstoneman1
 */
public class FishingGameTest {
    private FishingGame game;
    
    
    public FishingGameTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("SETUP CLASS RUNNING - Nothing to do.");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("TEARDOWN CLASS RUNNING - Nothing to do.");
    }
    
    @Before
    public void setUp() {
        game = new FishingGame();
    }
    
    @After
    public void tearDown() {
        System.out.println("TEARDOWN RUNNING - Nothing to do.");
    }

    /**
     * Test of goFish method, of class FishingGame.
     */
    @Test
    public void testGoFish() {
        System.out.println("goFish");
        assertTrue(game.goFish());
    }

    /**
     * Test of getRounds method, of class FishingGame.
     */
    @Test
    public void testGetRounds() {
        System.out.println("getRounds");
        assertEquals(0, game.getRounds());
    }

    /**
     * Test of winMessage method, of class FishingGame.
     */
    @Test
    public void testWinMessage() {
        System.out.println("winMessage");
        game.setPoints(10);
        game.setRounds(5);
        assertEquals("Not a COMPLETE waste of time!\n", game.winMessage());
    }

    /**
     * Test of setRounds method, of class FishingGame.
     */
    @Test
    public void testSetRounds() {
        System.out.println("setRounds");
        game.setRounds(5);
        assertEquals(5, game.getRounds());
    }

    /**
     * Test of getPoints method, of class FishingGame.
     */
    @Test
    public void testGetPoints() {
        System.out.println("getPoints");
        assertEquals(0, game.getPoints());
    }

    /**
     * Test of setPoints method, of class FishingGame.
     */
    @Test
    public void testSetPoints() {
        System.out.println("setPoints");
        game.setPoints(10);
        assertEquals(10, game.getPoints());
    }
    
}
