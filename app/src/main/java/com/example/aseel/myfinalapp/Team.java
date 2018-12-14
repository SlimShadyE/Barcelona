package com.example.aseel.myfinalapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class Team extends AppCompatActivity implements AdapterView.OnItemClickListener {
    ListView lvTeam;
    CustomAdapter customAdapter;
    ArrayList<Player> player;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_team);

        lvTeam= findViewById(R.id.lvTeam);

        player = new ArrayList<>();
      player.add(new Player("Ter Stegan","GK",R.drawable.terstegen));
        player.add(new Player("Cillessen","GK",R.drawable.cillessen));
        player.add(new Player("Semedo","RB",R.drawable.semedo));
        player.add(new Player("Roberto","RB",R.drawable.roberto));
        player.add(new Player("Pique","CB",R.drawable.pique));
        player.add(new Player("Umtiti","CB",R.drawable.umtiti));
        player.add(new Player("Vermaelen","CB",R.drawable.vermaelen));
        player.add(new Player("Alba","LB",R.drawable.alba));
        player.add(new Player("Raktic","CM",R.drawable.rakitic));
        player.add(new Player("Denis Suarez","CM",R.drawable.suarez));
        player.add(new Player("Busqutes","CDM",R.drawable.busqutes));
        player.add(new Player("Coutinho","CAM",R.drawable.coutinho));
        player.add(new Player("Arthur","CAM",R.drawable.arthur));
        player.add(new Player("Rafinha","CM",R.drawable.rafinha));
        player.add(new Player("Vidal","CDM",R.drawable.vidal));
        player.add(new Player("Luis Suarez","St",R.drawable.suarez1));
        player.add(new Player("Messi","RW",R.drawable.messi));
        player.add(new Player("Dembele","LW",R.drawable.dembele));
        player.add(new Player("Malcom","RW",R.drawable.malcom));


        customAdapter=new CustomAdapter(this, R.layout.custom, player);
        lvTeam.setAdapter(customAdapter);
        lvTeam.setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

    }
}
