package com.alphaomardiallo.duwagol.common.domain.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "prayer_table")
data class Prayer(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    @ColumnInfo(name = "timings_gregorian_date") val gregorianDate: String,
    @ColumnInfo(name = "timings_gregorian_date_format") val gregorianDateFormat: String,
    @ColumnInfo(name = "timings_gregorian_day") val gregorianDay: String,
    @ColumnInfo(name = "timings_gregorian_month") val gregorianMonth: String,
    @ColumnInfo(name = "timings_gregorian_year") val gregorianYear: String,
    @ColumnInfo(name = "timings_hijri_date") val hijriDate: String,
    @ColumnInfo(name = "timings_hijri_date_format") val hijriDateFormat: String,
    @ColumnInfo(name = "timings_hijri_day") val hijriDay: String,
    @ColumnInfo(name = "timings_hijri_month") val hijriMonth: String,
    @ColumnInfo(name = "timings_hijri_year") val hijriYear: String,
    @ColumnInfo(name = "timings_list_timings") val prayerList: List<String>,
    @ColumnInfo(name = "timings_method") val method: Int,
)
