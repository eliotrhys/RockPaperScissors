package com.example.eliotshort.rockpaperscissors;

/**
 * Created by eliotshort on 20/12/2017.
 */

public class RockPaperScissorsLogic{

    Hand hand;

    public RockPaperScissorsLogic(Hand hand) {
        this.hand = hand;
    }

    public String game(Counter counter){

        String computerHand = hand.computerPlay();
        String playerHand = hand.getPlay();
        String win;
        int counterLoss = counter.getLossCounter();
        int counterWin = counter.getLossCounter();

        if (
                (computerHand == "Rock" && playerHand == "Scissors") |
                (computerHand == "Rock" && playerHand == "Lizard") |
                (computerHand == "Paper" && playerHand == "Rock") |
                (computerHand == "Paper" && playerHand == "Spock") |
                (computerHand == "Scissors" && playerHand == "Paper") |
                (computerHand == "Scissors" && playerHand == "Lizard") |
                (computerHand == "Lizard" && playerHand == "Paper") |
                (computerHand == "Lizard" && playerHand == "Spock") |
                (computerHand == "Spock" && playerHand == "Rock") |
                (computerHand == "Spock" && playerHand == "Scissors")
                )
        {
            win = "Computer played: " + computerHand + "\nPlayer played: " + playerHand + "\nComputer wins!";
            counterLoss +=1;
            counter.setLossCounter(counterLoss);
        }
        else if (playerHand == computerHand){
            win = "Computer played: " + computerHand + "\nPlayer played: " + playerHand + "\nIt's a draw";

        }
        else{
            win = "Computer played: " + computerHand + "\nPlayer played: " + playerHand + "\nPlayer wins!";
            counterWin +=1;
            counter.setWinCounter(counterWin);
        }

        return win;

    }


}
