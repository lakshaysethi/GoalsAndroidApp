package com.lakshaysethi.goalsapp.activities;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.lakshaysethi.goalsapp.Controller;
import com.lakshaysethi.goalsapp.R;
import com.lakshaysethi.goalsapp.importantObjects.Goal;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Button newGoalBtn;
    Button mentorsBtn;
    Button button3;
    RecyclerView currentUserGoalsRecycler;
    GoalAdapter goalsListAdapter;
    ArrayList<Goal> goalsList;
    Controller c;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        c = new Controller();

        newGoalBtn = (Button) findViewById(R.id.newGoalBtn);
        mentorsBtn = (Button) findViewById(R.id.mentorsbtn);
        button3 = (Button) findViewById(R.id.mentorsbtn);


        currentUserGoalsRecycler = (RecyclerView) findViewById(R.id.goalsRecycler);

        goalsListAdapter = new GoalAdapter(c.getLatestGoalsList(),R.layout.goal);
        currentUserGoalsRecycler.setLayoutManager(new LinearLayoutManager(this));
        currentUserGoalsRecycler.setAdapter(goalsListAdapter);



    }
}

