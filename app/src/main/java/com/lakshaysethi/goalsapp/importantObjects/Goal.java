package com.lakshaysethi.goalsapp.importantObjects;

import java.util.ArrayList;

public class Goal {
    private String name;
    private String description;
    private String photoUrl;
    private ArrayList<Plan> plans;

    public Goal(String name) {
        this.name = name;
        this.description = "";
        this.plans = new ArrayList<Plan>();
    }
    public Goal(String name, String description) {
        this.name = name;
        this.description = description;
        this.plans = new ArrayList<Plan>();
    }

    public Goal(String name, String description, String photoUrl) {
        this.name = name;
        this.description = description;
        this.photoUrl = photoUrl;
        this.plans = new ArrayList<Plan>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public ArrayList<Plan> getPlan() {
        return plans;
    }

    public void setPlan(ArrayList<Plan>plan) {
        this.plans = plan;
    }

}

