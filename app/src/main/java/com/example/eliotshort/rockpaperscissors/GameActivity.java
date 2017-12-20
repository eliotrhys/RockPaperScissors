package com.example.eliotshort.rockpaperscissors;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class GameActivity extends AppCompatActivity {

    TextView gameResult;
    TextView winCounter;
    TextView lossCounter;
    ImageButton rockButton;
    ImageButton paperButton;
    ImageButton scissorButton;
    ImageButton spockButton;
    ImageButton lizardButton;
    Hand hand;
    RockPaperScissorsLogic game;
    Counter counter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        gameResult = findViewById(R.id.game_result);
        rockButton = findViewById(R.id.rock);
        paperButton = findViewById(R.id.paper);
        scissorButton = findViewById(R.id.scissors);
        spockButton = findViewById(R.id.spock);
        lizardButton = findViewById(R.id.lizard);
        winCounter = findViewById(R.id.win_counter);
        lossCounter = findViewById(R.id.loss_counter);
        counter = new Counter();

    }


    public void executeGame(){
        gameResult.setText(game.game(counter));
        winCounter.setText("Wins: " + counter.getWinCounter());
        lossCounter.setText("Losses: " + counter.getLossCounter());

    }

    public void onRockButtonClick(View view){
        game = new RockPaperScissorsLogic(hand = new Hand("Rock"));
        executeGame();
    }

    public void onPaperButtonClick(View view){
        game = new RockPaperScissorsLogic(hand = new Hand("Paper"));
        executeGame();
    }

    public void onScissorsButtonClick(View view){
        game = new RockPaperScissorsLogic(hand = new Hand("Scissors"));
        executeGame();
    }

    public void onLizardButtonClick(View view){
        game = new RockPaperScissorsLogic(hand = new Hand("Lizard"));
        executeGame();
    }

    public void onSpockButtonClick(View view){
        game = new RockPaperScissorsLogic(hand = new Hand("Spock"));
        executeGame();
    }

}
