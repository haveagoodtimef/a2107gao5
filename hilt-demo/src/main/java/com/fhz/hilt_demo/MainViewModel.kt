package com.fhz.hilt_demo

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.fhz.hilt_demo.db.User
import com.fhz.hilt_demo.repository.UserLocalDataSource
import com.fhz.hilt_demo.repository.UserRemoteDataSource
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

/**
 * 时间:2024/1/8
 * @author Mr.Feng
 * 简述: TODO
 */
@HiltViewModel
class MainViewModel @Inject constructor(
    val userlocalDataSource: UserLocalDataSource,
    val userRemoteDataSource: UserRemoteDataSource,
):ViewModel() {

    fun test(){
        //创建协程作用域
        viewModelScope.launch {
            userlocalDataSource.run { userRemoteDataSource.getUserInfo() }
        }
        println("test")
    }

    suspend fun getUserFromDB() : List<User>{
        viewModelScope.launch {

        }
         return userlocalDataSource.getUser()
    }
}