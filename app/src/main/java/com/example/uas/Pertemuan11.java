package com.example.uas;

import android.content.pm.PackageManager;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.Manifest;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

public class Pertemuan11 extends AppCompatActivity {

    private Button btnKirim;
    private EditText isipesan, notelp;

    private static final int MY_PERMISSIONS_REQUEST_SEND_SMS = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pertemuan11); // Pastikan layout sesuai dengan nama yang Anda berikan

        btnKirim = findViewById(R.id.idbtnStart); // Sesuaikan dengan ID yang Anda berikan pada tombol di layout activity_pertemuan11.xml
        isipesan = findViewById(R.id.idTxtMsg); // Sesuaikan dengan ID yang Anda berikan pada EditText untuk pesan di layout activity_pertemuan11.xml
        notelp = findViewById(R.id.idTxtPhoneNo); // Sesuaikan dengan ID yang Anda berikan pada EditText untuk nomor telepon di layout activity_pertemuan11.xml

        kirimSMS();
    }

    protected void kirimSMS() {
        btnKirim.setOnClickListener((v) -> {
            int permissionCheck = ContextCompat.checkSelfPermission(Pertemuan11.this, Manifest.permission.SEND_SMS);

            if (permissionCheck == PackageManager.PERMISSION_GRANTED) {
                IsiPesan();
            } else {
                ActivityCompat.requestPermissions(Pertemuan11.this, new String[]{Manifest.permission.SEND_SMS}, MY_PERMISSIONS_REQUEST_SEND_SMS);
            }
        });
    }

    public void IsiPesan() {
        String myNumber = notelp.getText().toString().trim();
        String myMsg = isipesan.getText().toString().trim();
        if (myNumber.isEmpty() || myMsg.isEmpty()) {
            Toast.makeText(this, "Pesan Tidak Boleh Kosong", Toast.LENGTH_SHORT).show();
        } else {
            // Logika untuk mengirim SMS, perlu ditambahkan disini
            Toast.makeText(this, "No Telp Hanya Angka", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == MY_PERMISSIONS_REQUEST_SEND_SMS) {
            if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                IsiPesan();
            } else {
                Toast.makeText(this, "Silahkan beri izin akses terlebih dahulu", Toast.LENGTH_SHORT).show();
            }
        }
    }
}