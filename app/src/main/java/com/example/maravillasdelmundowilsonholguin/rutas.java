package com.example.maravillasdelmundowilsonholguin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class rutas extends AppCompatActivity {
    private static final long SPLASH_SCREEN_DELAY = 3000;
    Animation topAnim, bottomanim;
    ImageView image;
    EditText etubicacion,etdestino;
    Button ruta;


    //codigo rutas
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setTitle("Trazar Rutas - Wilson Holguin");
        setContentView(R.layout.activity_rutas);
        etubicacion = findViewById(R.id.ubicacion);
        etdestino = findViewById(R.id.destino);
        ruta = findViewById(R.id.btnruta);

        ruta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sSource = etubicacion.getText().toString().trim();
                String sDestination = etdestino.getText().toString().trim();

                if (sSource.equals("") && sDestination.equals("")) {
                    Toast.makeText(getApplicationContext(), "No se ingreso ninguna ubicacion", Toast.LENGTH_SHORT).show();
                } else {
                    DiplayTrack(sSource, sDestination);
                }
            }
        });
        //Codigo animacion
            setContentView(R.layout.activity_rutas);
            //Animacion
            topAnim = AnimationUtils.loadAnimation(this, R.anim.desplazamiento_arriba);
            bottomanim = AnimationUtils.loadAnimation(this, R.anim.desplazamiento_abajo);
            //Lògica y diseño
            image = findViewById(R.id.imagenruta);
            image.setAnimation(bottomanim);



    }

    private void DiplayTrack(String sSource, String sDestination) {
        try {
            Uri uri = Uri.parse("https://www.google.co.in/maps/dir/"+ sSource +"/"+sDestination);

            Intent intent=new Intent(Intent.ACTION_VIEW,uri);
            intent.setPackage("com.google.android.apps.maps");
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
        }catch (ArithmeticException e){
            Uri uri = Uri.parse("https://play.google.com/store/apps/details?=com.google.android.apps.maps");
            Intent intent = new Intent(Intent.ACTION_VIEW,uri);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
        }
    }


}
