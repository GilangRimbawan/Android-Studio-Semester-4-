package com.example.uas;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Pertemuan9 extends AppCompatActivity {

    EditText nama, catatan;
    RadioGroup jurusan;
    RadioButton namajurusan;
    Button kirim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pertemuan9); // Pastikan ini mengacu pada layout yang benar

        nama = findViewById(R.id.ednama);
        jurusan = findViewById(R.id.rjurusan);
        catatan = findViewById(R.id.edcatatan);
        kirim = findViewById(R.id.btn_kirim);

        kirim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int radioId = jurusan.getCheckedRadioButtonId();

                if (radioId == -1) {
                    Toast.makeText(Pertemuan9.this, "Pilih jurusan terlebih dahulu", Toast.LENGTH_SHORT).show();
                    return;
                }

                namajurusan = findViewById(radioId);

                Intent i = new Intent(Pertemuan9.this, ResultActivity.class);
                i.putExtra("nama", nama.getText().toString());
                i.putExtra("jurusan", namajurusan.getText().toString());
                i.putExtra("catatan", catatan.getText().toString());
                startActivity(i);
            }
        });
    }
}
