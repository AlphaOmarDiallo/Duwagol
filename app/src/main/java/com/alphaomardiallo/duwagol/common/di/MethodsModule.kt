package com.alphaomardiallo.duwagol.common.di

import com.alphaomardiallo.duwagol.common.data.remote.prayerTimesMethods.PrayerTimesMethodsWS
import com.alphaomardiallo.duwagol.common.domain.repository.MethodsRepository
import com.alphaomardiallo.duwagol.common.data.repository.MethodsRepositoryImp
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class MethodsModule {

    @Singleton
    @Provides
    fun providesMethods(prayerTimesMethodsWS: PrayerTimesMethodsWS): MethodsRepository =
        MethodsRepositoryImp(prayerTimesMethodsWS)

}