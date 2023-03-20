package com.alphaomardiallo.duwagol.common.data.remote.prayerTimesMethods

import com.alphaomardiallo.duwagol.common.domain.model.prayerTimesMethods.ResponseMethods
import retrofit2.Response
import retrofit2.http.GET

/**
 * Web service to fetch prayer time for a location
 *
 * [Link to the API](https://aladhan.com/prayer-times-api#GetMethods)
 */
interface PrayerTimesMethodsWS {
    @GET(URL)
    suspend fun getPrayerTimesCalculationMethods(): Response<ResponseMethods>

    companion object {
        const val URL = "v1/methods"
    }
}