package com.example.appone;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class adapter extends RecyclerView.Adapter<myViewHolder> {

    Context context;
    List<item_model> itemList;

    public adapter(Context context, List<item_model> itemList){
        this.context = context;
        this.itemList = itemList;
    }

    @NonNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new myViewHolder(LayoutInflater.from(context).inflate(R.layout.itemview,parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull myViewHolder holder, int position) {
        holder.nameview.setText(itemList.get(position).getUser_img());
        holder.emailview.setText(itemList.get(position).getEmail());
        holder.nameview.setText(itemList.get(position).getUname());

    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }
}
