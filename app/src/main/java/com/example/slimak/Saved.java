package com.example.slimak;


import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;

import androidx.appcompat.app.AppCompatActivity;

public class Saved extends AppCompatActivity {
    private static SharedPreferences.Editor editor;
    public static SharedPreferences preferences;

    public Saved() {

    }


    public static void init(Context context) {
        if (preferences == null) {
            preferences = context.getSharedPreferences(context.getPackageName(), Activity.MODE_PRIVATE);
            editor = preferences.edit();
        }
    }

    void save() {
        editor.putInt("point", MainActivity.numberOfClick);
        editor.putInt("upgrade", MainActivity.numberOfClick);
        editor.apply();
    }

    @SuppressLint("SetTextI18n")
    void load() {
        MainActivity.numberOfClick = preferences.getInt("point", 0);
        MainActivity.numberOfClick = preferences.getInt("point", 0);
        MainActivity.point.setText(MainActivity.numberOfClick + "");
    }
}
