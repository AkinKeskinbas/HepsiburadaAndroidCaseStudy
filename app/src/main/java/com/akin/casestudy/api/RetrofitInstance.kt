package com.akin.casestudy.api

import com.akin.casestudy.util.Constants.Companion.BASE_URL
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {

    private  val  retrofit by  lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    val api : IRetrofit by  lazy {
        retrofit.create(IRetrofit::class.java)
    }
}