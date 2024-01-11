package com.fhz.flow_demo.uistate

import com.fhz.flow_demo.bean.User

/**
 * 时间:2024/1/11
 * @author Mr.Feng
 * 简述: TODO
 */
sealed class UserUiState{

    data class Success(val user:User):UserUiState()
    data class Error(val error:String):UserUiState()
    object Loading:UserUiState()

}
