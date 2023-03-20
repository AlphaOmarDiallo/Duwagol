package com.alphaomardiallo.duwagol.common.domain.model.prayerTimesMethods

import kotlinx.serialization.Serializable

@Serializable
data class ParamsDS(
    val Fajr: Double,
    val Isha: String,
)