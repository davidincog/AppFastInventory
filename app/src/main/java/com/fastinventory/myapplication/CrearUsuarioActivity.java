package com.fastinventory.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class CrearUsuarioActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear_usuario);
    }
    public void regresarCrearUsu(View view) {
        Intent regreCrearUsu = new Intent(CrearUsuarioActivity.this,MenuActivity.class);
        startActivity(regreCrearUsu);
    }
}