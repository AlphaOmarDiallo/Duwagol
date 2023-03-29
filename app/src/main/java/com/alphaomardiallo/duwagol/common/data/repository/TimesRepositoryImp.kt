package com.alphaomardiallo.duwagol.common.data.repository

import com.alphaomardiallo.duwagol.common.data.model.prayerTimesCalendar.PrayerResponse
import com.alphaomardiallo.duwagol.common.data.remote.prayerTimeCalendar.PrayerTimesCalendarWS
import com.alphaomardiallo.duwagol.common.domain.repository.TimesRepository
import javax.inject.Inject
import retrofit2.Response

class TimesRepositoryImp @Inject constructor(
    private val prayerTimesCalendarWS: PrayerTimesCalendarWS,
) : TimesRepository {
    override suspend fun fetchTimes(
        lat: Double,
        lng: Double,
        month: Int,
        year: Int,
        method: Int?,
        shafaq: String,
        school: String,
        midnightMode: Int,
    ): Response<PrayerResponse> {
        return prayerTimesCalendarWS.getPrayerTimesCalendar(
            lat = lat,
            lng = lng,
            month = month,
            year = year,
            method = method,
            shafaq = shafaq,
            school = school,
            midnightMode = midnightMode
        )
    }


}