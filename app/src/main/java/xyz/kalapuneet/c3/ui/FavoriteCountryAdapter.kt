package xyz.kalapuneet.c3.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import xyz.kalapuneet.c3.R
import xyz.kalapuneet.c3.ui.models.CountryUiModel

class FavoriteCountryAdapter : RecyclerView.Adapter<FavoriteCountryViewHolder>() {

    private val data = arrayListOf<CountryUiModel>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FavoriteCountryViewHolder {
        val itemView = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.item_favorite_country, parent, false)
        return FavoriteCountryViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: FavoriteCountryViewHolder, position: Int) {
        holder.bindCountry(data[position])
    }

    fun updateData(newData: List<CountryUiModel>) {
        data.clear()
        data.addAll(newData)
        notifyDataSetChanged()
    }
}