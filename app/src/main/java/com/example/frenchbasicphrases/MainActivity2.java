package com.example.frenchbasicphrases;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    private String message;
    TextView textClick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textClick = (TextView) findViewById(R.id.textView);

        Intent intent = getIntent();
        message = intent.getStringExtra(MainActivity.LOCK);
        switch (message) {
            case "doyouspeakenglish":
                message = "Do you speak\nEnglish?";
                break;
            case "goodevening":
                message = "Good Evening!";
                break;
            case "hello":
                message = "Hello!";
                break;
            case "howareyou":
                message = "How are you?";
                break;
            case "ilivein":
                message = "I live in . . .";
                break;
            case "mynameis":
                message = "My name is . . .";
                break;
            case "please":
                message = "Please";
                break;
            case "welcome":
                message = "Welcome!";
        }
        textClick.setText(message);
    }

    public void back(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}