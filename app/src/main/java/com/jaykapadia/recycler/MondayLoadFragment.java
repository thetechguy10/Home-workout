package com.jaykapadia.recycler;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class MondayLoadFragment  extends Fragment{
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
        int i1[]= {R.drawable.ci1,R.drawable.cci1,R.drawable.ccci1,R.drawable.c4i1,R.drawable.ai1,R.drawable.aai1,R.drawable.aaai1};
        int i2[]={R.drawable.ci2,R.drawable.cci2,R.drawable.ccci2,R.drawable.c4i2,R.drawable.ai2,R.drawable.aai2,R.drawable.aaai2};

        s1 = getResources().getStringArray(R.array.mon_name);
        s2 = getResources().getStringArray(R.array.mon_desc);

        readapter adapter = new readapter(getActivity(),s1,s2,i1,i2);
        recyclerView.setAdapter(adapter);
        recyclerView.addOnItemTouchListener(new RecyclerItemClickListener(getActivity(), recyclerView, new RecyclerItemClickListener.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                if(position == 0){
                    Intent my = new Intent(getActivity(),workout_desc.class);
                    my.putExtra("url","https://www.bodybuilding.com/exercises/barbell-bench-press-medium-grip");
                    getActivity().startActivity(my);
                }
                if(position == 1){
                    Intent my = new Intent(getActivity(),workout_desc.class);
                    my.putExtra("url","https://www.bodybuilding.com/exercises/incline-dumbbell-press");
                    getActivity().startActivity(my);
                }
                if(position == 2){
                    Intent my = new Intent(getActivity(),workout_desc.class);
                    my.putExtra("url","https://www.bodybuilding.com/exercises/dumbbell-flyes");
                    getActivity().startActivity(my);
                }
                if(position == 3){
                    Intent my = new Intent(getActivity(),workout_desc.class);
                    my.putExtra("url","https://www.bodybuilding.com/exercises/pushups");
                    getActivity().startActivity(my);
                }
                if(position == 4){
                    Intent my = new Intent(getActivity(),workout_desc.class);
                    my.putExtra("url","https://www.bodybuilding.com/exercises/crunches");
                    getActivity().startActivity(my);
                }
                if(position == 5){
                    Intent my = new Intent(getActivity(),workout_desc.class);
                    my.putExtra("url","https://www.bodybuilding.com/exercises/reverse-crunch");
                    getActivity().startActivity(my);
                }
                if(position == 6){
                    Intent my = new Intent(getActivity(),workout_desc.class);
                    my.putExtra("url","https://www.bodybuilding.com/exercises/barbell-side-bend");
                    getActivity().startActivity(my);
                }
            }

            @Override
            public void onLongItemClick(View view, int position) {

            }
        }));

}
}
