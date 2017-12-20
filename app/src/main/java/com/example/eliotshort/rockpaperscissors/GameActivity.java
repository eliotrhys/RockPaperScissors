package com.example.eliotshort.rockpaperscissors;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class GameActivity extends AppCompatActivity {
    TextView gameResult;
    Button rockButton;
    Button paperButton;
    Button scissorButton;
    Hand hand;
    RockPaperScissorsLogic game;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        gameResult = findViewById(R.id.game_result);
        rockButton = findViewById(R.id.rock);
        paperButton = findViewById(R.id.paper);
        scissorButton = findViewById(R.id.scissors);
    }

    public void onRockButtonClick(View view){
        game = new RockPaperScissorsLogic(hand = new Hand("Rock"));
        gameResult.setText(game.game());
    }

    public void onPaperButtonClick(View view){
        game = new RockPaperScissorsLogic(hand = new Hand("Paper"));
        gameResult.setText(game.game());
    }

    public void onScissorsButtonClick(View view){
        game = new RockPaperScissorsLogic(hand = new Hand("Scissors"));
        gameResult.setText(game.game());
    }

}
