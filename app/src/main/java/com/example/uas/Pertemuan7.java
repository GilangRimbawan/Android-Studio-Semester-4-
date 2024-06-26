package com.example.uas;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Pertemuan7 extends AppCompatActivity {

    ListView listView;
    TextView headerText;

    String[] names = {"33x German Championship", "20x DFB German Cup", "10x German Supercup", "6x Champions League", "2x UEFA Super Cup"};
    int[] images = {R.drawable.image1, R.drawable.image2, R.drawable.image3, R.drawable.image4, R.drawable.image5}; // Ganti dengan gambar Anda

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pertemuan7);

        listView = findViewById(R.id.list_view);
        headerText = findViewById(R.id.header_text); // Pastikan ID sesuai dengan yang ada di XML

        headerText.setText("All Honours"); // Set header text

        MyAdapter adapter = new MyAdapter(this, names, images);
        listView.setAdapter(adapter);
    }
}