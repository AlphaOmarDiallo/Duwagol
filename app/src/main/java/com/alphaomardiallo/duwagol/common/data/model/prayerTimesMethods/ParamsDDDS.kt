package com.alphaomardiallo.duwagol.common.data.model.prayerTimesMethods

import kotlinx.serialization.Serializable

@Serializable
data class ParamsDDDS(
    val Fajr: Double,
    val Isha: Double,
    val Maghrib: Double,
    val Midnight: String,
)