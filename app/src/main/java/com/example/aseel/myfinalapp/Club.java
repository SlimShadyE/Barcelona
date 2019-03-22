package com.example.aseel.myfinalapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Club extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_club_class);
        Button tvBack= (Button) findViewById(R.id.tvBack);
        Button tvDef= (Button) findViewById(R.id.tvDef);
        Button tvTro= (Button) findViewById(R.id.tvTro);

        tvBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Menu.class);
                startActivity(i);
            }
        });



    }
}
