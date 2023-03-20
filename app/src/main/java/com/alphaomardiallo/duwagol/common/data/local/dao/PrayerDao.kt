package com.alphaomardiallo.duwagol.common.data.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.alphaomardiallo.duwagol.common.domain.model.Prayer

@Dao
interface PrayerDao {

    @Insert
    suspend fun insertPrayer(prayer: Prayer)

    @Update
    suspend fun updatePrayer(prayer: Prayer)

    @Query("DELETE FROM prayer_table")
    fun clearTable()
}