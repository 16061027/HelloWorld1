package com.example.helloworld;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button Bt1 = findViewById(R.id.bt1);
        Switch s1 = findViewById(R.id.sw1);
        CheckBox c1 = findViewById(R.id.cb1);
        final TextView Tv1 = findViewById(R.id.Tv1);
        final ImageView pic1 = findViewById(R.id.p1);

        Bt1.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.N)
            @Override
            public void onClick(View v) {
                Tv1.setText("Welcome to the show!");

            }



        });
        s1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if(isChecked){
                    Tv1.setText("Hello World!");
                }
                else{
                    Tv1.setText("Welcome to the show!");
                }
            }
        });

        c1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    Tv1.setText("I really love this world!");
                }
                else{
                    Tv1.setText("I dislike it!");
                }
            }
        });


    }
}
