package com.nikdemo.firebaseauthanticationdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn_simple,btn_mobile,btn_google,btn_facebook;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btn_simple = findViewById(R.id.btn_simple);
        btn_mobile = findViewById(R.id.btn_mobile);
        btn_google = findViewById(R.id.btn_google);
        btn_facebook = findViewById(R.id.btn_facebook);


        btn_simple.setOnClickListener(this);
        btn_mobile.setOnClickListener(this);
        btn_google.setOnClickListener(this);
        btn_facebook.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_simple:{
                startActivity(new Intent(MainActivity.this,SimpleAuthanticationActivity.class));
                break;
            }
            case R.id.btn_mobile:{
                startActivity(new Intent(MainActivity.this,MobileAuthActivity.class));
                break;
            }
            case R.id.btn_google:{
                startActivity(new Intent(MainActivity.this,GoogleAuthantication.class));
                break;
            }
            case R.id.btn_facebook:{

                break;
            }

        }
    }
}
