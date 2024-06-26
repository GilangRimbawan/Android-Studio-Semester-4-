package com.example.uas;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;


public class ResultActivity extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        String nama = getIntent().getExtras().getString("nama");
        String jurusan = getIntent().getExtras().getString("jurusan");
        String catatan = getIntent().getExtras().getString("catatan");

        TextView result = findViewById(R.id.txt_result);
        result.setText("Hello nama saya "+nama+"\n\nSaat ini kuliah dan mengambil jurusan "+jurusan+" \n\ncatatan :"+catatan);
    }
}