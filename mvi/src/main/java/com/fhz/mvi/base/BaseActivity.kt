package com.fhz.mvi.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewbinding.ViewBinding

/**
 * 时间:2024/1/9
 * @author Mr.Feng
 * 简述: TODO
 */
class BaseActivity<binding:ViewBinding> : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }
}