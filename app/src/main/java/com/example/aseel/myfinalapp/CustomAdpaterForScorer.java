package com.example.aseel.myfinalapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class CustomAdpaterForScorer extends ArrayAdapter<TopScorer> {

    private int resorceLayot;
    private Context aContext;


    public CustomAdpaterForScorer(@NonNull Context context, int resource, @NonNull ArrayList<TopScorer> objects) {
        super(context, resource, objects);
        this.resorceLayot=resource;
        this.aContext=context;
    }
    public View getView(int postion, View convertView, ViewGroup parent) {
        View v = convertView;

        if (v == null)
            v = LayoutInflater.from(aContext).inflate(resorceLayot, parent, false);
        TopScorer p = getItem(postion);

        if (p != null) {
            TextView tvRank = v.findViewById(R.id.tvRank);
            tvRank.setText(p.getRank());

            TextView tvName = v.findViewById(R.id.tvName);
            tvName.setText(p.getName());

            TextView tvApp = v.findViewById(R.id.tvApp);
            tvApp.setText(p.getApp());

            TextView tvMin = v.findViewById(R.id.tvMin);
            tvMin.setText(p.getMinutes());

            TextView tvGoalsPMatch = v.findViewById(R.id.tvGoalsPMatch);
            tvGoalsPMatch.setText(p.getGoalspermatch());

            TextView tvGoals = v.findViewById(R.id.tvGoals);
            tvGoals.setText(p.getGoals());

            ImageView imageView=v.findViewById(R.id.imageScorer);
            imageView.setImageResource(p.getPicture());
        }


        return v;

    }
}


