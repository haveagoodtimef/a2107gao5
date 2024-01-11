package com.fhz.hilt_demo.intent

/**
 * 时间:2024/1/11
 * @author Mr.Feng
 * 简述: TODO
 */
sealed class MainIntent {
    data class GetBannerIntent(val type: Int,val page: Int,val pageSize: Int):MainIntent()
}