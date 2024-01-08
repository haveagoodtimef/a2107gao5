package com.fhz.hilt_demo.service

import retrofit2.http.GET

/**
 * 时间:2024/1/8
 * @author Mr.Feng
 * 简述: TODO
 */
interface FengApi {
    @GET("banner")
    suspend fun getBanner()
}