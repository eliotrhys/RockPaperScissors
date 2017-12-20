package com.example.eliotshort.rockpaperscissors;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by eliotshort on 20/12/2017.
 */

public class Hand {

    ArrayList<String> options;
    String play;


    public Hand(String play){
        this.play = play;
        this.options = new ArrayList<>();
        options.add("Rock");
        options.add("Paper");
        options.add("Scissors");
    }

    public String getPlay() {
        return play;
    }

    public String computerPlay(){
        Collections.shuffle(options);
        return options.get(0);
    }

    public ArrayList<String> getOptions() {
        return options;
    }
}
