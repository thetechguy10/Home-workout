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

public class FridayLoadFragment extends Fragment {
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
        int i1[]= {R.drawable.si1,R.drawable.ssi1,R.drawable.s3i1,R.drawable.s4i1,R.drawable.s5i1};
        int i2[] ={R.drawable.si2,R.drawable.ssi2,R.drawable.s3i2,R.drawable.s4i2,R.drawable.s5i2};
        s1 = getResources().getStringArray(R.array.fri_name);
        s2 = getResources().getStringArray(R.array.fri_desc);

        readapter adapter = new readapter(getActivity(),s1,s2,i1,i2);
        recyclerView.setAdapter(adapter);
        recyclerView.addOnItemTouchListener(new RecyclerItemClickListener(getActivity(), recyclerView, new RecyclerItemClickListener.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                if(position == 0){
                    Intent my = new Intent(getActivity(),workout_desc.class);
                    my.putExtra("url","https://www.bodybuilding.com/exercises/seated-dumbbell-press");
                    getActivity().startActivity(my);
                }
                if(position == 1){
                    Intent my = new Intent(getActivity(),workout_desc.class);
                    my.putExtra("url","https://www.bodybuilding.com/exercises/side-lateral-raise");
                    getActivity().startActivity(my);
                }
                if(position == 2){
                    Intent my = new Intent(getActivity(),workout_desc.class);
                    my.putExtra("url","https://www.bodybuilding.com/exercises/seated-bent-over-rear-delt-raise");
                    getActivity().startActivity(my);
                }
                if(position == 3){
                    Intent my = new Intent(getActivity(),workout_desc.class);
                    my.putExtra("url","https://www.bodybuilding.com/exercises/upright-barbell-row");
                    getActivity().startActivity(my);
                }
                if(position == 4){
                    Intent my = new Intent(getActivity(),workout_desc.class);
                    my.putExtra("url","https://www.bodybuilding.com/exercises/dumbbell-shrug");
                    getActivity().startActivity(my);
                }
            }

            @Override
            public void onLongItemClick(View view, int position) {

            }
        }));
    }
}
