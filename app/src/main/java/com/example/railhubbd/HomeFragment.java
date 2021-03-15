package com.example.railhubbd;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.GridView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class HomeFragment extends Fragment {
    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        ArrayList<String> data = new ArrayList<>();
        data.add("Train Details");
        data.add("Community");
        data.add("Live Update");
        data.add("About Us");

        ArrayAdapter<String> adapter = new ArrayAdapter<>(getContext(), android.R.layout.simple_list_item_1,data);
        GridView gridView = (GridView) view.findViewById(R.id.gridinhome);
        gridView.setAdapter(adapter);
        // Inflate the layout for this fragment
        return view;
    }
}
