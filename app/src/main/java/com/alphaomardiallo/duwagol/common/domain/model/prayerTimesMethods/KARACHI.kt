package com.alphaomardiallo.duwagol.common.domain.model.prayerTimesMethods

import kotlinx.serialization.Serializable

@Serializable
data class KARACHI(
    val id: Int,
    val location: Location,
    val name: String,
    val params: Params,
)