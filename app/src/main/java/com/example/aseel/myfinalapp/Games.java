package com.example.aseel.myfinalapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class Games extends AppCompatActivity implements AdapterView.OnItemClickListener {
    ListView lvGames;
    CustomAdapter customAdapter;
    ArrayList<Player> club;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_games);

        lvGames=(ListView)(findViewById(R.id.lvGames));

        club = new ArrayList<>();
        club.add(new Player("18/08/18","Alaves",R.drawable.alaves));
        club.add(new Player("25/08/18","Valladolid",R.drawable.valladolid));
        club.add(new Player("02/09/18","Huesca",R.drawable.huesca));
        club.add(new Player("15/09/18","Real Sociedad",R.drawable.realsociedad));
        club.add(new Player("23/09/18","Girona",R.drawable.girona));
        club.add(new Player("26/09/18","Leganes",R.drawable.leganes));
        club.add(new Player("29/09/18","Athletic Bilbao",R.drawable.athleticbilbao));
        club.add(new Player("07/10/18","Valencia",R.drawable.valencia));
        club.add(new Player("20/10/18","Sevilla",R.drawable.sevilla));
        club.add(new Player("28/10/18","Real Madrid",R.drawable.realmadrid));
        club.add(new Player("03/11/18","Rayo Vallecano",R.drawable.rayovallecano));
        club.add(new Player("11/11/18","Real Betis",R.drawable.realbetis));
        club.add(new Player("24/11/18","Atletico Madrid",R.drawable.atleticomadrid));
        club.add(new Player("02/12/18","Villarreal",R.drawable.villarreal));
        club.add(new Player("08/12/18","Espanyol",R.drawable.espanyol));
        club.add(new Player("16/12/18","Levante",R.drawable.levante));
        club.add(new Player("22/12/18","Celta Vigo",R.drawable.celta));
        club.add(new Player("06/01/19","Getfae",R.drawable.getafe));
        club.add(new Player("13/01/19","Eibar",R.drawable.eibar));


        customAdapter=new CustomAdapter(this, R.layout.custom, club);
        lvGames.setAdapter(customAdapter);
        lvGames.setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

    }
}

