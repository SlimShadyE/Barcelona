/*package com.example.aseel.myfinalapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ListActivty extends AppCompatActivity implements AdapterView.OnItemClickListener{
    ListView lvItems;
    CustomAdapter customAdapter;
    ArrayList<Item> items;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_activty);

        lvItems=(ListView) findViewById(R.id.lvItems);
        items=new ArrayList<>();
        items.add(new Item(R.drawable.logo,"first"));
        items.add(new Item(R.drawable.logo,"second"));
        items.add(new Item(R.drawable.logo,"third"));
        items.add(new Item(R.drawable.logo,"fourth"));




        customAdapter=new CustomAdapter(this,R.layout.custom,items);
        lvItems.setAdapter(customAdapter);
        lvItems.setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Item selectedItem=items.get(position);
        if (selectedItem.equals("Germany"))
        if(position==0){

        }

    }
}*/
