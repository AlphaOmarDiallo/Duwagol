package com.alphaomardiallo.duwagol.common.data.model.prayerTimesCalendar

import com.alphaomardiallo.duwagol.common.domain.model.Prayer
import kotlinx.serialization.Serializable

@Serializable
data class Data(
    val date: Date,
    val meta: Meta,
    val timings: Timings,
)

fun Data.toPrayer() = Prayer(id = 0,
    gregorianDate = date.gregorian.date,
    gregorianDateFormat = date.gregorian.format,
    gregorianDay = date.gregorian.day,
    gregorianMonth = date.gregorian.month.en,
    gregorianYear = date.gregorian.year,
    hijriDate = date.hijri.date,
    hijriDateFormat = date.hijri.format,
    hijriDay = date.hijri.day,
    hijriMonth = date.hijri.month.en,
    hijriYear = date.hijri.year,
    prayerList = listOf(
        timings.Fajr,
        timings.Dhuhr,
        timings.Asr,
        timings.Maghrib,
        timings.Isha,
        timings.Sunrise
    ),
    method = meta.method.id

)