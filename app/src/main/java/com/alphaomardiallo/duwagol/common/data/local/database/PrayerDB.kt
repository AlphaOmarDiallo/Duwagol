package com.alphaomardiallo.duwagol.common.data.local.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.alphaomardiallo.duwagol.common.data.local.converters.ConverterListString
import com.alphaomardiallo.duwagol.common.data.local.dao.PrayerDao
import com.alphaomardiallo.duwagol.common.domain.model.Prayer

@Database(entities = [Prayer::class], version = 1, exportSchema = true)
@TypeConverters(ConverterListString::class)
abstract class PrayerDB : RoomDatabase(){

    abstract fun prayerDao(): PrayerDao

}