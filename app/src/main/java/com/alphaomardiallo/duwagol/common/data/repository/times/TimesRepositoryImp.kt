package com.alphaomardiallo.duwagol.common.data.repository.times

import com.alphaomardiallo.duwagol.common.data.remote.prayerTimeCalendar.PrayerTimesCalendarWS
import com.alphaomardiallo.duwagol.common.data.model.prayerTimesCalendar.ResponsePrayerTimeCalendar
import retrofit2.Response
import javax.inject.Inject

class TimesRepositoryImp @Inject constructor(
    private val prayerTimesCalendarWS: PrayerTimesCalendarWS
) : TimesRepository{
    override suspend fun fetchTimes(
        lat: Double,
        lng: Double,
        month: Int,
        year: Int,
        method: Int?,
        shafaq: String,
        school: String,
        midnightMode: Int,
    ): Response<com.alphaomardiallo.duwagol.common.data.model.prayerTimesCalendar.ResponsePrayerTimeCalendar> {
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