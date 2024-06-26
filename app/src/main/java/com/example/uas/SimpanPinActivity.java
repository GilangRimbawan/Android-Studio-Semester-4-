package com.example.uas;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class SimpanPinActivity extends AppCompatActivity {

    EditText etSimpanPin;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_simpan_pin);
        etSimpanPin = (EditText) findViewById(R.id.et_simpan_pin);
    }

    public void simpanPin(View view){
        SharedPreferences sharedPreferences = getSharedPreferences("autentifikasi", MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        if (etSimpanPin.getText().toString().isEmpty()) {
            editor.remove("pin");
            editor.commit();
            Toast.makeText(this, "PIN Menjadi Kosong", Toast.LENGTH_SHORT).show();
            return;
        }

        String SimpanPin = etSimpanPin.getText().toString().trim();
        editor.putString("pin", SimpanPin);
        Toast.makeText(this, "PIN Anda Telah Tersimpan", Toast.LENGTH_SHORT).show();
    }
}