package com.fhz.mvi.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.fhz.mvi.repository.MainRepository
import com.fhz.mvi.uistate.MainUiState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Job
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import java.io.IOException
import javax.inject.Inject

/**
 * 时间:2024/1/11
 * @author Mr.Feng
 * 简述: TODO
 */

@HiltViewModel
class MainViewModel @Inject constructor(private val mainRepository: MainRepository) : ViewModel() {

    private val _mainUiState = MutableStateFlow(MainUiState())
    val mainUiState = _mainUiState.asStateFlow()

    fun fetchBanner(type:Int,page:Int,pageSize:Int) {

         viewModelScope.launch {
            try {
                val banners = mainRepository.fetchBanner(type, page, pageSize)
                _mainUiState.update {
                    it.copy(banners = banners.data.list, isLoading = false)
                }
//
            } catch (ioe: IOException) {
                // Handle the error and notify the UI when appropriate.
//                _uiState.update {
//                    val messages = getMessagesFromThrowable(ioe)
//                    it.copy(userMessages = messages)
//                }
            }
        }
    }

}