package com.utilita.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.utilita.model.StatusModel
import com.utilita.retrofit.ApiClient
import com.utilita.retrofit.ApiInterface
import com.utilita.utils.Utils
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class StatusRepository {

    private var apiInterface:ApiInterface?=null

    init {
        apiInterface = ApiClient.getApiClient().create(ApiInterface::class.java)
    }

    fun fetchAllStatus(): LiveData<StatusModel>? {

            val data = MutableLiveData<StatusModel>()


            apiInterface?.fetchAllStatus()?.enqueue(object : Callback<StatusModel> {

                override fun onFailure(call: Call<StatusModel>, t: Throwable) {
                    data.value = null
                }

                override fun onResponse(
                        call: Call<StatusModel>,
                        response: Response<StatusModel>
                ) {

                    val res = response.body()
                    data.value = res

                }
            })

            return data
    }

}