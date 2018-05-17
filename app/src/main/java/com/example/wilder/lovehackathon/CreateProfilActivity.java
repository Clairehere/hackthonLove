package com.example.wilder.lovehackathon;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class CreateProfilActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_profil);

        FirebaseDatabase database = FirebaseDatabase.getInstance();
        final DatabaseReference profilRef = database.getReference();



        final EditText etName = findViewById(R.id.et_name);
        final EditText etGenre = findViewById(R.id.et_genre);
        final EditText etHeight = findViewById(R.id.et_height);
        final EditText etWeight = findViewById(R.id.et_weight);
        final EditText etHairColor = findViewById(R.id.et_hair_color);
        final EditText etEyesColor = findViewById(R.id.et_eyes_color);
        final EditText etSkinColor = findViewById(R.id.et_skin);
        final EditText etSpecies = findViewById(R.id.et_species);


        Button btnGo = findViewById(R.id.button_go);
        btnGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String imgProfil = "dd";
                final String name = etName.getText().toString();
                final String genre = etGenre.getText().toString();
                final String height = etHeight.getText().toString();
                final String weight = etWeight.getText().toString();
                final String hairColor = etHairColor.getText().toString();
                final String eyesColor = etEyesColor.getText().toString();
                final String skinColor = etSkinColor.getText().toString();
                final String species = etSpecies.getText().toString();

                ProfilModel profilModel = new ProfilModel(imgProfil, name, genre, height, weight, hairColor, eyesColor, skinColor, species);
              String key = profilRef.push().getKey();
                profilRef.child(key).setValue(profilModel);
                Intent intent = new Intent(CreateProfilActivity.this, GalaxyActivity.class);
                startActivity(intent);

            }

                

                }

        });
    }
}
