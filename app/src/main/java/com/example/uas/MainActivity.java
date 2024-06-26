package com.example.uas;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Button button1, button2, button3, button4, button5, button6, button7, button8, button9, button12, button10, button11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        button1 =(Button) findViewById(R.id.button1);
        button2 =(Button) findViewById(R.id.button2);
        button3 =(Button) findViewById(R.id.button3);
        button4 =(Button) findViewById(R.id.button4);
        button5 =(Button) findViewById(R.id.button5);
        button6 =(Button) findViewById(R.id.button6);
        button7 =(Button) findViewById(R.id.button7);
        button8 =(Button) findViewById(R.id.button8);
        button9 =(Button) findViewById(R.id.button9);
        button10 =(Button) findViewById(R.id.button10);
        button11 =(Button) findViewById(R.id.button11);
        button12 =(Button) findViewById(R.id.button12);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Pertemuan1 = new Intent(getApplicationContext(), com.example.uas.Pertemuan1.class);
                startActivity(Pertemuan1);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Pertemuan2 = new Intent(getApplicationContext(), com.example.uas.Pertemuan2.class);
                startActivity(Pertemuan2);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Ganti "https://www.example.com" dengan URL yang ingin Anda buka
                String url = "https://e-learning.unpam.ac.id/";
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Pertemuan4 = new Intent(getApplicationContext(), com.example.uas.Pertemuan4.class);
                startActivity(Pertemuan4);
            }
        });



        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Pertemuan5 = new Intent(getApplicationContext(), com.example.uas.Pertemuan5.class);
                startActivity(Pertemuan5);
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Pertemuan6 = new Intent(getApplicationContext(), com.example.uas.Pertemuan6.class);
                startActivity(Pertemuan6);
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Pertemuan7 = new Intent(getApplicationContext(), com.example.uas.Pertemuan7.class);
                startActivity(Pertemuan7);
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Pertemuan8 = new Intent(getApplicationContext(), com.example.uas.Pertemuan8.class);
                startActivity(Pertemuan8);
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Pertemuan9 = new Intent(getApplicationContext(), com.example.uas.Pertemuan9.class);
                startActivity(Pertemuan9);
            }
        });

        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Pertemuan12 = new Intent(getApplicationContext(), com.example.uas.Pertemuan12.class);
                startActivity(Pertemuan12);
            }
        });

        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Pertemuan10 = new Intent(getApplicationContext(), com.example.uas.Pertemuan10.class);
                startActivity(Pertemuan10);
            }
        });

        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Pertemuan11 = new Intent(getApplicationContext(), com.example.uas.Pertemuan11.class);
                startActivity(Pertemuan11);
            }
        });
    }
}