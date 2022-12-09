package com.fastinventory.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }
    public void iniciarSesion(View view){
        Intent iniSe = new Intent(MenuActivity.this,InicioSesionActivity.class);
        startActivity(iniSe);
    }
    public void crearUsuario(View view) {
        Intent crearUsu = new Intent(MenuActivity.this, CrearUsuarioActivity.class);
        startActivity(crearUsu);
    }


}