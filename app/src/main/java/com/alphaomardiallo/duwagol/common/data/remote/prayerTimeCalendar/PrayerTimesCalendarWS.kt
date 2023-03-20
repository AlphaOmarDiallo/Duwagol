package com.alphaomardiallo.duwagol.common.data.remote.prayerTimeCalendar

import com.alphaomardiallo.duwagol.common.domain.model.prayerTimesCalendar.ResponsePrayerTimeCalendar
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query
import javax.annotation.Nullable

/**
 * Web service to fetch prayer time for a location
 *
 * [Link to the API](https://aladhan.com/prayer-times-api#GetCalendar)
 */
interface PrayerTimesCalendarWS {
    @GET(URL)
    suspend fun getPrayerTimesCalendar(
        @Query(LATITUDE) lat: Double,
        @Query(LONGITUDE) lng: Double,
        @Query(MONTH) month: Int,
        @Query(YEAR) year: Int,
        @Nullable @Query(METHOD) method: Int?,
        @Query(SHAFAQ) shafaq: String,
        @Query(SCHOOL) school: String,
        @Query(MIDNHIGHT_MODE) midnightMode: Int,
    ): Response<ResponsePrayerTimeCalendar>

    companion object {
        const val URL = "v1/calendar"
        const val LATITUDE = "latitude"
        const val LONGITUDE = "longitude"
        const val MONTH = "month"
        const val YEAR = "year"
        const val METHOD = "method"
        const val SHAFAQ = "shafaq"
        const val SCHOOL = "school"
        const val MIDNHIGHT_MODE = "midnightMode"
    }
}