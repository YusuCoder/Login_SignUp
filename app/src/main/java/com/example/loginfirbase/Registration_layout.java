package com.example.loginfirbase;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Registration_layout extends AppCompatActivity {

    ImageView back;
    Button nextBtn;
    TextView signUptxt, signUpLogo, decript, haveAnAcc;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration_layout);

        back = findViewById(R.id.backBtn);
        nextBtn = findViewById(R.id.sign_inBtn);
        signUptxt = findViewById(R.id.signUp_top);
        signUpLogo = findViewById(R.id.login_txt_middle);
        decript = findViewById(R.id.create_new_acc);
        haveAnAcc = findViewById(R.id.have_An_acc);


        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Registration_layout.this, login_layout.class);
                startActivity(intent);

            }
        });

        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Registration_layout.this, Registration2.class);

                startActivity(intent);

            }
        });


    }
}