package com.jaykapadia.recycler;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class readapter extends RecyclerView.Adapter<readapter.holder>{

    String data1[],data2[];
    int img1[],img2[];
    Context ctx;

    public readapter(Context ct,String s1[],String s2[],int i1[],int i2[]){
        ctx = ct;
        data1=s1;
        data2=s2;
        img1=i1;
        img2=i2;
    }

    @Override
    public readapter.holder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater mInflater = LayoutInflater.from(ctx);
        View myown = mInflater.inflate(R.layout.workout,parent,false);

        return new readapter.holder(myown);
    }

    @Override
    public void onBindViewHolder(holder holder, int position) {
        holder.t1.setText(data1[position]);
        holder.t2.setText(data2[position]);
        holder.myImage1.setImageResource(img1[position]);
        holder.myImage2.setImageResource(img2[position]);

    }

    @Override
    public int getItemCount() {
        return data1.length;
    }
    public class holder extends RecyclerView.ViewHolder {
        TextView t1,t2;
        ImageView myImage1,myImage2;
        public holder(View itemView) {
            super(itemView);
            t1 = itemView.findViewById(R.id.work_name);
            t2 = itemView.findViewById(R.id.work_desc);
            myImage1 = (ImageView)itemView.findViewById(R.id.i1);
            myImage2= (ImageView)itemView.findViewById(R.id.i2);

        }
    }
}
