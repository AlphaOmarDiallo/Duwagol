package com.alphaomardiallo.duwagol.common.data.model.prayerTimesCalendar

import kotlinx.serialization.Serializable

@Serializable
data class Method(
    val id: Int,
    val location: com.alphaomardiallo.duwagol.common.data.model.prayerTimesCalendar.Location,
    val name: String,
    val params: com.alphaomardiallo.duwagol.common.data.model.prayerTimesCalendar.Params,
)