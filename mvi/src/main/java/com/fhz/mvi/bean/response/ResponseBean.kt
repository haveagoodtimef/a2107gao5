package com.fhz.mvi.bean.response

/**
 * 时间:2024/1/11
 * @author Mr.Feng
 * 简述: 原始相应的值
 */
data class ResponseBean(
    val code: Int,
    val `data`: Data,
    val msg: String
)

data class Data(
    val endRow: Int,
    val hasNextPage: Boolean,
    val hasPreviousPage: Boolean,
    val isFirstPage: Boolean,
    val isLastPage: Boolean,
    val list: List<BannerUiState>,
    val navigateFirstPage: Int,
    val navigateLastPage: Int,
    val navigatePages: Int,
    val navigatepageNums: List<Int>,
    val nextPage: Int,
    val pageNum: Int,
    val pageSize: Int,
    val pages: Int,
    val prePage: Int,
    val size: Int,
    val startRow: Int,
    val total: Int
)

data class BannerUiState(
    val id: Int,
    val imagepath: String,
    val imgorder: Int,
    val title: String,
    val type: Int,
    val url: Any
)