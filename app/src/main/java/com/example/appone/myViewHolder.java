package com.example.appone;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


    public class myViewHolder extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView nameview;
        TextView emailview;

        public myViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.user_img);
            nameview = itemView.findViewById(R.id.uname);
            emailview= itemView.findViewById(R.id.email);

        }
    }

