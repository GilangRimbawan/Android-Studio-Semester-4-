package com.example.uas;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Pertemuan6 extends AppCompatActivity {

    private static final int REQUEST_CODE = 22;
    private Button btnpicture; // Ubah menjadi variabel instance
    private ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pertemuan6);

        // Inisialisasi tombol dan image view
        btnpicture = findViewById(R.id.btncamera);
        image = findViewById(R.id.imageview);

        // Set onClickListener untuk tombol kamera
        btnpicture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cameraIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(cameraIntent, REQUEST_CODE);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        // Menangani hasil dari aktivitas kamera
        if (requestCode == REQUEST_CODE && resultCode == RESULT_OK) {
            // Ambil gambar yang diambil dari kamera
            Bitmap photo = (Bitmap) data.getExtras().get("data");
            // Tampilkan gambar di ImageView
            image.setImageBitmap(photo);
        } else {
            // Jika pengguna membatalkan pengambilan gambar
            Toast.makeText(this, "Cancelled", Toast.LENGTH_SHORT).show();
        }
    }
}