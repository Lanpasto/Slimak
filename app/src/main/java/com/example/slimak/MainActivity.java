package com.example.slimak;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    ImageButton slimak;
    ImageButton shop;
    ImageButton map;
    ImageButton settings;
    static public TextView clickpersecond;
    static public int numberOfClick = 0;
    static public int clicksecond = 0;
    static public int plusClick = 100;
    static public int click=0;
    @SuppressLint("StaticFieldLeak")
    static public TextView point;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        slimak = findViewById(R.id.slimak);
        shop = findViewById(R.id.shop);
        point = findViewById(R.id.point);
        clickpersecond = findViewById(R.id.clickpersecond);
        settings = findViewById(R.id.settings);
        map = findViewById(R.id.map);
        Saved.init(getApplicationContext());
        new Saved().load();
        Map();
        Slimak();
        Map();
        Shop();
        Settings();
    }

    @SuppressLint("SetTextI18n")
    void Slimak() {
        slimak.setOnClickListener(view -> {
            click++;
            numberOfClick += plusClick;
            point.setText(numberOfClick + "");
            clicksecond=(click);
            clickpersecond.setText(clicksecond+" ");
            new Saved().save();
        });
    }

    void Map() {
        map.setOnClickListener(view -> {
            Intent intent2 = new Intent(MainActivity.this, MapActivity.class);
            intent2.putExtra("point", point.getText().toString());
            startActivity(intent2);
        });
    }

    void Shop() {
        shop.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, ShopActivity.class);
            startActivity(intent);
        });
    }

    void Settings() {
        settings.setOnClickListener(view -> {
            Intent intent1 = new Intent(MainActivity.this, SettingActivity.class);
            startActivity(intent1);
        });
    }

}