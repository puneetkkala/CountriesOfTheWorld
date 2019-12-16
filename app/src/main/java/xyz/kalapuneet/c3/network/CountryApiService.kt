package xyz.kalapuneet.c3.network

import retrofit2.Call
import retrofit2.http.GET
import xyz.kalapuneet.c3.network.models.CountryNwModel

interface CountryApiService {

    @GET("rest/v2/all")
    fun getAllCountriesAsync(): Call<ArrayList<CountryNwModel>>
}