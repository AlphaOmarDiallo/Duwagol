package com.alphaomardiallo.duwagol.common.domain.model.prayerTimesCalendar

import kotlinx.serialization.Serializable

@Serializable
data class Data(
    val date: Date,
    val meta: Meta,
    val timings: Timings,
)