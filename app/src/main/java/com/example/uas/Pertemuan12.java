package com.example.uas;

import android.os.Bundle;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class Pertemuan12 extends AppCompatActivity {

    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pertemuan12);

        imageView = findViewById(R.id.imageView);
    }

    public void buttonImageView(View view) {
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.mipmap.mipmap);
        Bitmap grayBitmap = toGrayscale(bitmap);
        imageView.setImageBitmap(grayBitmap);
    }

    private Bitmap toGrayscale(Bitmap src) {
        int width = src.getWidth();
        int height = src.getHeight();
        Bitmap grayscaleBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);

        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                int pixel = src.getPixel(i, j);
                int r = Color.red(pixel);
                int g = Color.green(pixel);
                int b = Color.blue(pixel);
                int gray = (r + g + b) / 3;
                int newPixel = Color.rgb(gray, gray, gray);
                grayscaleBitmap.setPixel(i, j, newPixel);
            }
        }
        return grayscaleBitmap;
    }
}