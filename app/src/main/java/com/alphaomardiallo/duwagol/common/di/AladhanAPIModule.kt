package com.alphaomardiallo.duwagol.common.di

import com.alphaomardiallo.duwagol.common.data.remote.prayerTimeCalendar.PrayerTimesCalendarWS
import com.alphaomardiallo.duwagol.common.data.remote.prayerTimesMethods.PrayerTimesMethodsWS
import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import kotlinx.serialization.json.Json
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import java.util.concurrent.TimeUnit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AladhanAPIModule {

    private val interceptor: HttpLoggingInterceptor = HttpLoggingInterceptor().apply {
        this.level = HttpLoggingInterceptor.Level.BODY
    }

    private val client: OkHttpClient = OkHttpClient.Builder().apply {
        this.addInterceptor(interceptor)
        this.callTimeout(DEFAULT_TIMEOUT, TimeUnit.SECONDS)
        this.connectTimeout(DEFAULT_TIMEOUT, TimeUnit.SECONDS)
        this.readTimeout(DEFAULT_TIMEOUT, TimeUnit.SECONDS)
        this.writeTimeout(DEFAULT_TIMEOUT, TimeUnit.SECONDS)
    }.build()

    private val contentType = "application/json".toMediaType()
    private val converterFactory = Json.asConverterFactory(contentType)

    @Singleton
    @Provides
    fun providePrayerMethods(): PrayerTimesMethodsWS {
        return Retrofit.Builder()
            .baseUrl(BASE_PLACES_URL)
            .client(client)
            .addConverterFactory(converterFactory)
            .build()
            .create(PrayerTimesMethodsWS::class.java)
    }

    @Singleton
    @Provides
    fun providePrayerCalendar(): PrayerTimesCalendarWS {
        return Retrofit.Builder()
            .baseUrl(BASE_PLACES_URL)
            .client(client)
            .addConverterFactory(converterFactory)
            .build()
            .create(PrayerTimesCalendarWS::class.java)
    }

    companion object {
        const val BASE_PLACES_URL = "http://api.aladhan.com/"
        const val DEFAULT_TIMEOUT = 10L
    }
}