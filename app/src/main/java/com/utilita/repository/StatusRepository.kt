package com.utilita.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.utilita.model.StatusModel
import com.utilita.retrofit.ApiClient
import com.utilita.retrofit.ApiInterface
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class StatusRepository {

    private var apiInterface:ApiInterface?=null

    init {
        apiInterface = ApiClient.getApiClient().create(ApiInterface::class.java)
    }

    fun fetchAllStatus():LiveData<List<StatusModel>>{
        val data = MutableLiveData<List<StatusModel>>()

        apiInterface?.fetchAllStatus()?.enqueue(object : Callback<List<StatusModel>>{

            override fun onFailure(call: Call<List<StatusModel>>, t: Throwable) {
                data.value = null
            }

            override fun onResponse(
                    call: Call<List<StatusModel>>,
                    response: Response<List<StatusModel>>
            ) {

                val res = response.body()
                if (response.code() == 200 &&  res!=null){
                    data.value = res
                }else{
                    data.value = null
                }

            }
        })

        return data

    }

}