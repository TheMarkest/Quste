package com.example.Quste;


import android.util.SparseArray;

public class Quest {
    private static Quest instance = null;
    SparseArray<Question> questions;
    Question curQuestion = null;

    private Quest() {
        questions = new SparseArray<>();
    }

    public static Quest getInstance() {
        if (instance == null)
            instance = new Quest();
        return instance;
    }
}
