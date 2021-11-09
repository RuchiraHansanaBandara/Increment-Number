package com.example.numberincreaser

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel:ViewModel() {

    var num = 0;

    val curruntNumber: MutableLiveData<Int> = MutableLiveData<Int>()
}