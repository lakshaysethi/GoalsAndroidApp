package com.lakshaysethi.goalsapp;

import com.lakshaysethi.goalsapp.importantObjects.Goal;

import java.util.ArrayList;

public class Controller {
    public ArrayList<Goal> getLatestGoalsList() {
        ArrayList<Goal>  al =new ArrayList<Goal>();
        al.add(new Goal("Money","$1,000,000"));

       
        al.add(new Goal("health","$1,000,000"));
        al.add(new Goal("my space","$1,000,000"));
        al.add(new Goal("Flow State","$1,000,000"));
        al.add(new Goal("Lucid dreaming","$1,000,000"));

        return al;
    }
}
