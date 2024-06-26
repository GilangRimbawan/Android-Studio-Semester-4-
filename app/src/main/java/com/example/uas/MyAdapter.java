package com.example.uas;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MyAdapter extends BaseAdapter {

    private Context context;
    private String[] texts;
    private int[] images;
    private LayoutInflater inflater;

    public MyAdapter(Context context, String[] texts, int[] images) {
        this.context = context;
        this.texts = texts;
        this.images = images;
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return texts.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = inflater.inflate(R.layout.list_item, null);
        TextView textView = convertView.findViewById(R.id.item_text);
        ImageView imageView = convertView.findViewById(R.id.item_image);

        textView.setText(texts[position]);
        imageView.setImageResource(images[position]);

        return convertView;
    }
}

