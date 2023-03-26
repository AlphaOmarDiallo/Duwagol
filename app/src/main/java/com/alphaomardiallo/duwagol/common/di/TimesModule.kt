package com.alphaomardiallo.duwagol.common.di

import com.alphaomardiallo.duwagol.common.data.remote.prayerTimeCalendar.PrayerTimesCalendarWS
import com.alphaomardiallo.duwagol.common.domain.repository.TimesRepository
import com.alphaomardiallo.duwagol.common.data.repository.TimesRepositoryImp
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class TimesModule {

    @Provides
    @Singleton
    fun providesTimesRepository(prayerTimesCalendarWS: PrayerTimesCalendarWS): TimesRepository =
        TimesRepositoryImp(prayerTimesCalendarWS)
}