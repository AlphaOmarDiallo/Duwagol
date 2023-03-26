package com.alphaomardiallo.duwagol.common.domain.usecase.prayer

import com.alphaomardiallo.duwagol.common.domain.model.Prayer
import com.alphaomardiallo.duwagol.common.domain.repository.PrayerRepository
import javax.inject.Inject

class InsertPrayerUseCase @Inject constructor(private val prayerRepository: PrayerRepository) {

    suspend operator fun invoke(prayer: Prayer) = prayerRepository.insertPrayer(prayer)

}