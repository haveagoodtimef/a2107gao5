package com.fhz.hilt_demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.activity.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import com.fhz.hilt_demo.viewmodel.MainViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import javax.inject.Inject



@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var student: Student

    private val viewModel: MainViewModel by viewModels()


    private lateinit var btn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println(student.name)

        btn = findViewById(R.id.send)
        btn.setOnClickListener {
            viewModel.getBanners()
        }

        lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.STARTED){
                viewModel.bannerUiState.collect{
                    if(!it.isLoading){
                        //记载完成.取到加载动画
                        btn.text = it.banners?.msg
                    }
                    println("数据: ${it.banners?.msg}")
                }
            }
        }



    }
}