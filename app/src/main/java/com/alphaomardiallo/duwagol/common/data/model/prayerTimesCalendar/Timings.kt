package com.alphaomardiallo.duwagol.common.data.model.prayerTimesCalendar

import kotlinx.serialization.Serializable

@Serializable
data class Timings(
    val Asr: String,
    val Dhuhr: String,
    val Fajr: String,
    val Isha: String,
    val Maghrib: String,
    val Sunrise: String,
)