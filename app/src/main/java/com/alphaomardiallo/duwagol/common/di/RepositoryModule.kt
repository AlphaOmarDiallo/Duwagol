package com.alphaomardiallo.duwagol.common.di

import com.alphaomardiallo.duwagol.common.data.local.dao.PrayerDao
import com.alphaomardiallo.duwagol.common.data.remote.prayerTimeCalendar.PrayerTimesCalendarWS
import com.alphaomardiallo.duwagol.common.data.remote.prayerTimesMethods.PrayerTimesMethodsWS
import com.alphaomardiallo.duwagol.common.data.repository.MethodsRepositoryImp
import com.alphaomardiallo.duwagol.common.data.repository.PrayerRepositoryImp
import com.alphaomardiallo.duwagol.common.data.repository.TimesRepositoryImp
import com.alphaomardiallo.duwagol.common.domain.repository.MethodsRepository
import com.alphaomardiallo.duwagol.common.domain.repository.PrayerRepository
import com.alphaomardiallo.duwagol.common.domain.repository.TimesRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class RepositoryModule {

    @Singleton
    @Provides
    fun providesMethodsRepository(prayerTimesMethodsWS: PrayerTimesMethodsWS): MethodsRepository =
        MethodsRepositoryImp(prayerTimesMethodsWS)

    @Provides
    @Singleton
    fun providesTimesRepository(prayerTimesCalendarWS: PrayerTimesCalendarWS): TimesRepository =
        TimesRepositoryImp(prayerTimesCalendarWS)

    @Provides
    @Singleton
    fun providesPrayerRepository(prayerDao: PrayerDao): PrayerRepository =
        PrayerRepositoryImp(prayerDao)

}