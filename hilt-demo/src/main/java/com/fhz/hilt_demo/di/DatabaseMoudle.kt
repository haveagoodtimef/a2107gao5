package com.fhz.hilt_demo.di

import android.content.Context
import androidx.room.Room
import com.fhz.hilt_demo.db.AppDatabase
import com.fhz.hilt_demo.db.UserDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

/**
 * 时间:2024/1/9
 * @author Mr.Feng
 * 简述: TODO
 */
@Module
@InstallIn(SingletonComponent::class)
class DatabaseMoudle {

    @Provides
    @Singleton
    fun provideDatabase1(@ApplicationContext appContext: Context): AppDatabase {
        return Room.databaseBuilder(
            appContext,
            AppDatabase::class.java,
            "a2107")
//            .allowMainThreadQueries()
            .build()
    }

    @Provides
    @Singleton
    fun provideUserDao1(appDatabase: AppDatabase): UserDao {
        return appDatabase.userDao()
    }

}