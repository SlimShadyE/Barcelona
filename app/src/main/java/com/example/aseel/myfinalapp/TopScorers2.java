package com.example.aseel.myfinalapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

    public class TopScorers2 extends AppCompatActivity implements AdapterView.OnItemClickListener {
    ListView lvTopscorers;
    CustomAdapter customAdapter;
    ArrayList<Player> scorer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_scorers2);

        lvTopscorers=(ListView)(findViewById(R.id.lvScorer));

        scorer = new ArrayList<>();
        scorer.add(new Player("1) Messi","569",R.drawable.messi));
        scorer.add(new Player("2) Suarez","162",R.drawable.suarez1));
        scorer.add(new Player("3) Rivaldo","133",R.drawable.rivaldo));
        scorer.add(new Player("4) Eto'o","130",R.drawable.etoo));
        scorer.add(new Player("5) Kluivert","123",R.drawable.kluivert));
        scorer.add(new Player("6) Stoichkov","114",R.drawable.stoichkov));
        scorer.add(new Player("7) Enrique","110",R.drawable.enrique));
        scorer.add(new Player("8) Neymar","105",R.drawable.neymar));
        scorer.add(new Player("9) Pedro","99",R.drawable.pedro));
        scorer.add(new Player("10) Ronaldinho","94",R.drawable.ronaldinho));
        scorer.add(new Player("11) Bakero","93",R.drawable.bakero));
        scorer.add(new Player("12) Xavi","85 ",R.drawable.xavi));
        scorer.add(new Player("13) Koeman","82",R.drawable.koeman));
        scorer.add(new Player("14) Begirstain","78",R.drawable.begirstain));
        scorer.add(new Player("15) Saviola","72",R.drawable.saviola));
        scorer.add(new Player("16) Salinas","72",R.drawable.salinas));
        scorer.add(new Player("17) Amor","C64",R.drawable.amor));
        scorer.add(new Player("18) Schuster","61",R.drawable.schuster));
        scorer.add(new Player("19) Quini","60",R.drawable.quini));
        scorer.add(new Player("20) Iniesta","57",R.drawable.iniesta));

        customAdapter=new CustomAdapter(this, R.layout.custom, scorer);
        lvTopscorers.setAdapter(customAdapter);
        lvTopscorers.setOnItemClickListener(this);

    }
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        }
    }
