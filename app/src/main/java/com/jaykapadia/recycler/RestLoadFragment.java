package com.jaykapadia.recycler;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

public class RestLoadFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.recycler,container,false);
        addRecyclerview(view);
        return view;
    }

    private void addRecyclerview(View view){
        RecyclerView recyclerView = view.findViewById(R.id.recyclerview);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new GridLayoutManager(getActivity(),1));

        String s1[],s2[];
        int i1[]= {R.drawable.r1};
        int i2[] ={R.drawable.r2};
        s1 = getResources().getStringArray(R.array.rest_name);
        s2 = getResources().getStringArray(R.array.rest_desc);

        readapter adapter = new readapter(getActivity(),s1,s2,i1,i2);
        recyclerView.setAdapter(adapter);

    }
}
