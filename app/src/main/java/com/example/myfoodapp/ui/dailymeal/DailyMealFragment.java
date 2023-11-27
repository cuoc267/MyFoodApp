package com.example.myfoodapp.ui.dailymeal;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myfoodapp.R;
import com.example.myfoodapp.adapters.DailyMealAdapter;
import com.example.myfoodapp.models.DailyMealModel;

import java.util.ArrayList;
import java.util.List;

public class DailyMealFragment extends Fragment {

    RecyclerView recyclerView;
    List<DailyMealModel> dailyMealModelList;
    DailyMealAdapter dailyMealAdapter;



    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.daily_meal_fragment, container, false);
        recyclerView = root.findViewById(R.id.daily_meal_rec);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        dailyMealModelList = new ArrayList<>();

        dailyMealModelList.add(new DailyMealModel(R.drawable.breakfast,"Breakfast","30% OFF","Description Description","breakfast"));
        dailyMealModelList.add(new DailyMealModel(R.drawable.lunch,"Lunch","20% OFF","Description Description","lunch"));
        dailyMealModelList.add(new DailyMealModel(R.drawable.dinner,"Dinner","30% OFF","Description Description","dinner"));
        dailyMealModelList.add(new DailyMealModel(R.drawable.sweets,"Sweets","39% OFF","Description Description","sweets"));
        dailyMealModelList.add(new DailyMealModel(R.drawable.coffe,"Coffee","20% OFF","Description Description","coffee"));

        dailyMealAdapter = new DailyMealAdapter(getContext(),dailyMealModelList);
        recyclerView.setAdapter(dailyMealAdapter);
        dailyMealAdapter.notifyDataSetChanged();
        return root;
    }

}