package com.petsclues.petclues;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Inicio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);
    }

    public void perfil (View view){
        Intent intentP = new Intent(this, Perfil.class);
        startActivity(intentP);
    }

    public void mascota (View view){
        Intent intentM = new Intent(this, Mascota.class);
        startActivity(intentM);
    }

    public void codigo (View view){
        Intent intentQr = new Intent(this, CQr.class);
        startActivity(intentQr);
    }

    public void rastreo (View view){
        Intent intentR = new Intent(this, Maps.class);
        startActivity(intentR);
    }

    public void configuracion (View view){
        Intent intentC = new Intent(this, Configuracion.class);
        startActivity(intentC);
    }

}
