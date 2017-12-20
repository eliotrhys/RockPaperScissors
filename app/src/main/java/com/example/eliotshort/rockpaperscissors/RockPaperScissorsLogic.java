package com.example.eliotshort.rockpaperscissors;

/**
 * Created by eliotshort on 20/12/2017.
 */

public class RockPaperScissorsLogic{

    Hand hand;

    public RockPaperScissorsLogic(Hand hand){
        this.hand = hand;
    }

    public String game(){

        String computerHand = hand.computerPlay();
        String playerHand = hand.getPlay();
        String win;

        if (
                (computerHand == "Rock" && playerHand == "Scissors") |
                        (computerHand == "Paper" && playerHand == "Rock")|
                        (computerHand == "Scissors" && playerHand == "Paper")

                )
        {
            win = "Computer played: " + computerHand + "\nPlayer played: " + playerHand + "\nComputer wins!";
        }
        else if (playerHand == computerHand){
            win = "It's a draw";

        }
        else{
            win = "Computer played: " + computerHand + "\nPlayer played: " + playerHand + "\nPlayer wins!";
        }

        return win;

    }


}
