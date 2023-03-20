package com.alphaomardiallo.duwagol.common.data.model.prayerTimesMethods

import kotlinx.serialization.Serializable

@Serializable
data class MOONSIGHTING(
    val id: Int,
    val name: String,
    val params: com.alphaomardiallo.duwagol.common.data.model.prayerTimesMethods.ParamsS,
)