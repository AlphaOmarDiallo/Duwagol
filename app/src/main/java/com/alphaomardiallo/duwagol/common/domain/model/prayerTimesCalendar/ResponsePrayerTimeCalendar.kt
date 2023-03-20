package com.alphaomardiallo.duwagol.common.domain.model.prayerTimesCalendar

import kotlinx.serialization.Serializable

@Serializable
data class ResponsePrayerTimeCalendar(
    val code: Int,
    val `data`: List<Data>,
    val status: String,
)