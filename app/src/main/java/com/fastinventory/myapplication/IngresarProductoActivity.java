package com.fastinventory.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class IngresarProductoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ingresar_producto);
    }
    public void regresarIngrePro(View view) {
        Intent regreIngrePro = new Intent(IngresarProductoActivity.this,MenuSegundarioActivity.class);
        startActivity(regreIngrePro);
    }
}