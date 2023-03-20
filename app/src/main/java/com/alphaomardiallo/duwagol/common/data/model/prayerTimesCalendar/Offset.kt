package com.alphaomardiallo.duwagol.common.data.model.prayerTimesCalendar

import kotlinx.serialization.Serializable

@Serializable
data class Offset(
    val Asr: Int,
    val Dhuhr: Int,
    val Fajr: Int,
    val Imsak: Int,
    val Isha: Int,
    val Maghrib: Int,
    val Midnight: Int,
    val Sunrise: Int,
    val Sunset: Int,
)