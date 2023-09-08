package com.example.panda.model;

public class MonAn {
    private int mamon;
    private String tenmon;
    private int maloai;
    private int gia;
    private String mota;
    private String anh;
    private String tenloai;
    private int img;

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public MonAn(String tenmon, int gia, int img) {
        this.tenmon = tenmon;
        this.gia = gia;
        this.img = img;
    }

    public MonAn(int mamon, int maloai, String tenmon, String tenloai, int gia, String mota, String anh) {
        this.mamon = mamon;
        this.tenmon = tenmon;
        this.maloai = maloai;
        this.gia = gia;
        this.mota = mota;
        this.anh = anh;
        this.tenloai = tenloai;
    }

    public MonAn(int maloai, String tenmon, int gia, String mota, String anh) {
        this.tenmon = tenmon;
        this.maloai = maloai;
        this.gia = gia;
        this.mota = mota;
        this.anh = anh;
    }

    public MonAn(int maloai, String tenmon, int gia, String mota) {
        this.tenmon = tenmon;
        this.maloai = maloai;
        this.gia = gia;
        this.mota = mota;
    }



    public String getTenloai() {
        return tenloai;
    }

    public void setTenloai(String tenloai) {
        this.tenloai = tenloai;
    }

    public int getMamon() {
        return mamon;
    }

    public void setMamon(int mamon) {
        this.mamon = mamon;
    }

    public String getTenmon() {
        return tenmon;
    }

    public void setTenmon(String tenmon) {
        this.tenmon = tenmon;
    }

    public int getMaloai() {
        return maloai;
    }

    public void setMaloai(int maloai) {
        this.maloai = maloai;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public String getAnh() {
        return anh;
    }

    public void setAnh(String anh) {
        this.anh = anh;
    }
}
