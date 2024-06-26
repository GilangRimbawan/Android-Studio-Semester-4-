package com.example.uas;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Pertemuan8 extends AppCompatActivity {

    EditText etPin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pertemuan8);

        etPin = findViewById(R.id.et_pin);
    }

    public void cekpin(View view) {
        SharedPreferences sharedPreferences = getSharedPreferences("autentifikasi", MODE_PRIVATE);

        String savedPin = sharedPreferences.getString("pin", "");

        if (etPin.getText().toString().isEmpty()) {
            Toast.makeText(this, "Mohon Isikan Pin Anda", Toast.LENGTH_SHORT).show();
            return;
        }

        String enteredPin = etPin.getText().toString().trim();

        if (savedPin.isEmpty()) {
            Intent intent = new Intent(this, SimpanPinActivity.class);
            startActivity(intent);
            finish();
        } else if (enteredPin.equals(savedPin)) {
            Toast.makeText(this, "PIN Benar", Toast.LENGTH_SHORT).show();
            // Lanjutkan ke aktivitas selanjutnya atau lakukan aksi lain yang diinginkan
        } else {
            Toast.makeText(this, "PIN Salah", Toast.LENGTH_SHORT).show();
        }
    }
}
