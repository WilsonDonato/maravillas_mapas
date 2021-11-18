package com.example.maravillasdelmundowilsonholguin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity { 

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setTitle("Mapas Maravillas - Wilson Holguin ");
        setContentView(R.layout.activity_main);
    }

    public void cusco(View view) {
        Intent intent = new Intent(MainActivity.this,maps_cusco.class);
        startActivity(intent);
    }

    public void antiguo(View view) {
        Intent intent = new Intent(MainActivity.this,mapasantiguos.class);
        startActivity(intent);
    }

    public void moderno(View view) {
        Intent intent = new Intent(MainActivity.this,mapasmodernos.class);
        startActivity(intent);
    }

    public void comidaa(View view) {
        Intent intent = new Intent(MainActivity.this,comidas.class);
        startActivity(intent);
    }

    public void ruta(View view) {
        Intent intent = new Intent(MainActivity.this,rutas.class);
        startActivity(intent);
    }

}