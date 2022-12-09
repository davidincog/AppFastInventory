package com.fastinventory.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class InicioSesionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio_sesion);
    }
    public void iniciarS(View view) {
        Intent iniSesion = new Intent(InicioSesionActivity.this,MenuSegundarioActivity.class);
        startActivity(iniSesion);
    }
    public void regresarMenPri(View view) {
        Intent regreMenPri = new Intent(InicioSesionActivity.this,MenuActivity.class);
        startActivity(regreMenPri);
    }


}