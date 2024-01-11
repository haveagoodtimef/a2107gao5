package com.fhz.flow_demo.repository

import com.fhz.flow_demo.bean.User

/**
 * 时间:2024/1/11
 * @author Mr.Feng
 * 简述: TODO
 */
class UserRepository {
    fun getUser(): User {
        return User(1,"小明","啊")
    }
}