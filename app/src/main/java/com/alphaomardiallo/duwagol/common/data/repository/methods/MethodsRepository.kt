package com.alphaomardiallo.duwagol.common.data.repository.methods

import com.alphaomardiallo.duwagol.common.domain.model.prayerTimesMethods.ResponseMethods
import retrofit2.Response

interface MethodsRepository {

    suspend fun fetchMethods(): Response<ResponseMethods>
}