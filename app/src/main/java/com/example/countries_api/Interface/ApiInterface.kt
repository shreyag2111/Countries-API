package com.example.allworldcountries.Interface

import retrofit2.http.GET

class ApiInterface {

    @GET("all")
    fun getcountry() : Call<List<countrieModel>>
}