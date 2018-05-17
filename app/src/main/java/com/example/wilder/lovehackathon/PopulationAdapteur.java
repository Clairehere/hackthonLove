package com.example.wilder.lovehackathon;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class PopulationAdapteur extends ArrayAdapter<ProfilModel> {
    public PopulationAdapteur(Context context, ArrayList<ProfilModel> trips) {
        super(context, 0, trips);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        ProfilModel population = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_population, parent, false);
        }
        // Lookup view for data population
        TextView tvName = (TextView) convertView.findViewById(R.id.tv_name_item);
        tvName.setText(population.getName());


        ImageView imgProfil = convertView.findViewById(R.id.iv_profil_item);
        Glide.with(parent.getContext()).load(population.getImage()).into(imgProfil);


        return convertView;
    }
}
