package com.example.wilder.lovehackathon;

public class ProfilModel {
   private String image;
   private String name;
    private String gender;
    private String height;
    private String mass;
    private String hairColor;
   private String eyeColor;
    private String skinColor;
    private String Species;
    private String planet;


    public ProfilModel(String eyeColor, String gender, String hairColor, String height, String image, String mass, String name, String skinColor, String species, String planet) {
        this.image = image;
        this.name = name;
        this.gender = gender;
        this.height = height;
        this.mass = mass;
        this.hairColor = hairColor;
        this.eyeColor = eyeColor;
        this.skinColor = skinColor;
        this.planet = planet;
        Species = species;
    }

    public ProfilModel(String eyeColor, String gender, String hairColor, String height, String image, String mass, String name, String skinColor, String species) {
        this.image = image;
        this.name = name;
        this.gender = gender;
        this.height = height;
        this.mass = mass;
        this.hairColor = hairColor;
        this.eyeColor = eyeColor;
        this.skinColor = skinColor;
        this.planet = planet;

    }

    public ProfilModel() {
    }


    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getMass() {
        return mass;
    }

    public void setMass(String mass) {
        this.mass = mass;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
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

    public String getPlanet() {
        return planet;
    }

    public void setPlanet(String planet) {
        this.planet = planet;
    }

    public ProfilModel(String planet) {
        this.planet = planet;
    }
}
