package com.lakshaysethi.goalsapp.importantObjects;

public class Goal {
    private String name;
    private String description;
    private String photoUrl;
    private Plan plan;

    public Goal(String name) {
        this.name = name;
        this.description = "";
        this.plan = new Plan();
    }
    public Goal(String name, String description) {
        this.name = name;
        this.description = description;
        this.plan = new Plan();
    }

    public Goal(String name, String description, String photoUrl) {
        this.name = name;
        this.description = description;
        this.photoUrl = photoUrl;
        this.plan = new Plan();
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

    public Plan getPlan() {
        return plan;
    }

    public void setPlan(Plan plan) {
        this.plan = plan;
    }

}

