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

    @Before

    public void before(){

        testHand = new Hand("Scissors");
        testGame = new RockPaperScissorsLogic(testHand);
    }

    @Test
    public void gameWorks(){
        testHand.getOptions().clear();
        testHand.getOptions().add("Rock");
        assertEquals("Computer played: Rock\nPlayer played: Scissors\nComputer wins!", testGame.game());
    }

}
