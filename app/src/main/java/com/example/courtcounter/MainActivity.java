package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreA = 0, scoreB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void displayforteamaA(int score){
        scoreA = score;
        TextView scoreview = (TextView) findViewById(R.id.txt1);
        scoreview.setText(String.valueOf(scoreA));
    }

    public void displayforteamaB(int score){
        scoreB = score;
        TextView scoreview = (TextView) findViewById(R.id.txt11);
        scoreview.setText(String.valueOf(scoreB));
    }

    public void btone(View view) {
        scoreA+=3;
        displayforteamaA(scoreA);
    }

    public void bttwo(View view) {
        scoreA+=2;
        displayforteamaA(scoreA);
    }

    public void btthree(View view) {
        scoreA++;
        displayforteamaA(scoreA);
    }

    public void btonex(View view) {
        scoreB+=3;
        displayforteamaB(scoreB);
    }

    public void bttwox(View view) {
        scoreB+=2;
        displayforteamaB(scoreB);
    }

    public void btthreex(View view) {
        scoreB++;
        displayforteamaB(scoreB);
    }

    public void btreset(View view) {
        scoreA = 0;
        scoreB = 0;
        displayforteamaA(scoreA);
        displayforteamaB(scoreB);
    }
}