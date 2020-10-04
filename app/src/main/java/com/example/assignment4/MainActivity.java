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

        mFoodInfo = new FoodInfo("This is the name of the food 1 ","This is description of the food 1 ",R.drawable.springroll);
        myFoodList.add(mFoodInfo);

        mFoodInfo = new FoodInfo("Name Food 2 ","Description food 2 ",R.drawable.food2);
        myFoodList.add(mFoodInfo);

        mFoodInfo = new FoodInfo("Name food 3 ","Description food 3",R.drawable.food3);
        myFoodList.add(mFoodInfo);

        mFoodInfo = new FoodInfo("Name food 4","Description food 4",R.drawable.food4);
        myFoodList.add(mFoodInfo);

        FoodAdapter foodAdapter = new FoodAdapter(MainActivity.this,myFoodList);
        mRecyclerView.setAdapter(foodAdapter);


    }
}