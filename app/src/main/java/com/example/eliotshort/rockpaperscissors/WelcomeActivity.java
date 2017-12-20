package com.example.eliotshort.rockpaperscissors;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WelcomeActivity extends AppCompatActivity {

    Button playButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        playButton = findViewById(R.id.play_button);
    }

    public void onPlayButtonClick(View view){
        Intent intent = new Intent(this, GameActivity.class);
        startActivity(intent);
    }


}
