package xyz.kalapuneet.c3.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import kotlinx.android.synthetic.main.fragment_favorite_country_list.view.*
import xyz.kalapuneet.c3.R
import xyz.kalapuneet.c3.data.AppDatabase
import xyz.kalapuneet.c3.viewmodels.CountryViewModel

class FavoriteCountryFragment : Fragment(R.layout.fragment_favorite_country_list) {

    private val adapter by lazy {
        FavoriteCountryAdapter()
    }

    private lateinit var viewModel: CountryViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.countryList.adapter = adapter
        viewModel = viewModels<CountryViewModel>().value
        viewModel.countriesLd.observe(this, Observer {
            adapter.updateData(it)
        })
        viewModel.getCountries(AppDatabase.getInstance(requireContext()))
    }
}