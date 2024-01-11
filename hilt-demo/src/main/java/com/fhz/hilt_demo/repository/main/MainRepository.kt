package com.fhz.hilt_demo.repository.main

import com.fhz.hilt_demo.bean.response.Banner
import com.fhz.hilt_demo.service.UserApi
import javax.inject.Inject

/**
 * 时间:2024/1/11
 * @author Mr.Feng
 * 简述: TODO
 */
class MainRepository @Inject constructor(val userApi: UserApi) {

    suspend fun getBanners() : Banner{
      return  userApi.getUserInfo(0,1,5)
    }
}