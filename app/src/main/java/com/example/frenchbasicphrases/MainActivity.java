package com.example.frenchbasicphrases;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public static final String LOCK = "lock";

    public void phrase(View view){
        Button buttonPressed = (Button) view;
        MediaPlayer mp = MediaPlayer.create(this, getResources().getIdentifier(buttonPressed.getTag().toString(),"raw", getPackageName()));
        mp.start();
        String messagePass = buttonPressed.getTag().toString();
        Intent intent = new Intent(this,MainActivity2.class);
        intent.putExtra(LOCK, messagePass);
        startActivity(intent);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}