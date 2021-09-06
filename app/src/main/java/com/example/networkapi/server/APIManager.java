package com.example.networkapi.server;

import com.example.networkapi.entity.Item;

import retrofit2.Call;
import retrofit2.http.GET;

public interface APIManager {
    String SERVER_URL = "https://api-demo-anhth.herokuapp.com/";
    @GET("data.json")
    Call<Item> getItemData();

}
