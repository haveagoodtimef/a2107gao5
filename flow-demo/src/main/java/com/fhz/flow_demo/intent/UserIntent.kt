package com.fhz.flow_demo.intent

import com.fhz.flow_demo.base.BaseIntent

/**
 * 时间:2024/1/11
 * @author Mr.Feng
 * 简述: TODO
 */
sealed class UserIntent : BaseIntent{
    data class GetUserInfoIntent(val userId: String):UserIntent()
    data class UpdateUserName(val userId: String):UserIntent()
    data class UpdateUserAge(val userId: String):UserIntent()


}
