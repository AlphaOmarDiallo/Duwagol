package com.alphaomardiallo.duwagol.common.domain.model.prayerTimesMethods

import kotlinx.serialization.Serializable

@Serializable
data class ParamsDDDS(
    val Fajr: Double,
    val Isha: String,
    val Maghrib: Double,
    val Midnight: String,
)