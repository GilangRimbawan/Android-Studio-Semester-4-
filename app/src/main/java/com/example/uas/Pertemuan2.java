package com.example.uas;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class Pertemuan2 extends AppCompatActivity {

    TextView textView3, textView4, textView5;
    ImageView imageView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pertemuan2);

        EdgeToEdge.enable(this);  // Pindahkan setelah setContentView

        textView3 = findViewById(R.id.textView3);
        textView4 = findViewById(R.id.textView4);
        textView5 = findViewById(R.id.textView5);
        imageView2 = findViewById(R.id.imageView2);
    }
}
