package com.alphaomardiallo.duwagol.common.data.remote.prayerTimesMethods

import com.alphaomardiallo.duwagol.common.domain.model.prayerTimesMethods.responseMethods
import retrofit2.Call
import retrofit2.http.GET

interface PrayerTimesMethodsWS {
    @GET("v1/methods")
    fun getPrayerTimesCalculationMethods(): Call<responseMethods>
}