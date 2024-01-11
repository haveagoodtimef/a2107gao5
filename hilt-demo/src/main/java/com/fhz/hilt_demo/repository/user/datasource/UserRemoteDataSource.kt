package com.fhz.hilt_demo.repository.user.datasource

import com.fhz.hilt_demo.bean.response.Banner
import com.fhz.hilt_demo.service.FengApi
import com.fhz.hilt_demo.service.UserApi
import javax.inject.Inject

/**
 * 时间:2024/1/8
 * @author Mr.Feng
 * 简述: 远程
 */
class UserRemoteDataSource @Inject constructor(val userApi: UserApi){

    suspend fun getUserInfo() : Banner{
        val userInfo = userApi.getUserInfo(0,1,5) //user
        println(userInfo.msg)
        println("get user info from remote")
        return userInfo
    }
}