package com.alphaomardiallo.duwagol.common.data.model.prayerTimesCalendar

import com.alphaomardiallo.duwagol.common.domain.model.Prayer
import kotlinx.serialization.Serializable

@Serializable
data class PrayerDto(
    val timings: Timings,
    val date: Date,
    val meta: Meta,
)

fun PrayerDto.toPrayer() = Prayer(
    gregorianDate = date.gregorian.date,
    hijriDate = date.hijri.date,
    holidays = date.hijri.holidays,
    methodId = meta.method.id,
    methodName = meta.method.name,
    Fajr = timings.Fajr,
    Dhuhr = timings.Dhuhr,
    Asr = timings.Asr,
    Maghrib = timings.Maghrib,
    Isha = timings.Isha,
    Sunrise = timings.Sunrise
)