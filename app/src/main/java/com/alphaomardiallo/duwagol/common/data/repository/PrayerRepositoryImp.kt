package com.alphaomardiallo.duwagol.common.data.repository

import com.alphaomardiallo.duwagol.common.data.local.dao.PrayerDao
import com.alphaomardiallo.duwagol.common.domain.model.Prayer
import com.alphaomardiallo.duwagol.common.domain.repository.PrayerRepository
import javax.inject.Inject

class PrayerRepositoryImp @Inject constructor(
    private val prayerDao: PrayerDao
) : PrayerRepository {
    override suspend fun insertPrayer(prayer: Prayer) {
        prayerDao.insertPrayer(prayer)
    }

    override suspend fun updatePrayer(prayer: Prayer) {
        prayerDao.updatePrayer(prayer)
    }

    override fun getAllPrayers() = prayerDao.getAllPrayers()

    override fun clearTable() {
        prayerDao.clearTable()
    }
}