package com.android.example.gisandroidmysql.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ListLocationModel {
    @SerializedName("data")
    private List<LocationModel> mData;

    public ListLocationModel(List<LocationModel> mData) { this.mData = mData ; }

    public ListLocationModel() {
    }

    public List<LocationModel> getData() { return mData; }

    public void setData(List<LocationModel> mData) { this.mData = mData; }
}

