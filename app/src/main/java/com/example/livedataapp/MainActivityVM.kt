package com.example.livedataapp

import android.util.MutableDouble
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityVM: ViewModel() {
    val str =  MutableLiveData<Int>()
    fun add(initial: Int){
        str.value = initial.plus(1)
    }
}