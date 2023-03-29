package com.alphaomardiallo.duwagol.common.data.model.prayerTimesCalendar

import kotlinx.serialization.Serializable

@Serializable
data class Date(
    val gregorian: Gregorian,
    val hijri: Hijri,
)