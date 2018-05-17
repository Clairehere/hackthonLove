package com.example.wilder.lovehackathon;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CreateProfilActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_profil);


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
                String imgProfil = null;
                String name = etName.getText().toString();
                String genre = etGenre.getText().toString();
                String height = etHeight.getText().toString();
                String weight = etWeight.getText().toString();
                String hairColor = etHairColor.getText().toString();
                String eyesColor = etEyesColor.getText().toString();
                String skinColor = etSkinColor.getText().toString();
                String species = etSpecies.getText().toString();

                ProfilModel profilModel = new ProfilModel(imgProfil, name, genre, height, weight, hairColor, eyesColor, skinColor, species);


            }
        });
    }
}
