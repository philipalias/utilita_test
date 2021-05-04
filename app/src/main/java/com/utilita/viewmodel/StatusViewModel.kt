package com.utilita.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.utilita.model.StatusModel
import com.utilita.repository.StatusRepository

class StatusViewModel : ViewModel() {
    // TODO: Implement the ViewModel

    private var statusRepository:StatusRepository?=null
    var statusModelListLiveData : LiveData<List<StatusModel>>?=null

    init {
        statusRepository = StatusRepository()
        statusModelListLiveData = MutableLiveData()
    }

    fun fetchAllStatus(){
        statusModelListLiveData = statusRepository?.fetchAllStatus()
    }
}