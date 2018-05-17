package com.example.wilder.lovehackathon;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

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

        FirebaseDatabase database = FirebaseDatabase.getInstance();
        final DatabaseReference profilRef = database.getReference();


        ListView listPlanete1 = findViewById(R.id.lv1);
        ListView listPlanete2 = findViewById(R.id.lv2);
        ListView listPlanete3 = findViewById(R.id.lv3);
        ListView listPlanete4 = findViewById(R.id.lv4);
        ListView listPlanete5 = findViewById(R.id.lv5);

        final PopulationAdapteur adapter1 = new PopulationAdapteur(GalaxyActivity.this, mList1);
        PopulationAdapteur adapter2 = new PopulationAdapteur(GalaxyActivity.this, mList2);
        PopulationAdapteur adapter3 = new PopulationAdapteur(GalaxyActivity.this, mList3);
        PopulationAdapteur adapter4 = new PopulationAdapteur(GalaxyActivity.this, mList4);
        PopulationAdapteur adapter5 = new PopulationAdapteur(GalaxyActivity.this, mList5);


        mList1.add(new ProfilModel(null, null, null, null, null, null, "Mon Mothma", null, null));
        mList1.add(new ProfilModel(null, null, null, null, null, null, "Cordé", null, null));
        mList1.add(new ProfilModel(null, null, null, null, null, null, "Captain Phasma", null, null));
        mList1.add(new ProfilModel(null, null, null, null, null, null, "Leia Organa", null, null));
        listPlanete1.setAdapter(adapter1);


        mList2.add(new ProfilModel(null, null, null, null, null, null, "Beru Whitesun lars", null, null));
        mList2.add(new ProfilModel(null, null, null, null, null, null, "Padmé Amidala", null, null));
        mList2.add(new ProfilModel(null, null, null, null, null, null, "Luminara Unduli", null, null));
        mList2.add(new ProfilModel(null, null, null, null, null, null, "Zam Wesell", null, null));
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




    }


}
