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


public class LikeAdapteur extends ArrayAdapter<LikeModel> {
    public LikeAdapteur(Context context, ArrayList<LikeModel> trips) {
        super(context, 0, trips);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        LikeModel likeModel = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_like, parent, false);
        }
        // Lookup view for data likeModel
        TextView tvName = (TextView) convertView.findViewById(R.id.tv_name_like);
        tvName.setText(likeModel.getName());

        TextView tvPlanete = (TextView) convertView.findViewById(R.id.tv_planete_like);
        tvName.setText(likeModel.getPlanete());

        return convertView;
    }
}
