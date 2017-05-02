package com.example.Quste;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import com.example.myapplication.R;

import java.util.ArrayList;

public class forQuestions extends AppCompatActivity {
    ArrayList<Question> questionsn = new ArrayList<Question>();
    BoxAdapter adapter;
    ListView listview;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.forquestions);
        adapter = new BoxAdapter(this, questionsn);
        listview = (ListView) findViewById(R.id.questions);//мне нужна эта строчка?
    }

    public void newscr(View v) {
        Intent obj = new Intent(forQuestions.this, MainActivity.class);
        startActivity(obj);
    }

    @Override
    protected void onResume() {
        super.onResume();
        adapter.setQuestions(Quest.getInstance().questions);
        listview.setAdapter(adapter);
        if (Quest.getInstance().curQuestion != null) {
            new TextView(this).setText("вопрос");
            new Button(this).setText("ответ1");
            new Button(this).setText("ответ2");
            new Button(this).setText("ответ3");
            new Button(this).setText("ответ4");
        }
    }
}
