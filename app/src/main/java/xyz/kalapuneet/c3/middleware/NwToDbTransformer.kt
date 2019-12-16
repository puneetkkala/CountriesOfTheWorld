package xyz.kalapuneet.c3.middleware

import androidx.annotation.WorkerThread
import xyz.kalapuneet.c3.data.CountryDbModel
import xyz.kalapuneet.c3.network.models.CountryNwModel
import java.util.*

@WorkerThread
class NwToDbTransformer {

    fun transform(countryNwModelList: List<CountryNwModel>): List<CountryDbModel> {
        val listCountryDbModel = arrayListOf<CountryDbModel>()
        countryNwModelList.forEach {
            if (
                it.name != null &&
                it.alpha2Code != null &&
                it.alpha3Code != null &&
                it.capital != null &&
                it.flag != null
            ) {
                listCountryDbModel.add(
                    CountryDbModel(
                        id = UUID.randomUUID().toString(),
                        name = it.name,
                        alpha2Code = it.alpha2Code,
                        alpha3Code = it.alpha3Code,
                        capital = it.capital,
                        region = it.region,
                        subRegion = it.subregion,
                        population = it.population,
                        demonym = it.demonym,
                        area = it.area?.toFloat(),
                        gini = it.gini,
                        nativeName = it.nativeName,
                        numericCode = it.numericCode,
                        flag = it.flag,
                        cioc = it.cioc
                    )
                )
            }
        }
        return listCountryDbModel
    }
}