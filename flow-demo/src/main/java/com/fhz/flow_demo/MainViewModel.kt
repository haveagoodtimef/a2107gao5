package com.fhz.flow_demo

import androidx.lifecycle.viewModelScope
import com.fhz.flow_demo.base.BaseIntent
import com.fhz.flow_demo.base.BaseViewModel
import com.fhz.flow_demo.bean.User
import com.fhz.flow_demo.intent.UserIntent
import com.fhz.flow_demo.uistate.UserUiState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.launch

/**
 * 时间:2024/1/11
 * @author Mr.Feng
 * 简述: TODO
 */
class MainViewModel : BaseViewModel() {

    private val _userUiState = MutableStateFlow<UserUiState>(UserUiState.Loading)
    val userUiState : StateFlow<UserUiState> = _userUiState

    fun updateUserUiState(){
        viewModelScope.launch {
            _userUiState.value = UserUiState.Success(User(1,"小明","啊"))
        }
    }

    override fun handle(baseIntent: BaseIntent) {
        when(baseIntent){
            is UserIntent.GetUserInfoIntent -> updateUserUiState()
        }
    }
}