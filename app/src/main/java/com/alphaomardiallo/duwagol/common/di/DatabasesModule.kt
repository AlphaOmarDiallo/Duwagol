package com.alphaomardiallo.duwagol.common.di

import android.content.Context
import androidx.room.Room
import com.alphaomardiallo.duwagol.common.data.local.database.PrayerDB
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class DatabasesModule {

    @Singleton
    @Provides
    fun providePrayerDatabase(@ApplicationContext app: Context) =
        Room.databaseBuilder(
            context = app,
            klass = PrayerDB::class.java,
            name = PRAYER_DB_NAME
        ).build()

    @Singleton
    @Provides
    fun providePrayerDao(database: PrayerDB) = database.prayerDao()

    companion object {
        const val PRAYER_DB_NAME = "prayer database"
    }
}