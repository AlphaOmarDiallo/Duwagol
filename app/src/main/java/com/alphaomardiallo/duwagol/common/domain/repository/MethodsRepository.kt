package com.alphaomardiallo.duwagol.common.domain.repository

import com.alphaomardiallo.duwagol.common.data.model.prayerTimesMethods.ResponseMethods
import retrofit2.Response

interface MethodsRepository {

    suspend fun fetchMethods(): Response<ResponseMethods>
}