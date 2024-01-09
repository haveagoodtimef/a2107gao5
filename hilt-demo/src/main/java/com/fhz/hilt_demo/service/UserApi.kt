package com.fhz.hilt_demo.service

import com.fhz.hilt_demo.bean.response.Banner
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * 时间:2024/1/8
 * @author Mr.Feng
 * 简述: TODO
 */
interface UserApi {

    @GET("/banner/select")
    suspend fun getUserInfo(@Query("type") type: Int,@Query("page") page: Int,@Query("pageSize") pageSize: Int): Banner
}