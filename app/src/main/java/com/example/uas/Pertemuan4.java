package com.example.uas;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class Pertemuan4 extends AppCompatActivity {

    Button button1, button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pertemuan4);

        button1 = findViewById(R.id.btn1);
        button2 = findViewById(R.id.btn2);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Pertemuan4.this, "Terima Kasih", Toast.LENGTH_LONG).show();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validation();
            }
        });
    }

    void validation() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Silahkan Absen Terlebih Dahulu");
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }
}
