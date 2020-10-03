package com.example.assignment4;

public class FoodInfo {

    private String foodName;
    private String foodDescription;

    public FoodInfo(String foodName, String foodDescription){
        this.foodName = foodName;
        this.foodDescription = foodDescription;
    }

    public String getFoodName(){
        return foodName;
    }

    public String getFoodDescription(){
        return foodDescription;
    }

}
