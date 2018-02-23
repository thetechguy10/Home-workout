package com.jaykapadia.recycler;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class TuesdayLoadFragment extends Fragment{
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
        int i1[]= {R.drawable.bi1,R.drawable.bbi1,R.drawable.bbbi1,R.drawable.b4i1};
        int i2[] ={R.drawable.bi2,R.drawable.bbi2,R.drawable.bbbi2,R.drawable.b4i2};
        s1 = getResources().getStringArray(R.array.tues_name);
        s2 = getResources().getStringArray(R.array.tues_desc);

        readapter adapter = new readapter(getActivity(),s1,s2,i1,i2);
        recyclerView.setAdapter(adapter);
        recyclerView.addOnItemTouchListener(new RecyclerItemClickListener(getActivity(), recyclerView, new RecyclerItemClickListener.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                if (position == 0) {
                    Intent my = new Intent(getActivity(), workout_desc.class);
                    my.putExtra("url", "https://www.bodybuilding.com/exercises/bent-over-barbell-row");
                    getActivity().startActivity(my);
                }
                if (position == 1) {
                    Intent my = new Intent(getActivity(), workout_desc.class);
                    my.putExtra("url", "https://www.bodybuilding.com/exercises/pullups");
                    getActivity().startActivity(my);
                }
                if (position == 2) {
                    Intent my = new Intent(getActivity(), workout_desc.class);
                    my.putExtra("url", "https://www.bodybuilding.com/exercises/one-arm-dumbbell-row");
                    getActivity().startActivity(my);
                }
                if (position == 3) {
                    Intent my = new Intent(getActivity(), workout_desc.class);
                    my.putExtra("url", "https://www.bodybuilding.com/exercises/barbell-deadlift");
                    getActivity().startActivity(my);
                }
            }
            @Override
            public void onLongItemClick(View view, int position) {

            }
        }));

    }
}
