package com.lakshaysethi.goalsapp.activities;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

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

    EditText goalInput;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


// find view by id
        newGoalBtn = (Button) findViewById(R.id.newGoalBtn);
        mentorsBtn = (Button) findViewById(R.id.mentorsbtn);
        //button3 = (Button) findViewById(R.id.mentorsbtn);
        goalInput = (EditText) findViewById(R.id.goalInput);
        currentUserGoalsRecycler = (RecyclerView) findViewById(R.id.goalsRecycler);

        //setup recycler
        currentUserGoalsRecycler.setLayoutManager(new LinearLayoutManager(this));
        setUpRecycler();

        newGoalBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //openNewGoal
            }
        });

        goalInput.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

             }

            @Override
            public void afterTextChanged(Editable s) {


                if(s.length()>3){//allow to make new
                    if(s.charAt(s.length()-1)=='\n'){
                        Controller.gal.add(new Goal(s.toString(),""));
                        setUpRecycler();
                        goalInput.setText("");

                    }


                }else{
                    if(s.toString().contains("\n")){
                        goalInput.setText("");
                    }

                }

            }
        });


    }

    private void setUpRecycler() {
        goalsListAdapter = new GoalAdapter(Controller.gal,R.layout.goal);

        currentUserGoalsRecycler.setAdapter(goalsListAdapter);
    }
}

