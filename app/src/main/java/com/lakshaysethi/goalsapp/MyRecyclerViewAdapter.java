package com.lakshaysethi.goalsapp;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

abstract public class MyRecyclerViewAdapter<T> extends RecyclerView.Adapter<MyRecyclerViewAdapter.MyViewHolder> {

    @Override
    public void onBindViewHolder(@NonNull MyRecyclerViewAdapter.MyViewHolder holder, int position) {
        binding(holder.itemView, getList().get(position));
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(parent.getContext()).inflate(getLayout(), parent, false));
    }

    abstract protected void binding(View itemView, T item);

    @Override
    public int getItemCount() {
        return 0;
    }

    abstract public List<T> getList();

    abstract protected @LayoutRes
    int getLayout();

    class MyViewHolder extends RecyclerView.ViewHolder {

        MyViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}