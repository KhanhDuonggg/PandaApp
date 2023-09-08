package com.example.panda;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.google.android.material.appbar.CollapsingToolbarLayout;

public class ChiTietActivity extends AppCompatActivity {

    Toolbar toolbar;
    TextView txtGia, txtMota;
    RecyclerView recyclerViewDanhGia;
    ImageView imgAnh;
    CollapsingToolbarLayout collapsingToolbarLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chi_tiet);
        toolbar = findViewById(R.id.main_toolbar);
        txtGia = findViewById(R.id.txtGia);
        txtMota = findViewById(R.id.txtMota);
        imgAnh = findViewById(R.id.main_backdrop);
        collapsingToolbarLayout = findViewById(R.id.main_collapsing);

        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setHomeAsUpIndicator(R.drawable.back);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        String tenmon = bundle.getString("tenmon");
        int gia = bundle.getInt("gia",0);
        String mota = bundle.getString("mota");
        String anh = bundle.getString("anh");

        collapsingToolbarLayout.setTitle(tenmon);
        txtGia.setText(Integer.toString(gia) + " vnđ");
        txtMota.setText("Mô tả: " + mota);
        Glide.with(this).load(anh).into(imgAnh);
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home){
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}