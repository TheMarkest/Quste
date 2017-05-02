package com.example.Quste;


import android.util.SparseArray;

import java.util.ArrayList;

public class Question {
    String title;
    int anssiz;


    SparseArray<Answer> answers;


    String image;

    Question() {
        answers = new SparseArray<>();
    }

    public ArrayList<String> makeRow() {
        ArrayList<String> row = new ArrayList<>();
        row.add(title);
        row.add(image);


        row.add(anssiz + "");
        for (int i = 0; i < anssiz; i++) {
            int key = answers.keyAt(i);
            Answer ans = answers.get(key);
            row.add(ans.title);
            row.add(ans.nextQuest + "");
        }
        return row;
    }
}
