package com.fhz.flow_demo.base

import androidx.lifecycle.ViewModel
import com.fhz.flow_demo.uistate.BaseUiState
import com.fhz.flow_demo.uistate.Empty
import com.fhz.flow_demo.uistate.UserUiState
import kotlinx.coroutines.flow.MutableStateFlow

/**
 * 时间:2024/1/11
 * @author Mr.Feng
 * 简述: TODO
 */
abstract class BaseViewModel : ViewModel() {

    fun post(intent: InitIntent){
        handle(intent)
    }

    abstract fun handle(baseIntent: BaseIntent)

    // 处理Intent
    // 处理State
    // 处理Effect



}