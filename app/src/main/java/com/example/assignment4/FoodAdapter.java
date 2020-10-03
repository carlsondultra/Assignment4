package com.example.assignment4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.security.AccessController;
import java.util.List;

public class FoodAdapter extends RecyclerView.Adapter<FoodViewHolder> {

    private Context mContext;
    private List<FoodInfo> myFoodList;

    public FoodAdapter(Context mContext, List<FoodInfo> myFoodList) {
        this.mContext = mContext;
        this.myFoodList = myFoodList;
    }

    @Override
    public FoodViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View mView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.recycler_row_piece, viewGroup, false);

        return new FoodViewHolder(mView);
    }

    @Override
    public void onBindViewHolder(@NonNull FoodViewHolder foodViewHolder, int i) {

        foodViewHolder.imageView.setImageResource(myFoodList.get(i).getFoodImage());
        foodViewHolder.mTitle.setText(myFoodList.get(i).getFoodName());
        foodViewHolder.mDescription.setText(myFoodList.get(i).getFoodDescription());

    }

    @Override
    public int getItemCount() {
        return myFoodList.size();
    }
}

class FoodViewHolder extends RecyclerView.ViewHolder{

    ImageView imageView;
    TextView mTitle, mDescription;
    CardView mCardView;


    public FoodViewHolder(View itemView) {
        super(itemView);

        imageView = itemView.findViewById(R.id.ivImage);
        mTitle = itemView.findViewById(R.id.tvTitle);
        mDescription = itemView.findViewById(R.id.tvDescription);

        mCardView = itemView.findViewById(R.id.myCardView);

    }
}
