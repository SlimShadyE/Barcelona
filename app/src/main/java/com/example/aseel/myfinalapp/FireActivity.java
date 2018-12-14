package com.example.aseel.myfinalapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class FireActivity extends AppCompatActivity {
    EditText etEmail,etPass;
    Button save;
    TextView tv1,tv2;
    ArrayList<String> users;
    ListView lvUsers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fire);
        save= findViewById(R.id.Save);

        users=new ArrayList<String>();
        lvUsers= findViewById(R.id.lvUsers);
       final ArrayAdapter adapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1,users);
        lvUsers.setAdapter(adapter);

        etEmail= findViewById(R.id.etEmail);
        etPass= findViewById(R.id.etPass);
        tv1= findViewById(R.id.tv1);
        tv2= findViewById(R.id.tv2);


        final FirebaseDatabase database=FirebaseDatabase.getInstance();
        final DatabaseReference myRef=database.getReference();
      /*  myRef.child("Users").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value=dataSnapshot.getValue(String.class);
                tv1.setText(value);


            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });*/
       myRef.child("Users").addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(DataSnapshot dataSnapshot,String s)
            {
                String name=dataSnapshot.getValue(String.class);
                users.add(name);
                adapter.notifyDataSetChanged();
            }

            @Override
            public void onChildChanged(DataSnapshot dataSnapshot, String s) {

            }

            @Override
            public void onChildRemoved(DataSnapshot dataSnapshot) {

            }

            @Override
            public void onChildMoved(DataSnapshot dataSnapshot, String s) {

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }

        });

        save.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email=tv1.getText().toString();
                myRef.child("Users").setValue(email);
                myRef.child("Users").setValue("Aseel");
           //     myRef.child("Users").push().setValue(email);

            }
        }));




    }
}
