package com.example.eliotshort.rockpaperscissors;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by eliotshort on 20/12/2017.
 */

public class LogicTest {

    RockPaperScissorsLogic testGame;
    Hand testHand;
    Counter testCounter;

    @Before

    public void before(){

        testHand = new Hand("Scissors");
        testGame = new RockPaperScissorsLogic(testHand);
        testCounter = new Counter();
    }

    @Test
    public void gameWorks1(){
        testHand.getOptions().clear();
        testHand.getOptions().add("Rock");
        assertEquals("Computer played: Rock\nPlayer played: Scissors\nCOMPUTER WINS.", testGame.game(testCounter));
    }


    @Test
    public void canChangeCounter(){
        testHand.getOptions().clear();
        testHand.getOptions().add("Rock");
        testGame.game(testCounter);
        testGame.game(testCounter);
        assertEquals(2, testCounter.getLossCounter());
    }

}
