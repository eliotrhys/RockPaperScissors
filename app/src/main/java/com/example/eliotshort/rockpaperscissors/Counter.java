package com.example.eliotshort.rockpaperscissors;

/**
 * Created by eliotshort on 20/12/2017.
 */

public class Counter {

    int winCounter;
    int lossCounter;

    public Counter() {
        this.winCounter = 0;
        this.lossCounter = 0;
    }

    public int getWinCounter() {
        return winCounter;
    }

    public void setWinCounter(int winCounter) {
        this.winCounter = winCounter;
    }

    public int getLossCounter() {
        return lossCounter;
    }

    public void setLossCounter(int lossCounter) {
        this.lossCounter = lossCounter;
    }
}
