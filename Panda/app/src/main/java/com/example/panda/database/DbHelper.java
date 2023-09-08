package com.example.panda.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DbHelper extends SQLiteOpenHelper {
    public DbHelper( Context context) {
        super(context, "PANDA", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String dbNguoiDung = "CREATE TABLE NGUOIDUNG(mand text primary key, hoten text, matkhau text, loai text)";
        db.execSQL(dbNguoiDung);

        String dbThongTinKH = "CREATE TABLE THONGTINKH(makh integer primary key autoincrement, mand text references NGUONDUNG(mand), sdt text, diachi text)";
        db.execSQL(dbThongTinKH);

        String dbLoaiMon = "CREATE TABLE LOAIMON(maloai integer primary key autoincrement, tenloai text)";
        db.execSQL(dbLoaiMon);

        String dbMonAn = "CREATE TABLE MONAN(mamon integer primary key autoincrement, maloai integer references LOAIMON(maloai), tenmon text, gia integer, mota text, anh text)";
        db.execSQL(dbMonAn);

        String dbDonHang = "CREATE TABLE DONHANG(madh integer primary key autoincrement, makh integer references THONGTINKH(makh), tongsoluong integer, ngay text, trangthai integer)";
        db.execSQL(dbDonHang);

        String dbChiTietDH = "CREATE TABLE CHITIETDH(macthd integer primary key autoincrement, madh integer references DONHANG(madh), mamon integer references MONAN(mamon), soluong integr)";
        db.execSQL(dbChiTietDH);

        String dbDanhGia = "CREATE TABLE DANHGIA(madg integer primary key autoincrement, makh integer references THONGTINKH(makh), mamon integer references MONAN(mamon), ngay text, danhgia text)";
        db.execSQL(dbDanhGia);

        db.execSQL("INSERT INTO NGUOIDUNG VALUES ('admin','Admin','123','admin'),('kh1','nguyen van a','1234','kh'),('kh2','le thi le','1234','kh')");
        db.execSQL("INSERT INTO THONGTINKH VALUES (1,'kh1','02456875','HCM'),(2,'kh2','0221584','HN')");
        db.execSQL("INSERT INTO LOAIMON VALUES (1,'xào'),(2,'nướng'),(3,'hấp'),(4,'sup'),(5,'hải sản')");
        db.execSQL("INSERT INTO MONAN VALUES (1,2,'Heo quay da giòn',188000,'Da heo được quay giòn theo công thức bí truyền', 'https://d1-concepts.com/wp-content/uploads/2021/03/Screenshot-2021-03-25-171729.jpg')," +
                "(2,2,'Sườn non quay mật ong',188000,'Sườn mềm mọng nước cùng mật ong thượng hạng','https://d1-concepts.com/wp-content/uploads/2020/06/su%CC%9Bo%CC%9B%CC%80n-non-quay-ma%CC%A3%CC%82t-ong-01-300x300.jpg')," +
                "(3,2,'Bồ câu quay kim bài',198000,'Bồ câu được quay với công thức đặc biệt','https://d1-concepts.com/wp-content/uploads/2020/06/bo%CC%82%CC%80-ca%CC%82u-quay-kim-ba%CC%80i-01-1-300x300.jpg')," +
                "(4,1,'Cải rổ xào tỏi',88000,'Cải rổi xào cùng tỏi thơm','https://d1-concepts.com/wp-content/uploads/2020/06/ca%CC%89i-ro%CC%82%CC%89-xa%CC%80o-to%CC%89i-01-300x300.jpg')," +
                "(5,1,'Cải xào sốt bào ngư',88000,'Cải xanh, sốt bào ngư trứ danh','https://d1-concepts.com/wp-content/uploads/2020/06/ca%CC%89i-xa%CC%80o-so%CC%82%CC%81t-ba%CC%80o-ngu%CC%9B-01-300x300.jpg')," +
                "(6,3,'Há cảo tôm và thanh cua',98000,'Há cảo thơm ngon','https://d1-concepts.com/wp-content/uploads/2020/06/ha%CC%81-ca%CC%89o-to%CC%82m-va%CC%80-thanh-cua-01-300x300.jpg')," +
                "(7,3,'Xíu mại nấm hương thịt cua trứng cá',98000,'Hương thơm không thể cưỡng','https://d1-concepts.com/wp-content/uploads/2021/03/Screenshot-2021-03-25-174021.jpg')," +
                "(8,4,'Sup hải sản chua cay',88000,'vị chua cay khó tả','https://d1-concepts.com/wp-content/uploads/2020/06/su%CC%81p-ha%CC%89i-sa%CC%89n-chua-cay-300x300.jpg')," +
                "(9,4,'Sup vi cá tiềm hải vị',388000,'vi cá thượng hạn','https://d1-concepts.com/wp-content/uploads/2020/06/su%CC%81p-vi-ca%CC%81-tie%CC%82%CC%80m-ha%CC%89i-vi%CC%A3-01-300x300.jpg')," +
                "(10,5,'Hải xâm gân heo sốt XO',288000,'Sốt XO trứ danh','https://d1-concepts.com/wp-content/uploads/2020/06/ha%CC%89i-sa%CC%82m-ga%CC%82n-heo-so%CC%82%CC%81t-xo-01-300x300.jpg')," +
                "(11,5,'Tôm sú hoàng kim trứng muối',238000,'Tôm sú thượng hạn','https://d1-concepts.com/wp-content/uploads/2020/06/to%CC%82m-su%CC%81-chie%CC%82n-hoa%CC%80ng-kim-tru%CC%9B%CC%81ng-muo%CC%82%CC%81i-01-300x300.jpg')");


    }


    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        if (oldVersion != newVersion){
            db.execSQL("DROP TABLE IF EXISTS NGUOIDUNG");
            db.execSQL("DROP TABLE IF EXISTS THONGTINKH");
            db.execSQL("DROP TABLE IF EXISTS LOAIMON");
            db.execSQL("DROP TABLE IF EXISTS MONAN");
            db.execSQL("DROP TABLE IF EXISTS DONHANG");
            db.execSQL("DROP TABLE IF EXISTS CHITIETDH");
            onCreate(db);
        }
    }
}
