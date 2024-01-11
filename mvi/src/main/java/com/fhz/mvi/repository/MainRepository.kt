package com.fhz.mvi.repository

import com.fhz.mvi.bean.response.ResponseBean
import com.fhz.mvi.datasource.MainLocalDataSource
import com.fhz.mvi.datasource.MainRemoteDataSource
import javax.inject.Inject

/**
 * 时间:2024/1/11
 * @author Mr.Feng
 * 简述: TODO
 */
class MainRepository @Inject constructor(
   private val mainLocalDataSource: MainLocalDataSource,
   private  val mainRemoteDataSource: MainRemoteDataSource
) {
    suspend fun fetchBanner(type: Int, page: Int, pageSize: Int) : ResponseBean {
        return mainRemoteDataSource.fetchBanner(type, page, pageSize)
    }


}