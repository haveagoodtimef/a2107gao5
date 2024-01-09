package com.fhz.hilt_demo.db

import androidx.room.Database
import androidx.room.RoomDatabase

/**
 * 时间:2024/1/9
 * @author Mr.Feng
 * 简述: TODO
 */
@Database(entities = [User::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun userDao(): UserDao


}