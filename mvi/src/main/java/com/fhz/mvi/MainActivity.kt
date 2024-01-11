package com.fhz.mvi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import com.fhz.mvi.databinding.ActivityMainBinding
import com.fhz.mvi.viewmodel.MainViewModel
import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    // 创建一个ViewModel实例
    private val viewModel: MainViewModel by viewModels()
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //用户的事件
        binding.getBanner.setOnClickListener {
            viewModel.fetchBanner(0,1,5)
        }

        //处理uistate
        lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.STARTED) {
                viewModel.mainUiState.collect {
                    //更加界面
                    if (!it.isLoading) {
                        binding.bannerName.text = it.banners[0].title
                    } else {
//                        binding.progressBar.visibility = android.view.View.VISIBLE
                    }

                }
            }
        }

    }
}