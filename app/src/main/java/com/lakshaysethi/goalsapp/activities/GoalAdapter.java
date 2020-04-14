package com.lakshaysethi.goalsapp.activities;



import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;

import com.lakshaysethi.goalsapp.R;
import com.lakshaysethi.goalsapp.importantObjects.Goal;

import java.util.ArrayList;
class GoalAdapter extends RecyclerView.Adapter<GoalAdapter.GoalViewHolder> {
    //fields
    ArrayList<Goal> goalsArrayList;
    private int layout;

    //constructor
    public GoalAdapter(ArrayList<Goal> goalsArrayList, int layout) {
        this.goalsArrayList = goalsArrayList;
        this.layout = layout;
    }

    //class
    static class GoalViewHolder extends ViewHolder {
        TextView goalName;
        TextView goalDesctiption;

        public GoalViewHolder(@NonNull View itemView) {
            super(itemView);
            goalName = (TextView) itemView.findViewById(R.id.goalName);
            goalDesctiption =(TextView) itemView.findViewById(R.id.goalDescription);
        }


    }

    //main method
    @NonNull
    @Override
    public GoalViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {


        return new GoalViewHolder(LayoutInflater.from(parent.getContext()).inflate(layout, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull GoalViewHolder holder, int position) {
        holder.goalName.setText( goalsArrayList.get(position).getName());
        holder.goalDesctiption.setText(goalsArrayList.get(position).getDescription());
    }

    @Override
    public int getItemCount() {
        return goalsArrayList.size();
    }


}