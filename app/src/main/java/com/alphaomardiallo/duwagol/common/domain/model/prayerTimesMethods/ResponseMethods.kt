package com.alphaomardiallo.duwagol.common.domain.model.prayerTimesMethods

import kotlinx.serialization.Serializable

@Serializable
data class ResponseMethods(
    val code: Int,
    val `data`: Data,
    val status: String,
)