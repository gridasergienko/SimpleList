package com.example.simplelist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class PeoplesAdapter extends RecyclerView.Adapter<PeoplesAdapter.PeopleViewHolder> {
    private List<People> peopleList = new ArrayList<>();
    private Context context;

    public void setPeopleList(List<People> peopleList) {
        this.peopleList = peopleList;
    }

    PeoplesAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public PeopleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.viewholder_people, parent, false);
        return new PeopleViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PeopleViewHolder holder, int position) {
        holder.nameTextView.setText(peopleList.get(position).getName());
        holder.ageTextView.setText(Integer.toString(peopleList.get(position).getAge()));
    }

    @Override
    public int getItemCount() {
        return peopleList.size();
    }

    class PeopleViewHolder extends RecyclerView.ViewHolder {
        private TextView ageTextView;
        private TextView nameTextView;

        PeopleViewHolder(@NonNull View itemView) {
            super(itemView);
            ageTextView = itemView.findViewById(R.id.textview_age);
            nameTextView = itemView.findViewById(R.id.textview_name);
        }
    }
}
