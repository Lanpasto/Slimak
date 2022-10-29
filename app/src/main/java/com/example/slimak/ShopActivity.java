package com.example.slimak;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class ShopActivity extends AppCompatActivity {
    ImageButton upgrade;


    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop);
        upgrade = findViewById(R.id.upgrade);
        upgrade.setOnClickListener(view -> {
            if (MainActivity.numberOfClick >= 500) {
                MainActivity.plusClick += 200;
                MainActivity.numberOfClick -= 500;
                MainActivity.point.setText(MainActivity.point + " ");
            }
        });

    }





    /*public void CreateDialog(Activity activity) {
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setTitle("Диалог")
                .setMessage("Текст в диалоге")
                .setPositiveButton("OK", (dialog, id) -> Toast.makeText(activity, "Нажата кнопка 'OK'", Toast.LENGTH_SHORT).show())
                .setNegativeButton("Отмена", (dialog, id) -> Toast.makeText(activity, "Нажата кнопка 'Отмена'", Toast.LENGTH_SHORT).show());
        builder.create().show();  void Variable_Slimak() {
        Slimak_Bitcoin.setOnClickListener(view -> {
            ImageButton imageButton = (ImageButton) findViewById(R.id.slimak);
            imageButton.setImageDrawable(imageButton)
        });
    }
    }*/
}