package com.alphaomardiallo.duwagol.common.domain.repository

import com.alphaomardiallo.duwagol.common.domain.model.Prayer

interface PrayerRepository {

    suspend fun insertPrayer(prayer: Prayer)

    suspend fun updatePrayer(prayer: Prayer)

    fun getAllPrayers(): List<Prayer>

    fun clearTable()
}