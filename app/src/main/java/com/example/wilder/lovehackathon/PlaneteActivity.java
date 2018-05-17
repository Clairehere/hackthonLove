package com.example.wilder.lovehackathon;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class PlaneteActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_planete);

        TextView tvName = findViewById(R.id.txt_mname);
        TextView tvGenre = findViewById(R.id.txt_mgenre);
        TextView tvHeight = findViewById(R.id.text_mheigh);
        TextView tvWeight = findViewById(R.id.tv_poid);
        TextView tvHairColor = findViewById(R.id.txt_mhair);
        TextView tvEyesColor = findViewById(R.id.txt_meyes);
        TextView tvSkinColor = findViewById(R.id.txt_mskin);
        TextView tvSpecies = findViewById(R.id.txt_mspecies);


        Intent intent = getIntent();
        final String planete = intent.getStringExtra("planete");

        if (planete.equals("1")) {
            /*liste a recup
            mList1.add(new ProfilModel("Bleu Vert", "Femme", "auburn", "1m73", "null", "67 kg", "Mon Mothma", "light", "human"));
            mList1.add(new ProfilModel("Marron", "Femme", "Brun", "1m57", "null", null, "Cordé", "light", "human"));
            mList1.add(new ProfilModel("Bleu", "Femme", "Or", "2m", null, "76 kg", "Captain Phasma", "pale", "human"));
            mList1.add(new ProfilModel("Marron", "Femme", null, null, null, null, "Leia Organa", null, null));
            listPlanete1.setAdapter(adapter1);
            */
        }

        if (planete.equals("2")) {
            /*liste a recup
            mList1.add(new ProfilModel("Bleu", "Femme", "Marron", "1m65", null, "75 kg", "Beru Whitesun lars", "Blanche", "Humain"));
            mList1.add(new ProfilModel("Marron clair", "Femme", "Marron", "1m65", null, "45 kg", "Padmé Amidala", " Blanche", "Humain"));
            mList1.add(new ProfilModel("Bleu Royal", "Femelle", "Noir", "1m76", null, "56 kg", "Luminara Unduli", "Verte", "Mirilian"));
            mList1.add(new ProfilModel("Jaune", "Femelle", "Blonde", "1m68", null, "55 kg", "Zam Wesell", "Verte", "Clawdite"));
            mList1.add(new ProfilModel("Noir", "Femelle", "Gris et Blanc", "1m87", null, "57 kg", "Shaak Ti", "Rouge", "Trogruta"));
            listPlanete1.setAdapter(adapter1);
            */
        }

        if (planete.equals("3")) {
            /*liste a recup
            mList1.add(new ProfilModel(null, null, null, null, null, null, "Thomas", null, null));
            mList1.add(new ProfilModel(null, null, null, null, null, null, "Hedie", null, null));
            listPlanete1.setAdapter(adapter1);
            */
        }

        if (planete.equals("4")) {
            /*liste a recup
            mList1.add(new ProfilModel("Marron", "Femme", "Marron", "1m63", null, "50 kg", "Shmi Skywalker", "Blanche", "Humain"));
            mList1.add(new ProfilModel("Noir", "Femme", "Marron", "1m70", null, "54kg", "Rey", "Blanche", "Humain"));
            listPlanete1.setAdapter(adapter1);
            */
        }
        if (planete.equals("5")) {
            /*liste a recup
            mList1.add(new ProfilModel("Bleu", "Femelle", "Noir", "1m66", null, "50 kg", "Barriss Offee", "Jaune", "Mirialan"));
            mList1.add(new ProfilModel("Noir", "Femelle", "Chauve", "2m13", null, "46 kg", "Taun We", "Blanche", "Kaminoan"));
            mList1.add(new ProfilModel("Blanc", "Femelle", "En train de pousser", "1m78", null, "48", "Sly Moore", "Pale", "Umbaran"));
            listPlanete1.setAdapter(adapter1);
            */
        }

    }
}
