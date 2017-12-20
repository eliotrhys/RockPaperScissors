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
                (computerHand.equals("Rock") && playerHand.equals("Scissors")) |
                (computerHand.equals("Rock") && playerHand.equals("Lizard")) |
                (computerHand.equals("Paper") && playerHand.equals("Rock")) |
                (computerHand.equals("Paper") && playerHand.equals("Spock")) |
                (computerHand.equals("Scissors") && playerHand.equals("Paper")) |
                (computerHand.equals("Scissors") && playerHand.equals("Lizard")) |
                (computerHand.equals("Lizard")  && playerHand.equals("Paper")) |
                (computerHand.equals("Lizard")  && playerHand.equals("Spock")) |
                (computerHand.equals("Spock") && playerHand.equals("Rock"))  |
                (computerHand.equals("Spock") && playerHand.equals("Scissors"))
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
