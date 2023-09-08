package com.example.panda.model;

public class DonHang {
    private int madh;
    private int makh;
    private String hoten;
    private int tongsoluong;
    private String ngay;
    private int trangthai;

    public int getMadh() {
        return madh;
    }

    public void setMadh(int madh) {
        this.madh = madh;
    }

    public int getMakh() {
        return makh;
    }

    public void setMakh(int makh) {
        this.makh = makh;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public int getTongsoluong() {
        return tongsoluong;
    }

    public void setTongsoluong(int tongsoluong) {
        this.tongsoluong = tongsoluong;
    }

    public String getNgay() {
        return ngay;
    }

    public void setNgay(String ngay) {
        this.ngay = ngay;
    }

    public int getTrangthai() {
        return trangthai;
    }

    public void setTrangthai(int trangthai) {
        this.trangthai = trangthai;
    }

    public DonHang(int madh, int makh, String hoten, int tongsoluong, String ngay, int trangthai) {
        this.madh = madh;
        this.makh = makh;
        this.hoten = hoten;
        this.tongsoluong = tongsoluong;
        this.ngay = ngay;
        this.trangthai = trangthai;
    }
}
