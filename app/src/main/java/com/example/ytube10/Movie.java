package com.example.ytube10;

import android.telecom.Call;

import com.google.gson.annotations.SerializedName;

public class Movie {
   //model class
   private int id;
   private String title;
   private float rating;
   private String poster;


   // need to make object of class details
   //different name from json, we need to serialize it
   @SerializedName("Details")
    private MoreDetails moreDetails;

    //constuctor


   public Movie(int id, String title, float rating, String poster, MoreDetails moreDetails) {
      this.id = id;
      this.title = title;
      this.rating = rating;
      this.poster = poster;
      this.moreDetails = moreDetails;
   }

   //Getters and Setters

   public String getTitle() {
      return title;
   }

   public float getRating() {
      return rating;
   }

   public String getPoster() {
      return poster;
   }

   public MoreDetails getMoreDetails() {
      return moreDetails;
   }
}
