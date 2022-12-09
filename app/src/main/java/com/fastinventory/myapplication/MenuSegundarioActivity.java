package com.fastinventory.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MenuSegundarioActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_segundario);
    }
    public void ingresarProSeg(View view) {
        Intent ingreProSeg = new Intent(MenuSegundarioActivity.this,IngresarProductoActivity.class);
        startActivity(ingreProSeg);
    }
    public void regresarMenuSeg(View view) {
        Intent regreMenSeg = new Intent(MenuSegundarioActivity.this,MenuActivity.class);
        startActivity(regreMenSeg);
    }
}