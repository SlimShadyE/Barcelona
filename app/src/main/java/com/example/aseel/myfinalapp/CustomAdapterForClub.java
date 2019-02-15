package com.example.aseel.myfinalapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;

import java.util.ArrayList;

public class CustomAdapterForClub extends ArrayAdapter<ClubClass> {
    private int resorceLayot;
    private Context aContext;


    public CustomAdapterForClub(@NonNull Context context, int resource, @NonNull ArrayList<ClubClass> objects) {
        super(context, resource, objects);
        this.resorceLayot = resource;
        this.aContext = context;
    }

    public View getView(int postion, View convertView, ViewGroup parent) {
        View v = convertView;

        if (v == null)
            v = LayoutInflater.from(aContext).inflate(resorceLayot, parent, false);
        ClubClass p = getItem(postion);

        if (p != null) {

            Button tvBack= v.findViewById(R.id.tvBack);
            Button tvDef= v.findViewById(R.id.tvDef);
            Button tvTro= v.findViewById(R.id.tvTro);
            Button tv3Comp= v.findViewById(R.id.tv3Comp);
            Button tv3Players= v.findViewById(R.id.tv3Players);

        }
    }
}
