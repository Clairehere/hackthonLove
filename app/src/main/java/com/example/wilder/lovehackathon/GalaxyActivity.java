package com.example.wilder.lovehackathon;

import android.content.Intent;
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

        mList1.add(new ProfilModel("Bleu Vert", "Femme", "auburn", "1m73", "null", "67 kg", "Mon Mothma", "light", "human","Tatooine"));
        mList1.add(new ProfilModel("Marron", "Femme", "Brun", "1m57", "null", null, "Cordé", "light", "human","Tatooine"));
        mList1.add(new ProfilModel("Bleu", "Femme", "Or", "2m", null, "76 kg", "Captain Phasma", "pale", "human","Tatooine"));
        mList1.add(new ProfilModel("Marron", "Femme", null, null, null, null, "Leia Organa", null, null,"Tatooine"));
        listPlanete1.setAdapter(adapter1);


        mList2.add(new ProfilModel("Bleu", "Femme", "Marron", "1m65", null, "75 kg", "Beru Whitesun lars", "Blanche", "Humain","Coruscant"));
        mList2.add(new ProfilModel("Marron clair", "Femme", "Marron", "1m65", null, "45 kg", "Padmé Amidala", " Blanche", "Humain","Coruscant"));
        mList2.add(new ProfilModel("Bleu Royal", "Femelle", "Noir", "1m76", null, "56 kg", "Luminara Unduli", "Verte", "Mirilian","Coruscant"));
        mList2.add(new ProfilModel("Jaune", "Femelle", "Blonde", "1m68", null, "55 kg", "Zam Wesell", "Verte", "Clawdite","Coruscant"));
        mList2.add(new ProfilModel("Noir", "Femelle", "Gris et Blanc", "1m87", null, "57 kg", "Shaak Ti", "Rouge", "Trogruta","Coruscant"));
        listPlanete2.setAdapter(adapter2);

        mList3.add(new ProfilModel(null, null, null, null, null, null, "Thomas", null, null,"Wild"));
        mList3.add(new ProfilModel(null, null, null, null, null, null, "Hedie", null, null,"Wild"));
        listPlanete3.setAdapter(adapter3);

        mList4.add(new ProfilModel("Marron", "Femme", "Marron", "1m63", null, "50 kg", "Shmi Skywalker", "Blanche", "Humain","Dantooine"));
        mList4.add(new ProfilModel("Noir", "Femme", "Marron", "1m70", null, "54kg", "Rey", "Blanche", "Humain","Dantooine"));
        listPlanete4.setAdapter(adapter4);

        mList5.add(new ProfilModel("Bleu", "Femelle", "Noir", "1m66", null, "50 kg", "Barriss Offee", "Jaune", "Mirialan","Alderaan"));
        mList5.add(new ProfilModel("Noir", "Femelle", "Chauve", "2m13", null, "46 kg", "Taun We", "Blanche", "Kaminoan","Alderaan"));
        mList5.add(new ProfilModel("Blanc", "Femelle", "En train de pousser", "1m78", null, "48", "Sly Moore", "Pale", "Umbaran","Alderaan"));

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
                ;
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
                String planete="1";
                intent.putExtra("planete",planete);
                startActivity(intent);

            }
        });

        pop2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String planete="2";
                intent.putExtra("planete",planete);
                startActivity(intent);

            }
        });

        pop3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String planete="3";
                intent.putExtra("planete",planete);
                startActivity(intent);

            }
        });

        pop4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String planete="4";
                intent.putExtra("planete",planete);
                startActivity(intent);

            }
        });

        pop5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String planete="5";
                intent.putExtra("planete",planete);
                startActivity(intent);

            }
        });


    }


}
