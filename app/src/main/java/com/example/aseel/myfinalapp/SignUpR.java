package com.example.aseel.myfinalapp;

import android.content.Context;
import android.content.Intent;
import android.media.tv.TvContract;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import java.util.List;

public class SignUpR extends AppCompatActivity implements View.OnClickListener{
    private static final String TAG = "FIREBASE";
    Button done;
    TextView signUp;
    EditText firstname,lastname,gmail,password;
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_r);

        firstname= findViewById(R.id.firstName);
        lastname= findViewById(R.id.lastName);
        signUp= findViewById(R.id.SignUp);
        gmail= findViewById(R.id.Gmail);
        password= findViewById(R.id.Password);

        done= findViewById(R.id.Done);
        done.setOnClickListener(this);

        mAuth = FirebaseAuth.getInstance();


    }
    @Override
    public void onStart() {
        super.onStart();
        // Check if user is signed in (non-null) and update UI accordingly.
        FirebaseUser currentUser = mAuth.getCurrentUser();
        //    updateUI(currentUser);
    }

    public void createAccount(String email, String password){
        mAuth.createUserWithEmailAndPassword(email, password)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            // Sign in success, update UI with the signed-in user's information
                            Log.d(TAG, "createUserWithEmail:success");
                            FirebaseUser user = mAuth.getCurrentUser();
                            Intent i = new Intent(SignUpR.this, SignInAactivity.class);
                            startActivity(i);
                           // updateUI(user);
                        } else {
                            // If sign in fails, display a message to the user.
                            Log.w(TAG, "createUserWithEmail:failure", task.getException());
                            Toast.makeText(SignUpR.this, "Authentication failed.",
                                    Toast.LENGTH_SHORT).show();
                            //updateUI(null);
                        }
                        // ...
                    }
                });
    }
    @Override
    public void onClick(View v) {
        String mail = gmail.getText().toString();
        String pass = password.getText().toString();
        if(mail.equals("") || pass.equals("") ){
            Toast.makeText(SignUpR.this, "Missing information",Toast.LENGTH_SHORT).show();
        }else{
            createAccount(mail, pass);
        }
    }
}