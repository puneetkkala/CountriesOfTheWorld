package xyz.kalapuneet.c3.network

import android.content.Context
import androidx.work.CoroutineWorker
import androidx.work.WorkerParameters
import kotlinx.coroutines.coroutineScope
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import xyz.kalapuneet.c3.data.AppDatabase
import xyz.kalapuneet.c3.middleware.NwToDbTransformer

class CountryNwWorker(private val context: Context, worker: WorkerParameters) : CoroutineWorker(context, worker) {

    override suspend fun doWork(): Result {
        return coroutineScope {
            return@coroutineScope try {
                val retrofit = Retrofit.Builder()
                    .baseUrl("https://restcountries.eu/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()
                val service = retrofit.create(CountryApiService::class.java)
                val countriesNwModelList = service.getAllCountriesAsync().execute().body() ?: arrayListOf()
                val transformer = NwToDbTransformer()
                val dbModelList = transformer.transform(countriesNwModelList)
                AppDatabase.getInstance(context).getCountryDao().insertAll(dbModelList)
                Result.success()
            } catch (e: Exception) {
                e.printStackTrace()
                Result.failure()
            }
        }
    }
}