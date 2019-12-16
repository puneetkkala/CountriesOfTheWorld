package xyz.kalapuneet.c3.repositories

import xyz.kalapuneet.c3.data.CountryDao

class CountryRepository private constructor(private val countryDao: CountryDao) {

    fun getCountries() = countryDao.getCountries()

    companion object {

        // For Singleton instantiation
        @Volatile
        private var instance: CountryRepository? = null

        fun getInstance(countryDao: CountryDao) =
            instance ?: synchronized(this) {
                instance
                    ?: CountryRepository(countryDao).also { instance = it }
            }
    }
}