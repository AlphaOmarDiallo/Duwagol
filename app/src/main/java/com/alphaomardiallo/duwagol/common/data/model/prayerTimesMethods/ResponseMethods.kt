package com.alphaomardiallo.duwagol.common.data.model.prayerTimesMethods

import kotlinx.serialization.Serializable

@Serializable
data class ResponseMethods(
    val code: Int,
    val `data`: com.alphaomardiallo.duwagol.common.data.model.prayerTimesMethods.Data,
    val status: String,
)