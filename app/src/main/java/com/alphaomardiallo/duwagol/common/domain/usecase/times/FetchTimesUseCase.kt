package com.alphaomardiallo.duwagol.common.domain.usecase.times

import com.alphaomardiallo.duwagol.common.domain.repository.TimesRepository
import java.text.SimpleDateFormat
import java.util.*
import javax.inject.Inject

class FetchTimesUseCase @Inject constructor(private val timesRepository: TimesRepository) {

    suspend operator fun invoke(
        lat: Double = LATITUDE_KAABA,
        lng: Double = LONGITUDE_KAABA,
        month: Int = SimpleDateFormat("MM", Locale.getDefault()).format(Date()).toInt(),
        year: Int = SimpleDateFormat("yyyy", Locale.getDefault()).format(Date()).toInt(),
        method: Int? = 3,
        shafaq: String = SHAFAQ_GENERAL,
        school: String = SCHOOL,
        midnightMode: Int = MIDNIGHT_MODE,
    ) =
        timesRepository.fetchTimes(
            lat = lat,
            lng = lng,
            month = month,
            year = year,
            method = method,
            shafaq = shafaq,
            school = school,
            midnightMode = midnightMode
        )

    companion object {
        const val LATITUDE_KAABA = 21.422487
        const val LONGITUDE_KAABA = 39.826206
        const val SHAFAQ_GENERAL = "general"
        const val SCHOOL = "shafi"
        const val MIDNIGHT_MODE = 0
    }
}