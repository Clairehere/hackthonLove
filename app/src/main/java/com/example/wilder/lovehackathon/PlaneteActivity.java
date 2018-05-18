package com.example.wilder.lovehackathon;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class PlaneteActivity extends AppCompatActivity {
    private static int SPLASH_TIME_OUT = 5000;
    final ArrayList<ProfilModel> mList1 = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_planete);


        ImageView ivBackground = findViewById(R.id.iv_background);
        final ImageView ivPointeur1 = findViewById(R.id.img_locone1);
        final ImageView ivPointeur2 = findViewById(R.id.img_locone2);
        final ImageView ivPointeur3 = findViewById(R.id.img_locone3);
        final ImageView ivPointeur4 = findViewById(R.id.img_locone4);
        final ImageView ivPointeur5 = findViewById(R.id.img_locone5);
        final ImageView gif = findViewById(R.id.iv_gif);

        final Button btnLike = findViewById(R.id.button_like);
        final Button btnNotLike = findViewById(R.id.button_not_like);


        Intent intent = getIntent();
        final String planeteNumero = intent.getStringExtra("planete");
        //remplir les données
        if (planeteNumero.equals("1")) {
            ivBackground.setBackgroundResource(R.drawable.tatooine);
            numeroPointeur(ivPointeur1, "https://vignette.wikia.nocookie.net/starwars/images/b/b7/MP-MonMothma.png", "Claire", "femme", "2m", "100 kg", "blond", "marron", "clair", "humain", "tere", btnLike, btnNotLike, gif);
            numeroPointeur(ivPointeur2, "u", "Jean", "KJHH", "2m", "100 kg", "blond", "marron", "clair", "humain", "tere", btnLike, btnNotLike, gif);
            numeroPointeur(ivPointeur3, "u", "Jean", "KJHH", "2m", "100 kg", "blond", "marron", "clair", "humain", "tere", btnLike, btnNotLike, gif);
            numeroPointeur(ivPointeur4, "u", "Jean", "KJHH", "2m", "100 kg", "blond", "marron", "clair", "humain", "tere", btnLike, btnNotLike, gif);

        }

        if (planeteNumero.equals("2")) {
            ivBackground.setBackgroundResource(R.drawable.coruscant);
            numeroPointeur(ivPointeur1, "u", "Claire", "femme", "2m", "100 kg", "blond", "marron", "clair", "humain", "tere", btnLike, btnNotLike, gif);
            numeroPointeur(ivPointeur2, "u", "Jean", "KJHH", "2m", "100 kg", "blond", "marron", "clair", "humain", "tere", btnLike, btnNotLike, gif);
            numeroPointeur(ivPointeur3, "u", "Jean", "KJHH", "2m", "100 kg", "blond", "marron", "clair", "humain", "tere", btnLike, btnNotLike, gif);
            numeroPointeur(ivPointeur4, "u", "Jean", "KJHH", "2m", "100 kg", "blond", "marron", "clair", "humain", "tere", btnLike, btnNotLike, gif);
            numeroPointeur(ivPointeur5, "u", "Jean", "KJHH", "2m", "100 kg", "blond", "marron", "clair", "humain", "tere", btnLike, btnNotLike, gif);

        }

        if (planeteNumero.equals("3")) {
            ivBackground.setBackgroundResource(R.drawable.deathstar);
            numeroPointeur(ivPointeur1, "u", "Claire", "femme", "2m", "100 kg", "blond", "marron", "clair", "humain", "tere", btnLike, btnNotLike, gif);
            numeroPointeur(ivPointeur2, "u", "Jean", "KJHH", "2m", "100 kg", "blond", "marron", "clair", "humain", "tere", btnLike, btnNotLike, gif);
            numeroPointeur(ivPointeur3, "u", "Jean", "KJHH", "2m", "100 kg", "blond", "marron", "clair", "humain", "tere", btnLike, btnNotLike, gif);
            numeroPointeur(ivPointeur4, "u", "Jean", "KJHH", "2m", "100 kg", "blond", "marron", "clair", "humain", "tere", btnLike, btnNotLike, gif);
            numeroPointeur(ivPointeur5, "u", "Jean", "KJHH", "2m", "100 kg", "blond", "marron", "clair", "humain", "tere", btnLike, btnNotLike, gif);

        }
        if (planeteNumero.equals("4")) {
            ivBackground.setBackgroundResource(R.drawable.dantooine);
            numeroPointeur(ivPointeur1, "u", "Claire", "femme", "2m", "100 kg", "blond", "marron", "clair", "humain", "tere", btnLike, btnNotLike, gif);
            numeroPointeur(ivPointeur2, "u", "Jean", "KJHH", "2m", "100 kg", "blond", "marron", "clair", "humain", "tere", btnLike, btnNotLike, gif);

        }
        if (planeteNumero.equals("5")) {
            ivBackground.setBackgroundResource(R.drawable.alderaan);
            numeroPointeur(ivPointeur1, "u", "Claire", "femme", "2m", "100 kg", "blond", "marron", "clair", "humain", "tere", btnLike, btnNotLike, gif);
            numeroPointeur(ivPointeur2, "u", "Jean", "KJHH", "2m", "100 kg", "blond", "marron", "clair", "humain", "tere", btnLike, btnNotLike, gif);
            numeroPointeur(ivPointeur3, "u", "Jean", "KJHH", "2m", "100 kg", "blond", "marron", "clair", "humain", "tere", btnLike, btnNotLike, gif);

        }





    }

    public void numeroPointeur(ImageView pointeur, final String imgProfil, final String name, final String genre, final String height, final String weight,

                               final String hairColor, final String eyesColor, final String skinColor, final String species, final String planete, final Button btnLike, final Button btnNotLike, final ImageView gif) {

        pointeur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pointeurNotLike(imgProfil, name, genre, height, weight, hairColor, eyesColor, skinColor, species, btnNotLike, gif);
                pointeurLike(imgProfil, name, genre, height, weight, hairColor, eyesColor, skinColor, species, btnLike, gif, planete);
            }
        });
    }

    public void pointeurLike(final String img, final String nameM, String genreM, String heightM, String weightM, String hairM, String eyesM, String skinM, String spacies, Button btnLike, final ImageView gif, final String planete) {
        TextView et1 = findViewById(R.id.txt_mname);
        TextView et2 = findViewById(R.id.txt_mgenre);
        TextView et3 = findViewById(R.id.text_mheigh);
        TextView et4 = findViewById(R.id.tv_poid);
        TextView et5 = findViewById(R.id.txt_mhair);
        TextView et6 = findViewById(R.id.txt_meyes);
        TextView et7 = findViewById(R.id.txt_mskin);
        TextView et8 = findViewById(R.id.txt_mspecies);

        et1.setText(nameM);
        et2.setText(genreM);
        et3.setText(heightM);
        et4.setText(weightM);
        et5.setText(hairM);
        et6.setText(eyesM);
        et7.setText(skinM);
        et8.setText(spacies);

        final ListView listPlanete1 = findViewById(R.id.lv_like_planete);
        final LikeAdapteur adapter1 = new LikeAdapteur(PlaneteActivity.this, mList1);
        btnLike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                gif.setVisibility(View.VISIBLE);
                Glide.with(PlaneteActivity.this).load(R.drawable.kiss).into(gif);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        gif.setVisibility(View.INVISIBLE);
                    }
                }, SPLASH_TIME_OUT);

                mList1.add(new ProfilModel(img, nameM,planete));
                listPlanete1.setAdapter(adapter1);

            }
        });
    }


    public void pointeurNotLike(String img, final String nameM, String genreM, String heightM, String weightM, String hairM, String eyesM, String skinM, String spacies, Button btnNotLike, final ImageView gif) {
        TextView et1 = findViewById(R.id.txt_mname);
        TextView et2 = findViewById(R.id.txt_mgenre);
        TextView et3 = findViewById(R.id.text_mheigh);
        TextView et4 = findViewById(R.id.tv_poid);
        TextView et5 = findViewById(R.id.txt_mhair);
        TextView et6 = findViewById(R.id.txt_meyes);
        TextView et7 = findViewById(R.id.txt_mskin);
        TextView et8 = findViewById(R.id.txt_mspecies);
        et1.setText(nameM);
        et2.setText(genreM);
        et3.setText(heightM);
        et4.setText(weightM);
        et5.setText(hairM);
        et6.setText(eyesM);
        et7.setText(skinM);
        et8.setText(spacies);
        btnNotLike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gif.setVisibility(View.VISIBLE);
                Glide.with(PlaneteActivity.this).load(R.drawable.bye).into(gif);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        gif.setVisibility(View.INVISIBLE);
                    }
                }, SPLASH_TIME_OUT);

            }
        });
    }

}
