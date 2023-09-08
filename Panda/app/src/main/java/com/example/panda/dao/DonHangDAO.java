package com.example.panda.dao;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.http.SslCertificate;

import com.example.panda.database.DbHelper;
import com.example.panda.model.DonHang;

import java.util.ArrayList;

public class DonHangDAO {
    DbHelper dbHelper;
    public DonHangDAO(Context context){
        dbHelper = new DbHelper(context);
    }

    //lay ds don hang
    public ArrayList<DonHang> getDSDonHang(){
        ArrayList<DonHang> list = new ArrayList<>();
        SQLiteDatabase sqLiteDatabase = dbHelper.getReadableDatabase();
        Cursor cursor = sqLiteDatabase.rawQuery("SELECT dh.madh, kh.makh, kh.hoten, dh.tongsoluong, dh.ngay, dh.trangthai FROM DONHANG dh, THONGTINKH kh WHERE dh.makh = kh.makh", null);

        if (cursor.getCount() != 0 ){
            cursor.moveToFirst();
            do {
                list.add(new DonHang(cursor.getInt(0),cursor.getInt(1),cursor.getString(2),cursor.getInt(3),cursor.getString(4),cursor.getInt(5)));
            }while (cursor.moveToNext());
        }

        return list;
    }

    // them
    public boolean themDonnHang(DonHang donHang){
        SQLiteDatabase sqLiteDatabase = dbHelper.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("makh", donHang.getMakh());
        contentValues.put("tongsoluong", donHang.getTongsoluong());
        contentValues.put("ngay", donHang.getNgay());
        contentValues.put("trangthai", donHang.getTrangthai());
        long check = sqLiteDatabase.insert("DONHANG",null,contentValues);

        if (check == -1)
            return false;
        return true;
    }

    // doi trang thai
    public boolean trangThai(int madh, int index){
        SQLiteDatabase sqLiteDatabase = dbHelper.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("trangthai", index);
        long check = sqLiteDatabase.update("DONHANG", contentValues,"madh = ?", new String[]{String.valueOf(madh)});

        if (check == -1)
            return false;
        return true;
    }
}















