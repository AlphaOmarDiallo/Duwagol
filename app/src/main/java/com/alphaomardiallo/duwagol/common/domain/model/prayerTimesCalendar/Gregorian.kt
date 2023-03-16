package com.alphaomardiallo.duwagol.common.domain.model.prayerTimesCalendar

import kotlinx.serialization.Serializable

@Serializable
data class Gregorian(
    val date: String,
    val day: String,
    val designation: Designation,
    val format: String,
    val month: Month,
    val weekday: Weekday,
    val year: String,
)