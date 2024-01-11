package com.fhz.mvi.service

import com.fhz.mvi.bean.response.ResponseBean
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * 时间:2024/1/11
 * @author Mr.Feng
 * 简述: TODO
 */
interface FengApi {
    @GET("/banner/select")
    suspend fun getBanners(@Query("type") type: Int, @Query("page") page: Int, @Query("pageSize") pageSize: Int):ResponseBean
}