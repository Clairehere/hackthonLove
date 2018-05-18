package com.example.wilder.lovehackathon;

public class LikeModel {
    private String name;
    private String planete;


    public LikeModel(String name, String planete) {
        this.name = name;
        this.planete = planete;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlanete() {
        return planete;
    }

    public void setPlanete(String planete) {
        this.planete = planete;
    }
}
