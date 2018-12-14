package com.example.aseel.myfinalapp;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ShareActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share);

        Button btSave= findViewById(R.id.BtnSave);
        EditText etName=findViewById(R.id.etName);
        btSave.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {
        SharedPreferences pref=getSharedPreferences("mypref",MODE_PRIVATE);
        SharedPreferences.Editor editor=pref.edit();
    //    editor.putString


    }
}
