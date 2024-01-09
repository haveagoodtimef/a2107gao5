package com.fhz.hilt_demo.repository

import com.fhz.hilt_demo.db.AppDatabase
import com.fhz.hilt_demo.db.User
import com.fhz.hilt_demo.db.UserDao
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.withContext
import javax.inject.Inject

/**
 * 时间:2024/1/8
 * @author Mr.Feng
 * 简述: TODO
 */
class UserLocalDataSource @Inject constructor(private val userDao: UserDao) {

    suspend fun getUser(): List<User> {
        val list = ArrayList<User>()
        coroutineScope {
            // 数据库查询
            withContext(Dispatchers.IO){
                 list.addAll(userDao.getAll())
            }
        }
        return list
    }
}