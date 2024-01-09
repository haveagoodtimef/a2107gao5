package com.fhz.mvi.base

import androidx.lifecycle.ViewModel

/**
 * 时间:2024/1/9
 * @author Mr.Feng
 * 简述: TODO
 */
abstract class BaseViewModel : ViewModel() {
    abstract fun handle(action:BaseAction)
}