package com.example.Quste;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.myapplication.R;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    public void newScreen(View v) {
        Intent obj = new Intent(SecondActivity.this, forQuestions.class);
        startActivity(obj);


    }

    public void startGame(View v) {
        Intent obj = new Intent(SecondActivity.this, ActivityForGame.class);
        startActivity(obj);
    }


}







