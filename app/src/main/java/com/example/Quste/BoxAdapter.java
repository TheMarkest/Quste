package com.example.Quste;


import android.content.Context;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;

import com.example.myapplication.R;

import java.util.ArrayList;

public class BoxAdapter extends BaseAdapter {
    Context ctx;
    LayoutInflater lInflater;
    ArrayList<Question> objects;

    public BoxAdapter(forQuestions forQuestions, ArrayList<Question> questionsn) {
    }

    @Override
    public int getCount() {
        return objects.size();
    }

    @Override
    public Object getItem(int position) {
        return objects.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view = convertView;
        if (view == null) {
            view = lInflater.inflate(R.layout.item, parent, false);
        }
        Question it = getQuestion(position);

        ((TextView) view.findViewById(R.id.nameOtQuestion)).setText(it.title);
        for (int h = 0; h < it.anssiz; h++) {
            int key = it.answers.keyAt(h);
            ((Button) view.findViewById(R.id.VarF)).setText(key);
        }
        return view;

    }

    Question getQuestion(int position) {
        return ((Question) getItem(position));
    }

    public void setQuestions(SparseArray<Question> items) {
        this.objects = new ArrayList<>();
        for (int i = 0; i < items.size(); i++) {
            int key = items.keyAt(i);
            Object obj = items.get(key);
        }

    }

}
