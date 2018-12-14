package com.example.aseel.myfinalapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class TopScorers extends AppCompatActivity implements AdapterView.OnItemClickListener {
        ListView lvScorers;
        CustomAdpaterForScorer customAdapter;
        ArrayList<TopScorer> player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_scorers);

        lvScorers=(ListView)findViewById(R.id.lvScorers);

        player=new ArrayList<>();

        player.add(new TopScorer("1","           Messi","      655","              93","     0.87"," 567",R.drawable.messi));
        player.add(new TopScorer("2","           Suarez","      217","              115","     0.75"," 162",R.drawable.suarez1));
        player.add(new TopScorer("3","           Rivaldo","      236","              151","     0.56"," 133",R.drawable.rivaldo));
        player.add(new TopScorer("4","           Eto'o","      199","              126","     0.65"," 130",R.drawable.etoo));
        player.add(new TopScorer("5","           Kluivert","      259","              171","     0.47"," 123",R.drawable.kluivert));
        player.add(new TopScorer("6","           Stoichkov","      247","              160","     0.46"," 114",R.drawable.stoichkov));
        player.add(new TopScorer("7","           Enrique","      247","              160","     0.37"," 110",R.drawable.enrique));
        player.add(new TopScorer("8","           Neymar","      186","              146","     0.56"," 106",R.drawable.neymar));
        player.add(new TopScorer("9","           Pedro","      321","              196","     0.31"," 99",R.drawable.pedro));
        player.add(new TopScorer("10","           Ronaldinho","      207","              184","     0.45"," 94",R.drawable.ronaldinho));
        player.add(new TopScorer("11","           Bakero","      337","              281","     0.28"," 93",R.drawable.bakero));
        player.add(new TopScorer("12","           Xavi","      769","              694","     0.11"," 85",R.drawable.xavi));
        player.add(new TopScorer("13","           Koeman","      252","              259","     0.33"," 82",R.drawable.koeman));
        player.add(new TopScorer("14","           Begirstain","      295","              277","     0.26"," 78",R.drawable.begirstain));
        player.add(new TopScorer("15","           Saviola","      173","              160","     0.42"," 72",R.drawable.saviola));
        player.add(new TopScorer("16","           Salinas","      196","              175","     0.37"," 72",R.drawable.salinas));
        player.add(new TopScorer("17","           Amor","      408","              443","     0.16"," 64",R.drawable.amor));
        player.add(new TopScorer("18","           Schuster","      176","              251","     0.35"," 61",R.drawable.schuster));
        player.add(new TopScorer("19","           Quini","      116","              150","     0.52"," 60",R.drawable.quini));
        player.add(new TopScorer("20","           Iniesta","      674","              814","     0.08"," 57",R.drawable.iniesta));


        customAdapter=new CustomAdpaterForScorer(this, R.layout.activity_top_scorer, player);
        lvScorers.setAdapter(customAdapter);
        lvScorers.setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

    }


}
