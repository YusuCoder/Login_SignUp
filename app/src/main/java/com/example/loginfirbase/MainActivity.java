package com.example.loginfirbase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    Animation buttom, logo_anim;
    LinearLayout buttom_layout;
    ImageView logo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final Button login = findViewById(R.id.loginBtn);


        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, login_layout.class);
                startActivity(intent);

            }
        });





        buttom = AnimationUtils.loadAnimation(this, R.anim.buttom_anim);
        logo_anim = AnimationUtils.loadAnimation(this, R.anim.logo_anim);

        buttom_layout = findViewById(R.id.buttom_panel);
        logo = findViewById(R.id.logo_top);

        buttom_layout.setAnimation(buttom);
        logo.setAnimation(logo_anim);


    }
}