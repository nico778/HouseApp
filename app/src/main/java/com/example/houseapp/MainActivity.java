package com.example.houseapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    boolean isSwitchOn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button wifiButton = (Button) findViewById(R.id.button1);
        ImageView ledImage = (ImageView) findViewById(R.id.led);
        isSwitchOn = false;
        wifiButton.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                if (!isSwitchOn) {
                    wifiButton.setText("START CHARGING");
                    wifiButton.setTextColor(Color.parseColor("white"));
                    wifiButton.setBackgroundColor(Color.parseColor("#36BD31"));
                    ledImage.setImageResource(R.mipmap.charge_off);
                    isSwitchOn=true;
                }else{
                    wifiButton.setText("STOP CHARGING");
                    wifiButton.setTextColor(Color.parseColor("white"));
                    wifiButton.setBackgroundColor(Color.parseColor("red"));
                    ledImage.setImageResource(R.mipmap.charge_on);
                    isSwitchOn=false;

                }
            }
        });

    }
}