package com.bharat.touristapp;

/**
 * Created by Bharat on 2/20/2018.
 */

public class Monument {

    private int mImageId;
    private String mTitle;
    private String mDescription;


    public Monument(int imageId, String title, String description){
        mImageId = imageId;
        mTitle = title;
        mDescription = description;
      }

    public int getmImageId(){
        return mImageId;
    }

    public String getmTitle(){
        return mTitle;
    }

    public String getmDescription(){
        return mDescription;
    }



}
