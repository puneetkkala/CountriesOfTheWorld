package xyz.kalapuneet.c3.ui

import android.net.Uri
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_favorite_country.view.*
import xyz.kalapuneet.c3.image.GlideApp
import xyz.kalapuneet.c3.ui.models.CountryUiModel

class FavoriteCountryViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    fun bindCountry(countryUiModel: CountryUiModel) {
        GlideApp
            .with(itemView)
            .load(Uri.parse(countryUiModel.imageUrl))
            .into(itemView.countryFlag)
        itemView.countryName.text = countryUiModel.countryName
    }
}