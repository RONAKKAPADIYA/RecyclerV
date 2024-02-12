package com.example.appone;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.ColorSpace;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView =findViewById(R.id.recyclerview);
        List<item_model> items =new ArrayList<>();

        items.add(new item_model("Ronak", "ronak@rku.ac.in", R.drawable.user_icon));
        items.add(new item_model("Ronak", "ronak@rku.ac.in", R.drawable.user_icon));
        items.add(new item_model("Ronak", "ronak@rku.ac.in", R.drawable.user_icon));
        items.add(new item_model("Ronak", "ronak@rku.ac.in", R.drawable.user_icon));
        items.add(new item_model("Ronak", "ronak@rku.ac.in", R.drawable.user_icon));
        items.add(new item_model("Ronak", "ronak@rku.ac.in", R.drawable.user_icon));
        items.add(new item_model("Ronak", "ronak@rku.ac.in", R.drawable.user_icon));
        items.add(new item_model("Ronak", "ronak@rku.ac.in", R.drawable.user_icon));
        items.add(new item_model("Ronak", "ronak@rku.ac.in", R.drawable.user_icon));
        items.add(new item_model("Ronak", "ronak@rku.ac.in", R.drawable.user_icon));
        items.add(new item_model("Ronak", "ronak@rku.ac.in", R.drawable.user_icon));
        items.add(new item_model("Ronak", "ronak@rku.ac.in", R.drawable.user_icon));
        items.add(new item_model("Ronak", "ronak@rku.ac.in", R.drawable.user_icon));
        items.add(new item_model("Ronak", "ronak@rku.ac.in", R.drawable.user_icon));
        items.add(new item_model("Ronak", "ronak@rku.ac.in", R.drawable.user_icon));
        items.add(new item_model("Ronak", "ronak@rku.ac.in", R.drawable.user_icon));
        items.add(new item_model("Ronak", "ronak@rku.ac.in", R.drawable.user_icon));
        items.add(new item_model("Ronak", "ronak@rku.ac.in", R.drawable.user_icon));

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new adapter(getApplicationContext(),items));
    }
}