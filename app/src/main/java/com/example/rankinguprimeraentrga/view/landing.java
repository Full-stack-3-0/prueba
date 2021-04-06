package com.example.rankinguprimeraentrga.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.rankinguprimeraentrga.R;

public class landing extends AppCompatActivity {

    private TextView iniciaSesion;
    private TextView crearCuenta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing);
        iniciaSesion = (TextView)findViewById(R.id.textLogin);
        crearCuenta = (TextView)findViewById(R.id.textSignUp);
    }


    public void changeToLogin(View view)
    {
        Intent login = new Intent(this, logIn.class);
        startActivity(login);
    }

    public void changeToSignUp(View view)
    {
        Intent signup = new Intent(this, SignUp.class);
        startActivity(signup);
    }




}
