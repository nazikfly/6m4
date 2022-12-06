package com.geektech.a6m4.ui

import androidx.lifecycle.MutableLiveData
import com.geektech.a6m4.base.BaseViewModel

class MainViewModel : BaseViewModel() {

    var counter = 0
    private var history = ""

    var listCounter = MutableLiveData<Int>()
    var listHistory = MutableLiveData<String>()

    fun increase(){
        counter++
        listCounter.value=counter
        history="$history\n+"
        listHistory.value=history
    }
    fun decrease(){
        counter--
        listCounter.value=counter
        history="$history\n-"
        listHistory.value=history
    }


}