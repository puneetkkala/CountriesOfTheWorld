package xyz.kalapuneet.c3.middleware

import androidx.annotation.WorkerThread
import xyz.kalapuneet.c3.data.CountryDbModel
import xyz.kalapuneet.c3.ui.models.CountryUiModel

@WorkerThread
class DbToUiTransformer {

    fun transform(countryDbModelList: List<CountryDbModel>): List<CountryUiModel> {
        val countryUiModelList = arrayListOf<CountryUiModel>()
        countryDbModelList.forEach {
            countryUiModelList.add(
                CountryUiModel(
                    imageUrl = it.flag,
                    countryName = it.name
                )
            )
        }
        return countryUiModelList
    }
}