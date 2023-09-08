package com.example.panda.model;

import java.util.ArrayList;


public class Category {
    private String nameCategory;
    private ArrayList<MonAn> listCategory;

    public String getNameCategory() {
        return nameCategory;
    }

    public void setNameCategory(String nameCategory) {
        this.nameCategory = nameCategory;
    }

    public ArrayList<MonAn> getListCategory() {
        return listCategory;
    }

    public void setListCategory(ArrayList<MonAn> listCategory) {
        this.listCategory = listCategory;
    }

    public Category(String nameCategory, ArrayList<MonAn> listCategory) {
        this.nameCategory = nameCategory;
        this.listCategory = listCategory;
    }
}
