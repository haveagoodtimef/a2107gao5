package com.fhz.mvi.di

import com.fhz.mvi.service.FengApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

/**
 * 时间:2024/1/8
 * @author Mr.Feng
 * 简述: TODO
 *
 *
 *
 * rxjava -> 观察者类型.
 * livedata ->
 * flow ->
 *
 *
 *
 */
@Module
@InstallIn(SingletonComponent::class)
class HttpModule {

    @Provides
    @Singleton
    fun provideUserRemoteDataSourcer(retrofit: Retrofit): FengApi {
        return retrofit.create(FengApi::class.java)
    }


    @Provides
    @Singleton
    fun provideFengRemoteDataSource(): Retrofit {
        return Retrofit.Builder()
            .baseUrl("http://10.161.9.80:9999/")
            .client(OkHttpClient().newBuilder().addInterceptor(
                HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY)
            ).build())
            .addConverterFactory(GsonConverterFactory.create()) //把字符串转化成类的工厂
            .build()
    }

}