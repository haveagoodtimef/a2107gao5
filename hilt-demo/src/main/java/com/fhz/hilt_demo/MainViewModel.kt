package com.fhz.hilt_demo

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

/**
 * 时间:2024/1/8
 * @author Mr.Feng
 * 简述: TODO
 */
@HiltViewModel
class MainViewModel @Inject constructor():ViewModel() {

    fun test(){
        println("test")
    }
}