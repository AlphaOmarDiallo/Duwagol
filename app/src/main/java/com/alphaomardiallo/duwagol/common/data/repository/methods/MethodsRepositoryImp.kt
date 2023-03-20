package com.alphaomardiallo.duwagol.common.data.repository.methods

import com.alphaomardiallo.duwagol.common.data.remote.prayerTimesMethods.PrayerTimesMethodsWS
import com.alphaomardiallo.duwagol.common.data.model.prayerTimesMethods.ResponseMethods
import retrofit2.Response
import javax.inject.Inject

class MethodsRepositoryImp @Inject constructor(private val prayerTimesMethodsWS: PrayerTimesMethodsWS) :
    MethodsRepository {

    override suspend fun fetchMethods(): Response<com.alphaomardiallo.duwagol.common.data.model.prayerTimesMethods.ResponseMethods> {
        return prayerTimesMethodsWS.getPrayerTimesCalculationMethods()
    }

}