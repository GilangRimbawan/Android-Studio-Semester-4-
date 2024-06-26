package com.example.uas;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.ArrayAdapter;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Pertemuan5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pertemuan5); // Ganti dengan layout activity_pertemuan5

        ListView listView = findViewById(R.id.list1); // Ubah variabel list menjadi listView

        String[] matakuliah = {
                "Algoritma Pemrograman",
                "Pemrograman 1",
                "Pemrograman 2",
                "Web Pemrograman 1",
                "Web Pemrograman 2",
                "Komputer Grafik",
                "Komputer Grafik 1",
                "Mobile Programing",
                "Kalkulus 1",
                "Kalkulus 2",
                "Jaringan Komputer",
                "Komputer Masyarakat"
        };

        ArrayAdapter<String> myAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, matakuliah);

        listView.setAdapter(myAdapter);
    }
}