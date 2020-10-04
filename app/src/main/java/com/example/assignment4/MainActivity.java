package com.example.assignment4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.GridLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;
    List<FoodInfo> myFoodList;
    FoodInfo mFoodInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = (RecyclerView)findViewById(R.id.recyclerview);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(MainActivity.this,1);
        mRecyclerView.setLayoutManager(gridLayoutManager);

        myFoodList = new ArrayList<>();

        mFoodInfo = new FoodInfo("Spring Rolls","This is very delicious to munch on as a casual snack or in a platter to entertain guests ",R.drawable.springroll);
        myFoodList.add(mFoodInfo);

        mFoodInfo = new FoodInfo("Pineapple Salmon","A sweet yet savoury fish dish which is sure to bring a neat twist into your cuisine",R.drawable.food2);
        myFoodList.add(mFoodInfo);

        mFoodInfo = new FoodInfo("Mixed Breakfast Platter","A simple yet delicious meal with nutritional values",R.drawable.food3);
        myFoodList.add(mFoodInfo);

        mFoodInfo = new FoodInfo("Spaghetti","A classic food which is popular in many European countries",R.drawable.food4);
        myFoodList.add(mFoodInfo);

        FoodAdapter foodAdapter = new FoodAdapter(MainActivity.this,myFoodList);
        mRecyclerView.setAdapter(foodAdapter);


    }
}