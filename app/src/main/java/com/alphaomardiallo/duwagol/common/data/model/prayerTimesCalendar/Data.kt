package com.alphaomardiallo.duwagol.common.data.model.prayerTimesCalendar

import kotlinx.serialization.Serializable

@Serializable
data class Data(
    val date: Date,
    val meta: Meta,
    val timings: Timings,
)