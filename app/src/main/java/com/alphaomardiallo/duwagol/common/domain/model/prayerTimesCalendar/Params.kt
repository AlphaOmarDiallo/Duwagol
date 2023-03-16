package com.alphaomardiallo.duwagol.common.domain.model.prayerTimesCalendar

import kotlinx.serialization.Serializable

@Serializable
data class Params(
    val Fajr: Int,
    val Isha: Int,
)