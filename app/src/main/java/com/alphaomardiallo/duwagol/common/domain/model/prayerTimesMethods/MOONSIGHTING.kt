package com.alphaomardiallo.duwagol.common.domain.model.prayerTimesMethods

import kotlinx.serialization.Serializable

@Serializable
data class MOONSIGHTING(
    val id: Int,
    val name: String,
    val params: ParamsS,
)