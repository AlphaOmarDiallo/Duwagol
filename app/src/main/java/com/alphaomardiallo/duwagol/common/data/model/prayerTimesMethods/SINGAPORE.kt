package com.alphaomardiallo.duwagol.common.data.model.prayerTimesMethods

import kotlinx.serialization.Serializable

@Serializable
data class SINGAPORE(
    val id: Int,
    val location: com.alphaomardiallo.duwagol.common.data.model.prayerTimesMethods.Location,
    val name: String,
    val params: com.alphaomardiallo.duwagol.common.data.model.prayerTimesMethods.Params,
)