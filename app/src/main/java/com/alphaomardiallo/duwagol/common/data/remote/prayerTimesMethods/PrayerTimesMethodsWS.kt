package com.alphaomardiallo.duwagol.common.data.remote.prayerTimesMethods

import com.alphaomardiallo.duwagol.common.domain.model.prayerTimesMethods.ResponseMethods
import retrofit2.Response
import retrofit2.http.GET

interface PrayerTimesMethodsWS {
    @GET("v1/methods")
    suspend fun getPrayerTimesCalculationMethods(): Response<ResponseMethods>
}