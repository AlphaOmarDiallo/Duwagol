package com.alphaomardiallo.duwagol.common.domain.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "prayer_table")
data class Prayer(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    @ColumnInfo(name = "gregorian_date") val gregorianDate: String,
    @ColumnInfo(name = "hijri_date") val hijriDate: String,
    @ColumnInfo(name = "holidays") val holidays: List<String>,
    @ColumnInfo(name = "method_id") val methodId: Int,
    @ColumnInfo(name = "method_name") val methodName: String,
    @ColumnInfo(name = "prayer_fajr") val Fajr: String,
    @ColumnInfo(name = "prayer_dhuhr") val Dhuhr: String,
    @ColumnInfo(name = "prayer_asr") val Asr: String,
    @ColumnInfo(name = "prayer_maghrib") val Maghrib: String,
    @ColumnInfo(name = "prayer_isha") val Isha: String,
    @ColumnInfo(name = "sunrise") val Sunrise: String,
)
