package com.example.panda.model;

public class ChiTietDH {
    private int mactdh;
    private int madh;
    private int mamon;
    private String tenmon;
    private int gia;
    private int soluong;

    public ChiTietDH(int mactdh, int madh, int mamon, String tenmon, int gia, int soluong, byte[] anh) {
        this.mactdh = mactdh;
        this.madh = madh;
        this.mamon = mamon;
        this.tenmon = tenmon;
        this.gia = gia;
        this.soluong = soluong;
        this.anh = anh;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    private byte[] anh;

    public int getMactdh() {
        return mactdh;
    }

    public void setMactdh(int mactdh) {
        this.mactdh = mactdh;
    }

    public int getMadh() {
        return madh;
    }

    public void setMadh(int madh) {
        this.madh = madh;
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

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public byte[] getAnh() {
        return anh;
    }

    public void setAnh(byte[] anh) {
        this.anh = anh;
    }


}
