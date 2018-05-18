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


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_planete);

        final TextView tvName = findViewById(R.id.txt_mname);
        final TextView tvGenre = findViewById(R.id.txt_mgenre);
        final TextView tvHeight = findViewById(R.id.text_mheigh);
        final TextView tvWeight = findViewById(R.id.tv_poid);
        final TextView tvHairColor = findViewById(R.id.txt_mhair);
        final TextView tvEyesColor = findViewById(R.id.txt_meyes);
        final TextView tvSkinColor = findViewById(R.id.txt_mskin);
        final TextView tvSpecies = findViewById(R.id.txt_mspecies);
        ImageView ivBackground = findViewById(R.id.iv_background);
        ImageView ivPointeur1 = findViewById(R.id.img_locone1);
        ImageView ivPointeur2 = findViewById(R.id.img_locone2);
        ImageView ivPointeur3 = findViewById(R.id.img_locone3);
        ImageView ivPointeur4 = findViewById(R.id.img_locone4);
        ImageView ivPointeur5 = findViewById(R.id.img_locone5);
        final ImageView gif = findViewById(R.id.iv_gif);

        final Button btnLike = findViewById(R.id.button_like);
        final Button btnNotLike = findViewById(R.id.button_not_like);


        Intent intent = getIntent();
        final String planete = intent.getStringExtra("planete");

        if (planete.equals("1")) {


            ivPointeur1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    final String imgProfil = null;
                    final String name = "fege";
                    final String genre = "frg";
                    final String height = "fegr";
                    final String weight = "ezg";
                    final String hairColor = "egrehyr";
                    final String eyesColor = "fegr";
                    final String skinColor = null;
                    final String species = null;
                    String planete = "planete";
                    pointeurNotLike(imgProfil,tvName,name,tvGenre,genre,tvHeight,height,tvWeight,weight,tvHairColor,hairColor,tvEyesColor,eyesColor,tvSkinColor,skinColor,tvSpecies,species,btnNotLike,gif);
                    pointeurLike(imgProfil,tvName,name,tvGenre,genre,tvHeight,height,tvWeight,weight,tvHairColor,hairColor,tvEyesColor,eyesColor,tvSkinColor,skinColor,tvSpecies,species,btnLike,gif,planete);


                }
            });
            ivPointeur2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {


                }
            });
            ivPointeur3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }
            });
            ivPointeur4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }
            });

            ivPointeur5.setVisibility(View.INVISIBLE);
            /*liste a recup
            mList1.add(new ProfilModel("Bleu Vert", "Femme", "auburn", "1m73", "https://vignette.wikia.nocookie.net/starwars/images/b/b7/MP-MonMothma.png", "67 kg", "Mon Mothma", "light", "Humain"));
        mList1.add(new ProfilModel("Marron", "Femme", "Brun", "1m57", "https://vignette.wikia.nocookie.net/starwars/images/b/b6/Cord%C3%A9_-_SW_Card_Trader.png", "60 kg", "Cordé", "light", "Humain"));
        mList1.add(new ProfilModel("Bleu", "Femme", "Or", "2m", "https://vignette.wikia.nocookie.net/starwars/images/0/02/Phasma.png", "76 kg", "Captain Phasma", "pale", "human"));
        mList1.add(new ProfilModel("Marron", "Femme", "Brun", "1m50", "https://vignette.wikia.nocookie.net/starwars/images/f/fc/Leia_Organa_TLJ.png", "51 kg", "Leia Organa", "Claire", "Humain"));
        listPlanete1.setAdapter(adapter1);
            */
        }

        if (planete.equals("2")) {
            /*liste a recup
            ist2.add(new ProfilModel("Bleu", "Femme", "Marron", "1m65", "https://vignette.wikia.nocookie.net/starwars/images/c/cc/BeruCardTrader.png", "75 kg", "Beru Whitesun lars", "Blanche", "Humain"));
        mList2.add(new ProfilModel("Marron clair", "Femme", "Marron", "1m65", "https://vignette.wikia.nocookie.net/starwars/images/b/b2/Padmegreenscrshot.jpg", "45 kg", "Padmé Amidala", " Blanche", "Humain"));
        mList2.add(new ProfilModel("Bleu Royal", "Femelle", "Noir", "1m76", "https://vignette.wikia.nocookie.net/starwars/images/2/21/LuminaraHS-SWE_%28new%29.png", "56 kg", "Luminara Unduli", "Verte", "Mirilian"));
        mList2.add(new ProfilModel("Jaune", "Femelle", "Blonde", "1m68", "https://vignette.wikia.nocookie.net/starwars/images/7/7d/Clawdite.jpg", "55 kg", "Zam Wesell", "Verte", "Clawdite"));
        mList2.add(new ProfilModel("Noir", "Femelle", "Gris et Blanc", "1m87", "https://vignette.wikia.nocookie.net/starwars/images/2/20/Shaak_Ti_closeup-SWE.png", "57 kg", "Shaak Ti", "Rouge", "Trogruta"));
        listPlanete2.setAdapter(adapter2);
            */
        }

        if (planete.equals("3")) {
            /*liste a recup
            st3.add(new ProfilModel(null, null, null, null, null, null, "Thomas", null, null));
        mList3.add(new ProfilModel(null, null, null, null, null, null, "Hedie", null, null));
        listPlanete3.setAdapter(adapter3);
            */
        }

        if (planete.equals("4")) {
            /*liste a recup
            mList4.add(new ProfilModel("Marron", "Femme", "Marron", "1m63", "https://vignette.wikia.nocookie.net/starwars/images/a/ad/ShmiSkywalkerDatabank_%28Repurposed%29.jpeg", "50 kg", "Shmi Skywalker", "Blanche", "Humain"));
        mList4.add(new ProfilModel("Noir", "Femme", "Marron", "1m70", "https://vignette.wikia.nocookie.net/starwars/images/f/f8/ReyTLJEntertainmentWeeklyNovember.png", "54kg", "Rey", "Blanche", "Humain"));
        listPlanete4.setAdapter(adapter4);
            */
        }
        if (planete.equals("5")) {
            /*liste a recup
            mList5.add(new ProfilModel("Bleu", "Femelle", "Noir", "1m66", "https://vignette.wikia.nocookie.net/starwars/images/3/37/Barrisprofile2.jpg", "50 kg", "Barriss Offee", "Jaune", "Mirialan"));
        mList5.add(new ProfilModel("Noir", "Femelle", "Chauve", "2m13", "https://vignette.wikia.nocookie.net/starwars/images/9/9c/TaunWe.jpg", "46 kg", "Taun We", "Blanche", "Kaminoan"));
        mList5.add(new ProfilModel("Blanc", "Femelle", "En train de pousser", "1m78", "https://vignette.wikia.nocookie.net/starwars/images/e/ec/SlyMooreIsWatchingYouPoop-OfficialPix.jpg", "48", "Sly Moore", "Pale", "Umbaran"));
        listPlanete5.setAdapter(adapter5);
            */
        }


    }



