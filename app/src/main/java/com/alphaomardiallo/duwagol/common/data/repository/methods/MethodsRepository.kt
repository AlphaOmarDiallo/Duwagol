package com.alphaomardiallo.duwagol.common.data.repository.methods

import com.alphaomardiallo.duwagol.common.data.model.prayerTimesMethods.ResponseMethods
import retrofit2.Response

interface MethodsRepository {

    suspend fun fetchMethods(): Response<com.alphaomardiallo.duwagol.common.data.model.prayerTimesMethods.ResponseMethods>
}