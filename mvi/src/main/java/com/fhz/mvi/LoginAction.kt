package com.fhz.mvi

import com.fhz.mvi.base.BaseAction

/**
 * 时间:2024/1/9
 * @author Mr.Feng
 * 简述: TODO
 */
sealed class LoginAction : BaseAction{
    data class LoginSuccess(val user: User) : LoginAction()
    data class LoginFailure(val throwable: Throwable) : LoginAction()
    object LoginStart : LoginAction()
    object LoginCancel : LoginAction()
}
