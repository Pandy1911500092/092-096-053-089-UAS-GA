package com.android.example.gisandroidmysql.model;

import com.google.gson.annotations.SerializedName;

public class LocationModel {
    @SerializedName("name")
    private String imageLocationsName;
    @SerializedName("latitude")
    private String latitude;
    @SerializedName("longitude")
    private String longitude;

    public LocationModel(String imageLocationsName, String latitude, String longitude ) {
        this.imageLocationsName = imageLocationsName;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public LocationModel() {
    }

    public String getImageLocationsName() { return imageLocationsName; }

    public void setImageLocationsName(String imageLocationsName) {
        this.imageLocationsName = imageLocationsName;
    }

    public String getLatitude() { return latitude; }

    public void setLatitude(String latitude) { this.latitude = latitude; }

    public String getLongitude() { return longitude; }

    public void setLongitude(String longitude) { this.longitude = longitude; }
}

