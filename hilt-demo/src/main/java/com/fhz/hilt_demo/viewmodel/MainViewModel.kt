package com.fhz.hilt_demo.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.fhz.hilt_demo.repository.main.MainRepository
import com.fhz.hilt_demo.repository.user.datasource.UserLocalDataSource
import com.fhz.hilt_demo.repository.user.datasource.UserRemoteDataSource
import com.fhz.hilt_demo.uistate.AA
import com.fhz.hilt_demo.uistate.BannerUiState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

/**
 * 时间:2024/1/8
 * @author Mr.Feng
 * 简述: TODO
 */
@HiltViewModel
class MainViewModel @Inject constructor(
    private val mainRepository: MainRepository,
):ViewModel() {

    private val _bannerUiState  = MutableStateFlow(BannerUiState())
    val bannerUiState :StateFlow<BannerUiState> = _bannerUiState.asStateFlow()
    fun getBanners() {
        viewModelScope.launch {
            val banners = mainRepository.getBanners()
            _bannerUiState.update {
                it.copy(banners = banners, isLoading = false)
            }
        }
    }

}