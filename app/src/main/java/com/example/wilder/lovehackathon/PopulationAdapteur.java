package com.example.wilder.lovehackathon;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

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


/**
        ImageView imgProfil= convertView.findViewById(R.id.iv_profil_item);
        Drawable drawableProfil= ContextCompat.getDrawable(getContext(), population.getProfil());
        imgProfil.setImageDrawable(drawableProfil);

        ImageView imgElement1=convertView.findViewById(R.id.iv_element1);
        Drawable drawableElement1=ContextCompat.getDrawable(getContext(),population.getElement1());
        imgElement1.setImageDrawable(drawableElement1);

        ///*si l'element2est appellé alors*/
        /**ImageView imgElement2=convertView.findViewById(R.id.iv_element2);
        if (population.getElement2()!=0){

            Drawable drawableElement2=ContextCompat.getDrawable(getContext(),population.getElement2());
            imgElement2.setImageDrawable(drawableElement2);}
        else{
            imgElement2.setImageDrawable(null);

        }**/


        // Return the completed view to render on screen
        return convertView;
    }
}
