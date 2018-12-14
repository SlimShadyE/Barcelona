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

    public class CustomAdapter extends ArrayAdapter<Player> {

        private int resorceLayot;
        private Context aContext;


        public CustomAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Player> objects) {
            super(context, resource, objects);
            this.resorceLayot=resource;
            this.aContext=context;
        }
        public View getView(int postion, View convertView, ViewGroup parent) {
            View v = convertView;

            if (v == null)
                v = LayoutInflater.from(aContext).inflate(resorceLayot, parent, false);
            Player p = getItem(postion);
            if (p != null) {
                TextView tvName = v.findViewById(R.id.tvName);
                tvName.setText(p.getName());

                TextView tvPos = v.findViewById(R.id.tvPos);
                tvPos.setText(p.getPos());

                ImageView imageView=v.findViewById(R.id.imagePlayer);
                imageView.setImageResource(p.getImage());
            }


            return v;

        }
    }

