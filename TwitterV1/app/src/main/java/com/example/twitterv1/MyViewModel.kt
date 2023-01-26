package com.example.twitterv1

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MyViewModel: ViewModel() {
    private val data = MutableLiveData<String>()

    fun getData(): LiveData<String> {
        return data
    }

    fun setData(newData: String) {
        data.value = newData
    }
}
