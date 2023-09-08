package com.example.panda.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.panda.dao.ThongTinKHDAO;
import com.example.panda.model.ThongTinKH;

import java.util.ArrayList;

public class ThongTinKHAdapter extends RecyclerView.Adapter<ThongTinKHAdapter.ViewHolder>{
    private Context context;
    private ArrayList<ThongTinKH> list;
    private ThongTinKHDAO thongTinKHDAO;

    public ThongTinKHAdapter(Context context, ArrayList<ThongTinKH> list, ThongTinKHDAO thongTinKHDAO) {
        this.context = context;
        this.list = list;
        this.thongTinKHDAO = thongTinKHDAO;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
