package com.alphaomardiallo.duwagol.common.domain.usecase.methodsUseCase

import com.alphaomardiallo.duwagol.common.data.repository.methods.MethodsRepository
import javax.inject.Inject

class FetchMethodsUseCase @Inject constructor(private val methodsRepository: MethodsRepository) {

    suspend operator fun invoke() = methodsRepository.fetchMethods()
}