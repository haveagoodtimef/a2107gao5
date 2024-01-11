package com.fhz.hilt_demo.uistate

import com.fhz.hilt_demo.bean.response.Banner

/**
 * 时间:2024/1/11
 * @author Mr.Feng
 * 简述: TODO
 */
data class BannerUiState(
    val banners: Banner? = null,
    val isLoading: Boolean = true
)