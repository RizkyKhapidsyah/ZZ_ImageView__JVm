package com.rk.iv;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ImageView IV_Contoh_IDJava;
    TextView TV_Contoh_IDJava;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        IV_Contoh_IDJava = findViewById(R.id.IV_Contoh_IDXML);
        TV_Contoh_IDJava = findViewById(R.id.TV_Contoh_IDXML);

        IV_Contoh_IDJava.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TV_Contoh_IDJava.setText("Android: Halo Rizky Khapidsyah!");
            }
        });

    }
}
