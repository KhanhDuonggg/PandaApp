package com.example.panda.dao;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.panda.database.DbHelper;
import com.example.panda.model.ChiTietDH;

import java.util.ArrayList;

public class ChiTietDHDAO {
    DbHelper dbHelper;
    public ChiTietDHDAO(Context context){
        dbHelper = new DbHelper(context);
    }

    // lay ds chi tiet
    public ArrayList<ChiTietDH> getDSChiTietDH(){
        ArrayList<ChiTietDH> list = new ArrayList<>();
        SQLiteDatabase sqLiteDatabase = dbHelper.getReadableDatabase();
        Cursor cursor = sqLiteDatabase.rawQuery("SELECT ct.mactdh, dh.madh, mo.mamon, mo.tenmon, mo.gia, ct.soluong, mo.anh FROM CHITIETDH ct, DONHANG dh, MONAN mo WHERE mo.mamon = ct.mamon and ct.madh = dh.madh", null);

        if (cursor.getCount() !=0 ){
            cursor.moveToFirst();
            do {
                list.add(new ChiTietDH(cursor.getInt(0),cursor.getInt(1),cursor.getInt(2),cursor.getString(3),cursor.getInt(4), cursor.getInt(5),cursor.getBlob(6)));
            }while (cursor.moveToNext());
        }

        return list;
    }

    // them
    public boolean themCHiTietDH(ChiTietDH chiTietDH){
        SQLiteDatabase sqLiteDatabase = dbHelper.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("madh", chiTietDH.getMadh());
        contentValues.put("mamon", chiTietDH.getMamon());
        contentValues.put("soluong", chiTietDH.getSoluong());
        long check = sqLiteDatabase.insert("CHITIETDK",null,contentValues);

        if (check == -1)
            return false;
        return true;
    }
}
