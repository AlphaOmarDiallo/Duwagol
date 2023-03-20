package com.alphaomardiallo.duwagol.common.data.model.prayerTimesCalendar

import kotlinx.serialization.Serializable

@Serializable
data class MonthX(
    val ar: String,
    val en: String,
    val number: Int,
)