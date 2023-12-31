package com.example.trip_project.hotel;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.trip_project.R;

import java.util.ArrayList;
import java.util.List;

public class Fragment1 extends Fragment {

    RecyclerView foryouRecycler, topplacesRecycler;
    foryouAdapter foryouAdapter;
    topplacesAdapter topplacesAdapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tab_frame1, container, false);

        List<foryouData> foryouDataList = new ArrayList<>();
        foryouDataList.add(new foryouData("Hotel Calimala", "Florence", "From $400", R.drawable.hotel1));
        foryouDataList.add(new foryouData("아르떼미데", "Roma", "From $350", R.drawable.hotel2));
        foryouDataList.add(new foryouData("골뱅이 민박", "Milano", "From $180", R.drawable.hotel3));
        foryouDataList.add(new foryouData("Nilgiri Hills", "Milano", "From $300", R.drawable.hotel4));
        foryouDataList.add(new foryouData("Turin Hotel", "Roma", "From $200", R.drawable.hotel5));
        foryouDataList.add(new foryouData("안티체 피겨", "Venezia", "From $500", R.drawable.hotel6));

        setforyouRecycler(view, foryouDataList);

        List<topplacesData> topplacesDataList = new ArrayList<>();
        topplacesDataList.add(new topplacesData("이스트 마이애미", "Miami", "From $400", R.drawable.hotel7));
        topplacesDataList.add(new topplacesData("더 미라지", "New York", "From $750", R.drawable.hotel8));
        topplacesDataList.add(new topplacesData("아미아나 리조트", "Nha Trang Bay", "From $180", R.drawable.hotel9));
        topplacesDataList.add(new topplacesData("Nilgiri Hills", "Seoul", "From $300", R.drawable.hotel10));
        topplacesDataList.add(new topplacesData("멜리아 빈펄", "Italy", "From $200", R.drawable.hotel11));
        topplacesDataList.add(new topplacesData("인터컨티넨탈", "Italy", "From $500", R.drawable.hotel12));

        settopplacesRecycler(view, topplacesDataList);


        return view;
    }


    protected void setforyouRecycler(View view, List<foryouData> foryouDataList ) {
        foryouRecycler = view.findViewById(R.id.foryou_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity(), RecyclerView.HORIZONTAL, false);
        foryouRecycler.setLayoutManager(layoutManager);
        foryouAdapter = new foryouAdapter(getActivity(), foryouDataList);
        foryouRecycler.setAdapter(foryouAdapter);

    }

    protected void settopplacesRecycler(View view, List<topplacesData> topplacesDataList) {
        topplacesRecycler = view.findViewById(R.id.topplaces_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity(), RecyclerView.VERTICAL, false);
        topplacesRecycler.setLayoutManager(layoutManager);
        topplacesAdapter = new topplacesAdapter(getActivity(), topplacesDataList);
        topplacesRecycler.setAdapter(topplacesAdapter);

    }


}
