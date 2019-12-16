package xyz.kalapuneet.c3.data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface CountryDao {
    @Query("select * from ${CountryDbModel.TABLE_NAME} ORDER BY ${CountryDbModel.NAME}")
    fun getCountries(): List<CountryDbModel>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAll(countries: List<CountryDbModel>)
}