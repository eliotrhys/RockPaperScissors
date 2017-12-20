package com.example.eliotshort.rockpaperscissors;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertNotNull;

/**
 * Created by eliotshort on 20/12/2017.
 */

public class HandTest {

    Hand testHand;

    @Before

    public void before(){
        testHand = new Hand("Rock");
    }

    @Test
    public void computerPlayRandom(){
        assertNotNull(testHand.computerPlay());
    }

}
