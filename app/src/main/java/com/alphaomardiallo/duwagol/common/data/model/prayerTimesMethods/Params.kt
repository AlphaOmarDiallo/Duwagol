package com.alphaomardiallo.duwagol.common.data.model.prayerTimesMethods

import kotlinx.serialization.Serializable

@Serializable
data class Params(
    val Fajr: Double,
    val Isha: Double,
)