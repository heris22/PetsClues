package com.petsclues.petclues;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sinCuenta (View view){
        Intent intent = new Intent(this, Inicio.class);
        startActivity(intent);
    }

    public void log (View view){
        Intent intentL = new Intent(this, LogIn.class);
        startActivity(intentL);
    }
}
