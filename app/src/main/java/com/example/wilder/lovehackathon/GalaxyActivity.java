package com.example.wilder.lovehackathon;

import android.animation.ObjectAnimator;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class GalaxyActivity extends AppCompatActivity {

    ArrayList<ProfilModel> mList1 = new ArrayList<>();
    ArrayList<ProfilModel> mList2 = new ArrayList<>();
    ArrayList<ProfilModel> mList3 = new ArrayList<>();
    ArrayList<ProfilModel> mList4 = new ArrayList<>();
    ArrayList<ProfilModel> mList5 = new ArrayList<>();
    private static int SPLASH_TIME_OUT = 900;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_galaxy);


        final Intent intent = new Intent(GalaxyActivity.this,PlaneteActivity.class);


        final ListView listPlanete1 = findViewById(R.id.lv1);
        final ListView listPlanete2 = findViewById(R.id.lv2);
        final ListView listPlanete3 = findViewById(R.id.lv3);
        final ListView listPlanete4 = findViewById(R.id.lv4);
        final ListView listPlanete5 = findViewById(R.id.lv5);

        final PopulationAdapteur adapter1 = new PopulationAdapteur(GalaxyActivity.this, mList1);
        PopulationAdapteur adapter2 = new PopulationAdapteur(GalaxyActivity.this, mList2);
        PopulationAdapteur adapter3 = new PopulationAdapteur(GalaxyActivity.this, mList3);
        PopulationAdapteur adapter4 = new PopulationAdapteur(GalaxyActivity.this, mList4);
        PopulationAdapteur adapter5 = new PopulationAdapteur(GalaxyActivity.this, mList5);



        mList1.add(new ProfilModel("Bleu Vert", "Femme", "auburn", "1m73", "https://vignette.wikia.nocookie.net/starwars/images/b/b7/MP-MonMothma.png", "67 kg", "Mon Mothma", "light", "Humain"));
        mList1.add(new ProfilModel("Marron", "Femme", "Brun", "1m57", "https://vignette.wikia.nocookie.net/starwars/images/b/b6/Cord%C3%A9_-_SW_Card_Trader.png", "60 kg", "Cordé", "light", "Humain"));
        mList1.add(new ProfilModel("Bleu", "Femme", "Or", "2m", "https://vignette.wikia.nocookie.net/starwars/images/0/02/Phasma.png", "76 kg", "Captain Phasma", "pale", "human"));
        mList1.add(new ProfilModel("Marron", "Femme", "Brun", "1m50", "https://vignette.wikia.nocookie.net/starwars/images/f/fc/Leia_Organa_TLJ.png", "51 kg", "Leia Organa", "Claire", "Humain"));
        listPlanete1.setAdapter(adapter1);


        mList2.add(new ProfilModel("Bleu", "Femme", "Marron", "1m65", "https://vignette.wikia.nocookie.net/starwars/images/c/cc/BeruCardTrader.png", "75 kg", "Beru Whitesun lars", "Blanche", "Humain"));
        mList2.add(new ProfilModel("Marron clair", "Femme", "Marron", "1m65", "https://vignette.wikia.nocookie.net/starwars/images/b/b2/Padmegreenscrshot.jpg", "45 kg", "Padmé Amidala", " Blanche", "Humain"));
        mList2.add(new ProfilModel("Bleu Royal", "Femelle", "Noir", "1m76", "https://vignette.wikia.nocookie.net/starwars/images/2/21/LuminaraHS-SWE_%28new%29.png", "56 kg", "Luminara Unduli", "Verte", "Mirilian"));
        mList2.add(new ProfilModel("Jaune", "Femelle", "Blonde", "1m68", "https://vignette.wikia.nocookie.net/starwars/images/7/7d/Clawdite.jpg", "55 kg", "Zam Wesell", "Verte", "Clawdite"));
        mList2.add(new ProfilModel("Noir", "Femelle", "Gris et Blanc", "1m87", "https://vignette.wikia.nocookie.net/starwars/images/2/20/Shaak_Ti_closeup-SWE.png", "57 kg", "Shaak Ti", "Rouge", "Trogruta"));
        listPlanete2.setAdapter(adapter2);

        mList3.add(new ProfilModel(null, null, null, null, null, null, "Thomas", null, null,"Wild"));
        mList3.add(new ProfilModel(null, null, null, null, null, null, "Hedie", null, null,"Wild"));
        listPlanete3.setAdapter(adapter3);
        mList4.add(new ProfilModel("Marron", "Femme", "Marron", "1m63", "https://vignette.wikia.nocookie.net/starwars/images/a/ad/ShmiSkywalkerDatabank_%28Repurposed%29.jpeg", "50 kg", "Shmi Skywalker", "Blanche", "Humain"));
        mList4.add(new ProfilModel("Noir", "Femme", "Marron", "1m70", "https://vignette.wikia.nocookie.net/starwars/images/f/f8/ReyTLJEntertainmentWeeklyNovember.png", "54kg", "Rey", "Blanche", "Humain"));
        listPlanete4.setAdapter(adapter4);

        mList5.add(new ProfilModel("Bleu", "Femelle", "Noir", "1m66", "https://vignette.wikia.nocookie.net/starwars/images/3/37/Barrisprofile2.jpg", "50 kg", "Barriss Offee", "Jaune", "Mirialan"));
        mList5.add(new ProfilModel("Noir", "Femelle", "Chauve", "2m13", "https://vignette.wikia.nocookie.net/starwars/images/9/9c/TaunWe.jpg", "46 kg", "Taun We", "Blanche", "Kaminoan"));
        mList5.add(new ProfilModel("Blanc", "Femelle", "En train de pousser", "1m78", "https://vignette.wikia.nocookie.net/starwars/images/e/ec/SlyMooreIsWatchingYouPoop-OfficialPix.jpg", "48", "Sly Moore", "Pale", "Umbaran"));       
        listPlanete5.setAdapter(adapter5);

        ImageView planete1 = findViewById(R.id.iv_planete1);
        ImageView planete2 = findViewById(R.id.iv_planete2);
        ImageView planete3 = findViewById(R.id.iv_planete3);
        ImageView planete4 = findViewById(R.id.iv_planete4);
        ImageView planete5 = findViewById(R.id.iv_planete5);
        final ImageView vaisseau =findViewById(R.id.iv_vessel);

        final TextView pop1 = findViewById(R.id.tv_population1);
        final TextView pop2 = findViewById(R.id.tv_population2);
        final TextView pop3 = findViewById(R.id.tv_population3);
        final TextView pop4 = findViewById(R.id.tv_population4);
        final TextView pop5 = findViewById(R.id.tv_population5);

        planete1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listPlanete1.setVisibility(View.VISIBLE);
                pop1.setVisibility(View.VISIBLE);

            }
        });

        planete2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listPlanete2.setVisibility(View.VISIBLE);
                pop2.setVisibility(View.VISIBLE);
            }
        });

        planete3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listPlanete3.setVisibility(View.VISIBLE);
                pop3.setVisibility(View.VISIBLE);
            }
        });

        planete4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listPlanete4.setVisibility(View.VISIBLE);
                pop4.setVisibility(View.VISIBLE);
            }
        });

        planete5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listPlanete5.setVisibility(View.VISIBLE);
                pop5.setVisibility(View.VISIBLE);
            }
        });

        pop1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator.ofFloat(vaisseau, "translationX", 0, -300).start();
                ObjectAnimator.ofFloat(vaisseau, "translationY", 0, -600).start();
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        String planete="1";
                        intent.putExtra("planete",planete);
                        startActivity(intent);
                    }
                }, SPLASH_TIME_OUT);


            }
        });

        pop2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ObjectAnimator.ofFloat(vaisseau, "translationX", 0, -300).start();
                ObjectAnimator.ofFloat(vaisseau, "translationY", 0, -1200).start();
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        String planete="2";
                        intent.putExtra("planete",planete);
                        startActivity(intent);
                    }
                }, SPLASH_TIME_OUT);

            }
        });

        pop3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ObjectAnimator.ofFloat(vaisseau, "translationY", 0, -1700).start();
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        String planete="3";
                        intent.putExtra("planete",planete);
                        startActivity(intent);
                    }
                }, SPLASH_TIME_OUT);

            }
        });

        pop4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ObjectAnimator.ofFloat(vaisseau, "translationX", 0, 300).start();
                ObjectAnimator.ofFloat(vaisseau, "translationY", 0, -1200).start();
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        String planete="4";
                        intent.putExtra("planete",planete);
                        startActivity(intent);
                    }
                }, SPLASH_TIME_OUT);

            }
        });

        pop5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ObjectAnimator.ofFloat(vaisseau, "translationX", 0, 300).start();
                ObjectAnimator.ofFloat(vaisseau, "translationY", 0, -600).start();
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        String planete="5";
                        intent.putExtra("planete",planete);
                        startActivity(intent);
                    }
                }, SPLASH_TIME_OUT);

            }
        });


    }


}
