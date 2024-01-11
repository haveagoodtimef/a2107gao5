package com.fhz.mvi.uistate

import com.fhz.mvi.bean.response.BannerUiState
import retrofit2.http.Url

/**
 * 时间:2024/1/11
 * @author Mr.Feng
 * 简述: TODO
 */
data class MainUiState (
    val isLoading: Boolean = true,
    val banners: List<BannerUiState> = emptyList(),
)
