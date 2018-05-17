package com.example.wilder.lovehackathon;

public class ProfilModel {
    String profil;
    String name;
    String genre;
    String height;
    String weight;
    String hairColor;
    String eyesColor;
    String skinColor;
    String Species;

    public ProfilModel(String profil, String name, String genre, String height, String weight, String hairColor, String eyesColor, String skinColor, String species) {
        this.profil = profil;
        this.name = name;
        this.genre = genre;
        this.height = height;
        this.weight = weight;
        this.hairColor = hairColor;
        this.eyesColor = eyesColor;
        this.skinColor = skinColor;
        Species = species;
    }

    public String getProfil() {
        return profil;
    }

    public void setProfil(String profil) {
        this.profil = profil;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public String getEyesColor() {
        return eyesColor;
    }

    public void setEyesColor(String eyesColor) {
        this.eyesColor = eyesColor;
    }

    public String getSkinColor() {
        return skinColor;
    }

    public void setSkinColor(String skinColor) {
        this.skinColor = skinColor;
    }

    public String getSpecies() {
        return Species;
    }

    public void setSpecies(String species) {
        Species = species;
    }
}
