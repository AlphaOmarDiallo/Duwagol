package com.alphaomardiallo.duwagol.common.domain.model.prayerTimesMethods

import kotlinx.serialization.Serializable

@Serializable
data class Location(
    val latitude: Double,
    val longitude: Double,
)