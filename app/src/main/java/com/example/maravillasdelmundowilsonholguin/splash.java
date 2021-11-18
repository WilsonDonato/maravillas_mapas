package com.example.maravillasdelmundowilsonholguin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class splash extends AppCompatActivity {

    private static final long SPLASH_SCREEN_DELAY = 3000;
    //variables
    Animation topAnim, bottomanim;
    ImageView image;
    TextView logo, slogan;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        this.setTitle("BIenvenido!!!");
        //Animacion
        topAnim = AnimationUtils.loadAnimation(this, R.anim.desplazamiento_arriba);
        bottomanim = AnimationUtils.loadAnimation(this, R.anim.desplazamiento_abajo);
        //Lògica y diseño
        image = findViewById(R.id.imageView);
        logo = findViewById(R.id.textView);
        slogan = findViewById(R.id.textView2);

        image.setAnimation(topAnim);
        logo.setAnimation(bottomanim);
        slogan.setAnimation(bottomanim);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(splash.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        },SPLASH_SCREEN_DELAY);

    }
}