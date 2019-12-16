package xyz.kalapuneet.c3.viewmodels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import xyz.kalapuneet.c3.data.AppDatabase
import xyz.kalapuneet.c3.repositories.CountryRepository
import xyz.kalapuneet.c3.middleware.DbToUiTransformer
import xyz.kalapuneet.c3.ui.models.CountryUiModel

class CountryViewModel : ViewModel() {

    val countriesLd = MutableLiveData<List<CountryUiModel>>()

    fun getCountries(appDatabase: AppDatabase) {
        GlobalScope.launch {
            val repository = CountryRepository.getInstance(appDatabase.getCountryDao())
            val transformer = DbToUiTransformer()
            countriesLd.postValue(transformer.transform(repository.getCountries()))
        }
    }
}