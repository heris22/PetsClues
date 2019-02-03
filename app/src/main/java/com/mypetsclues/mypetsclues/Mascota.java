package com.mypetsclues.mypetsclues;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Mascota extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mascota);
    }

    public void nuevo (View view){
        Intent intentN = new Intent(this, RegisPet.class);
        startActivity(intentN);
    }
}
