package com.example.panda.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.panda.R;
import com.example.panda.model.Banner;
import com.example.panda.model.MonAn;

import java.util.ArrayList;

public class NoiBatAdapter extends RecyclerView.Adapter<NoiBatAdapter.ViewHolder>{

    private ArrayList<MonAn> list;

    public void setData(ArrayList<MonAn> list){
        this.list = list;
        notifyDataSetChanged();
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_banner,parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.imgBanner.setImageResource(list.get(position).getImg());
        holder.txtTenmon.setText(list.get(position).getTenmon());
        holder.txtGia.setText(list.get(position).getGia()+" 000 VND");

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        ImageView imgBanner;
        TextView txtTenmon, txtGia;
        public ViewHolder(View itemView) {
            super(itemView);

            imgBanner = itemView.findViewById(R.id.imgBanner);
            txtTenmon = itemView.findViewById(R.id.txtTenmon);
            txtGia = itemView.findViewById(R.id.txtGia);
        }
    }
}
