package com.alphaomardiallo.duwagol.common.domain.usecase.methods

import com.alphaomardiallo.duwagol.common.domain.repository.MethodsRepository
import javax.inject.Inject

class FetchMethodsUseCase @Inject constructor(private val methodsRepository: MethodsRepository) {

    suspend operator fun invoke() = methodsRepository.fetchMethods()
}