public void pointeurLike(String img, TextView et1, final String nameM, TextView et2, String genreM, TextView et3, String heightM, TextView et4, String weightM, TextView et5, String hairM, TextView et6, String eyesM, TextView et7, String skinM, TextView et8, String spacies, Button btnLike, final ImageView gif, final String planete){
    et1.setText(nameM);
    et2.setText(genreM);
    et3.setText(heightM);
    et4.setText(weightM);
    et5.setText(hairM);
    et6.setText(eyesM);
    et7.setText(skinM);
    et8.setText(spacies);

    btnLike.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            ArrayList<LikeModel> mList1 = new ArrayList<>();
            ListView listPlanete1 = findViewById(R.id.lv_like_planete);
            final LikeAdapteur adapter1 = new LikeAdapteur(PlaneteActivity.this, mList1);
            gif.setVisibility(View.VISIBLE);
            Glide.with(PlaneteActivity.this).load(R.drawable.kiss).into(gif);
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    gif.setVisibility(View.INVISIBLE);
                }
            }, SPLASH_TIME_OUT);

            mList1.add(new LikeModel(nameM, planete));
            listPlanete1.setAdapter(adapter1);

        }
    });
}

public void pointeurNotLike(String img, TextView et1, final String nameM, TextView et2, String genreM, TextView et3, String heightM, TextView et4, String weightM, TextView et5, String hairM, TextView et6, String eyesM, TextView et7, String skinM, TextView et8, String spacies,Button btnNotLike, final ImageView gif){
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
