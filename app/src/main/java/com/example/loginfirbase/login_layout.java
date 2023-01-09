package com.example.loginfirbase;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class login_layout extends AppCompatActivity {

    ImageView back;
    Button login;
    TextView register, login_txt, sign_up_logo, description, forgot_pwd;
    EditText email_box, password_box;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //getSupportActionBar().hide();
        //getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_login_layout);

        back = findViewById(R.id.backBtn);
        login = findViewById(R.id.sign_inBtn);
        register = findViewById(R.id.register_txt);
        login_txt = findViewById(R.id.login_txt_top);
        sign_up_logo = findViewById(R.id.login_txt_middle);
        description = findViewById(R.id.already_txt);
        forgot_pwd = findViewById(R.id.forgotpwd);
        email_box = findViewById(R.id.email_box_login);
        password_box = findViewById(R.id.password_box_login);


        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(login_layout.this, MainActivity.class);
                startActivity(intent);

            }
        });

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(login_layout.this, Registration_layout.class);

                Pair[] pairs = new Pair[8];

                pairs[0] = new Pair<View, String>(login, "LoginBtn");
                pairs[1] = new Pair<View, String>(register, "RegisterHere");
                pairs[2] = new Pair<View, String>(login_txt, "Sign_up");
                pairs[3] = new Pair<View, String>(sign_up_logo, "SignUpLogo");
                pairs[4] = new Pair<View, String>(description, "description_login");
                pairs[5] = new Pair<View, String>(forgot_pwd, "forgotPwd");
                pairs[6] = new Pair<View, String>(email_box, "emailBox");
                pairs[7] = new Pair<View, String>(password_box, "PwdBox");


                ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(login_layout.this, pairs);
                startActivity(intent, options.toBundle());

            }
        });


    }
}