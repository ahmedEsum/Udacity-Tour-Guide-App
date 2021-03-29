package com.example.tourguideapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;
import java.util.zip.Inflater;

public class DataAdapter extends ArrayAdapter<AppDataModel> {
    public DataAdapter(@NonNull Context context, int resource, @NonNull List<AppDataModel> objects) {
        super(context, 0, objects);


    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View rootView = convertView;
        if (rootView==null){
            rootView= LayoutInflater.from(getContext()).inflate(R.layout.item_display,parent,false);
        }

        AppDataModel model = getItem(position);
        TextView bigT = rootView.findViewById(R.id.bigTitle);
        bigT.setText(model.getBig_title());
        ImageView img = rootView.findViewById(R.id.imgSrc);
        img.setImageResource(model.getResID());
        TextView article = rootView.findViewById(R.id.article);
        article.setText(model.getArticle());

        return rootView;
    }
}
