package com.example.wilder.lovehackathon;

import android.content.Intent;
import android.os.Handler;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
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
    public static boolean PLANETE = false;
    DrawerLayout mDrawerLayout;

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
        ImageView ivPointeur6 = findViewById(R.id.img_locone6);
        ImageView ivPointeur7 = findViewById(R.id.img_locone7);
        ImageView ivPointeur8 = findViewById(R.id.img_locone8);
        ImageView ivPointeur9 = findViewById(R.id.img_locone9);
        final ImageView gif = findViewById(R.id.iv_gif);
        ImageView galaxy = findViewById(R.id.iv_galaxy);
        ImageView vaisseau = findViewById(R.id.iv_vaisseau);
        mDrawerLayout = findViewById(R.id.drawer_layout);
        vaisseau.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mDrawerLayout.openDrawer(Gravity.LEFT);

            }
        });

        final Button btnLike = findViewById(R.id.button_like);
        final Button btnNotLike = findViewById(R.id.button_not_like);


        Intent intent = getIntent();
        final String planeteNumero = intent.getStringExtra("planete");
        //remplir les données
        if (planeteNumero.equals("1")) {
            ivPointeur6.setVisibility(View.VISIBLE);
            ivPointeur3.setVisibility(View.VISIBLE);
            ivPointeur5.setVisibility(View.VISIBLE);
            ivPointeur8.setVisibility(View.VISIBLE);
            numeroPointeur(ivPointeur6, "https://vignette.wikia.nocookie.net/starwars/images/b/b7/MP-MonMothma.png", "Mon Mothma", "Femme", "1m73", "67 kg kg", "auburn", "Bleu Vert", "light", "Humain", "Tatoine", btnLike, btnNotLike, gif);
            numeroPointeur(ivPointeur3, "https://vignette.wikia.nocookie.net/starwars/images/b/b6/Cord%C3%A9_-_SW_Card_Trader.png", "Cordé", "Femme", "1m57", "60 kg", "Brun", "Marron", "light", "Humain", "Tatoine", btnLike, btnNotLike, gif);
            numeroPointeur(ivPointeur5, "https://vignette.wikia.nocookie.net/starwars/images/0/02/Phasma.png", "Captain Phasma", "Femme", "2m", "76 kg", "Or", "Bleu", "Pale", "Humain", "Tatoine", btnLike, btnNotLike, gif);
            numeroPointeur(ivPointeur8, "https://vignette.wikia.nocookie.net/starwars/images/f/fc/Leia_Organa_TLJ.png", "Leia Organa", "Femme", "1m50", "51 kg", "Brun", "Marron", "Claire", "Humain", "Tatoine", btnLike, btnNotLike, gif);


            ivBackground.setBackgroundResource(R.drawable.tatooine);


        }

        if (planeteNumero.equals("2")) {
            ivPointeur2.setVisibility(View.VISIBLE);
            ivPointeur3.setVisibility(View.VISIBLE);
            ivPointeur6.setVisibility(View.VISIBLE);
            ivPointeur8.setVisibility(View.VISIBLE);
            ivPointeur7.setVisibility(View.VISIBLE);

            numeroPointeur(ivPointeur3, "https://vignette.wikia.nocookie.net/starwars/images/c/cc/BeruCardTrader.png", "Beru Whitesun lars", "Femme", "1m65", "75 kg", "Marron", "Bleu", "Blanche", "Humain", "Corsucant", btnLike, btnNotLike, gif);
            numeroPointeur(ivPointeur2,"https://vignette.wikia.nocookie.net/starwars/images/b/b2/Padmegreenscrshot.jpg", "Padmé Amidala", "Femme", "1m65", "45 kg", "Marron", "Marron clair", "Blanche", "Humain", "Corsucant", btnLike, btnNotLike, gif);
            numeroPointeur(ivPointeur6, "https://vignette.wikia.nocookie.net/starwars/images/2/21/LuminaraHS-SWE_%28new%29.png", "Luminara Unduli", "Femelle", "1m76", "56 kg", "Noir", "Bleu Royal", "Verte", "Mirilian", "Corsucant", btnLike, btnNotLike, gif);
            numeroPointeur(ivPointeur8, "https://vignette.wikia.nocookie.net/starwars/images/7/7d/Clawdite.jpg", "Zam Wesell", "Femelle", "1m68", "55 kg", "Blonde", "Jaune", "verte", "Clawdite", "Corsucant", btnLike, btnNotLike, gif);
            numeroPointeur(ivPointeur7, "https://vignette.wikia.nocookie.net/starwars/images/2/20/Shaak_Ti_closeup-SWE.png", "Shaak Ti", "Femelle", "1m87", "57 kg", "Gris et Blanc", "Noir", "Rouge", "Trogruta", "Corsucant", btnLike, btnNotLike, gif);

            ivBackground.setBackgroundResource(R.drawable.coruscant);


        }

        if (planeteNumero.equals("3")) {

            ivPointeur4.setVisibility(View.VISIBLE);
            ivPointeur6.setVisibility(View.VISIBLE);
            ivPointeur9.setVisibility(View.VISIBLE);

            numeroPointeur(ivPointeur4, "u", "Claire", "femme", "1m65", "41 kg", "Blond", "Marron", "Blanche", "Humain", "Wild", btnLike, btnNotLike, gif);
            numeroPointeur(ivPointeur6, "u", "Thomas", "Homme", "1m78", "80 kg", "Brun", "Marron", "Blanche", "Humain", "Wild", btnLike, btnNotLike, gif);
            numeroPointeur(ivPointeur9, "u", "Hédi", "Homme", "1m74", "100 kg", "Noir", "Marron", "Marron", "Humain", "Wild", btnLike, btnNotLike, gif);
            ivBackground.setBackgroundResource(R.drawable.deathstar);
        }
        if (planeteNumero.equals("4")) {

            ivPointeur6.setVisibility(View.VISIBLE);
            ivPointeur3.setVisibility(View.VISIBLE);
            numeroPointeur(ivPointeur6, "https://vignette.wikia.nocookie.net/starwars/images/a/ad/ShmiSkywalkerDatabank_%28Repurposed%29.jpeg", "Shmi Skywalker", "Femme", "1m63", "50 kg", "Marron", "Marron", "Blanche", "Humain", "Datooine", btnLike, btnNotLike, gif);
            numeroPointeur(ivPointeur3, "https://vignette.wikia.nocookie.net/starwars/images/f/f8/ReyTLJEntertainmentWeeklyNovember.png", "Rey", "Femme", "1m70", "54 kg", "Marron", "Noir", "Blanche", "Humain", "Datooine", btnLike, btnNotLike, gif);
            ivBackground.setBackgroundResource(R.drawable.dantooine);
        }
        if (planeteNumero.equals("5")) {

            ivPointeur5.setVisibility(View.VISIBLE);
            ivPointeur8.setVisibility(View.VISIBLE);
            ivPointeur2.setVisibility(View.VISIBLE);
            numeroPointeur(ivPointeur5, "https://vignette.wikia.nocookie.net/starwars/images/3/37/Barrisprofile2.jpg", "Barriss Offee", "Femelle", "1m66", "50 kg", "Noir", "Bleu", "Jaune", "Mirilian", "Alderaan", btnLike, btnNotLike, gif);
            numeroPointeur(ivPointeur8, "https://vignette.wikia.nocookie.net/starwars/images/9/9c/TaunWe.jpg", "Taun We", "Femelle", "2m13", "46 kg", "Chauve", "Noir", "Blanche", "Kaminoan", "Alderaan", btnLike, btnNotLike, gif);
            numeroPointeur(ivPointeur2, "https://vignette.wikia.nocookie.net/starwars/images/e/ec/SlyMooreIsWatchingYouPoop-OfficialPix.jpg", "Sly Moore", "Femelle", "1m78", "48 kg", "En train de pousser", "Blanc", "Pale", "Umbaran", "Alderaan", btnLike, btnNotLike, gif);

            ivBackground.setBackgroundResource(R.drawable.alderaan);

        }


        galaxy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PLANETE = true;
                Intent intent = new Intent(PlaneteActivity.this, GalaxyActivity.class);
                startActivity(intent);
            }
        });


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
        ImageView profil = findViewById(R.id.img_meeting);
        Glide.with(PlaneteActivity.this).load(img).into(profil);


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
                Glide.with(PlaneteActivity.this).load(R.drawable.light).into(gif);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        gif.setVisibility(View.INVISIBLE);
                    }
                }, SPLASH_TIME_OUT);

                mList1.add(new ProfilModel(img, nameM, planete));
                listPlanete1.setAdapter(adapter1);


                Intent intent0 = new Intent(PlaneteActivity.this, GalaxyActivity.class);
                intent0.putParcelableArrayListExtra("coeur", mList1);

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
