package com.fhz.hilt_demo

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

/**
 * 时间:2024/1/8
 * @author Mr.Feng
 * 简述: TODO
 */
@HiltAndroidApp
class MyApp : Application() {
    override fun onCreate() {
        super.onCreate()
    }
}