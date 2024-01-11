package com.fhz.mvi.datasource

import com.fhz.mvi.bean.response.ResponseBean
import com.fhz.mvi.service.FengApi
import javax.inject.Inject

/**
 * 时间:2024/1/11
 * @author Mr.Feng
 * 简述: TODO
 */
class MainRemoteDataSource @Inject constructor(private val fengApi: FengApi) {

    suspend fun fetchBanner(type: Int, page: Int, pageSize: Int) : ResponseBean{
       return fengApi.getBanners(type, page, pageSize)
    }
}