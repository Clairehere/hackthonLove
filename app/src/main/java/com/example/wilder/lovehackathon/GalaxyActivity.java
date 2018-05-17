package com.example.wilder.lovehackathon;

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


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_galaxy);

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


        mList1.add(new ProfilModel("Bleu Vert", "female", "auburn", "1.73", "https://vignette.wikia.nocookie.net/starwars/images/b/b7/MP-MonMothma.png", "67", "Mon Mothma", "light", "human"));
        mList1.add(new ProfilModel("Marron", "female", "brown", "1.57", "https://vignette.wikia.nocookie.net/starwars/images/b/b6/Cord%C3%A9_-_SW_Card_Trader.png", null, "Cordé", "light", "human"));
        mList1.add(new ProfilModel("Bleu", "female", "gold", "2", null, "76", "Captain Phasma", "pale", "human"));
        mList1.add(new ProfilModel("Marron", "female", null, null, null, null, "Leia Organa", null, null));
        listPlanete1.setAdapter(adapter1);


        mList2.add(new ProfilModel("Bleu", "Femme", "Marron", "1m65", null, "75 kg", "Beru Whitesun lars", "Blanche", "Humain"));
        mList2.add(new ProfilModel("Marron clair", "Femme", "Marron", "1m65", null, "45 kg", "Padmé Amidala", " Blanche", "Humain"));
        mList2.add(new ProfilModel("Bleu Royal", "Femelle", "Noir", "1m76", null, "56 kg", "Luminara Unduli", "Verte", "Mirilian"));
        mList2.add(new ProfilModel("Jaune", "Femelle", null, null, null, null, "Zam Wesell", null, null));
        mList2.add(new ProfilModel(null, null, null, null, null, null, "Shaak Ti", null, null));
        listPlanete2.setAdapter(adapter2);

        mList3.add(new ProfilModel(null, null, null, null, null, null, "Shmi Skywalker", null, null));
        mList3.add(new ProfilModel(null, null, null, null, null, null, "Rey", null, null));
        listPlanete3.setAdapter(adapter3);

        mList4.add(new ProfilModel(null, null, null, null, null, null, "Barriss Offee", null, null));
        mList4.add(new ProfilModel(null, null, null, null, null, null, "Taun We", null, null));
        mList4.add(new ProfilModel(null, null, null, null, null, null, "Sly Moore", null, null));
        listPlanete4.setAdapter(adapter4);

        mList5.add(new ProfilModel(null, null, null, null, null, null, "Thomas", null, null));
        mList5.add(new ProfilModel(null, null, null, null, null, null, "Hedie", null, null));
        listPlanete5.setAdapter(adapter5);


        ImageView planete1 = findViewById(R.id.iv_planete1);
        ImageView planete2 = findViewById(R.id.iv_planete2);
        ImageView planete3 = findViewById(R.id.iv_planete3);
        ImageView planete4 = findViewById(R.id.iv_planete4);
        ImageView planete5 = findViewById(R.id.iv_planete5);

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

            }
        });

        pop2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        pop3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        pop4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        pop5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });


    }


}
