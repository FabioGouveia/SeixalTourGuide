package com.example.android.seixaltourguide.model;

public abstract class Place {

    public static final String TYPE_KEY = "type_key";

    public static final int PLACE_TYPE_ATTRACTION = 100;
    public static final int PLACE_TYPE_EVENT = 101;
    public static final int PLACE_TYPE_PUBLIC_PLACE = 102;
    public static final int PLACE_TYPE_RESTAURANTE = 103;

    String description;
    String address;

    public  String getDescription(){
        return description;
    }

    public String getAddress(){
        return address;
    }

}
