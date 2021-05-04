package com.utilita.retrofit

import com.utilita.model.StatusModel
import retrofit2.Call
import retrofit2.http.GET

interface ApiInterface {
    @GET("status")
    fun fetchAllStatus(): Call<List<StatusModel>>
}