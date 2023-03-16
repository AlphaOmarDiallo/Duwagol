package com.alphaomardiallo.duwagol.common.domain.model.prayerTimesCalendar

import kotlinx.serialization.Serializable

@Serializable
data class Method(
    val id: Int,
    val location: Location,
    val name: String,
    val params: Params,
)