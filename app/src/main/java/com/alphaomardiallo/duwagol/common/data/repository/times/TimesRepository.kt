package com.alphaomardiallo.duwagol.common.data.repository.times

import com.alphaomardiallo.duwagol.common.domain.model.prayerTimesCalendar.ResponsePrayerTimeCalendar
import retrofit2.Response

interface TimesRepository {

    suspend fun fetchTimes(
        lat: Double,
        lng: Double,
        month: Int,
        year: Int,
        method: Int?,
        shafaq: String,
        school: String,
        midnightMode: Int,
    ): Response<ResponsePrayerTimeCalendar>
}