package com.example.aseel.myfinalapp;

import android.app.AlarmManager;
import android.app.AlertDialog;
import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.app.AlertDialog;
import android.content.DialogInterface;


public class Menu extends AppCompatActivity implements DialogInterface.OnClickListener {


    @Override
    public void onClick(DialogInterface dialog, int which) {
        if(which==dialog.BUTTON_POSITIVE);

        {
            super.onBackPressed();
            dialog.cancel();
        }
        if(which==dialog.BUTTON_NEGATIVE)
        {
            dialog.cancel();

        }
    }

    @Override
    public void onBackPressed() {
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.setMessage("You'll have to login another time, Are you sure you want to exit?");
        builder.setCancelable(true);
        builder.setPositiveButton("yes",this);
        builder.setNegativeButton("no",this);
        AlertDialog dialog=builder.create();
        dialog.show();



    }

    private static final int NOTIFICATION_REMINDER_NIGHT=3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
/*
        TextView players= findViewById((R.id.players));
        TextView messi= findViewById((R.id.topScorers));
        TextView laLiga= findViewById((R.id.games));
        TextView home= findViewById((R.id.home));*/

        ImageButton team= findViewById(R.id.teamImg);
        team.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Team.class);
                startActivity(i);
            }
        });

        ImageButton topScorers= findViewById(R.id.messiImg);
        topScorers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), TopScorers.class);
                startActivity(i);
            }
        });

        ImageButton games= findViewById(R.id.laligaImg);
        games.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Games.class);
                startActivity(i);
            }
        });

        ImageButton club= findViewById(R.id.campnouImg);
        club.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Club.class);
                startActivity(i);
            }
        });

        Intent notifyIntent = new Intent(this,MyReceiver.class);
        PendingIntent pendingIntent = PendingIntent.getBroadcast
                (this, NOTIFICATION_REMINDER_NIGHT, notifyIntent, PendingIntent.FLAG_UPDATE_CURRENT);
        AlarmManager alarmManager = (AlarmManager) this.getSystemService(this.ALARM_SERVICE);
        alarmManager.setRepeating(AlarmManager.RTC_WAKEUP,  System.currentTimeMillis(),
                1000 * 60 * 60 * 24, pendingIntent);

        Intent intent = new Intent(this, MusicService.class);
        startService(intent);

    }
}
