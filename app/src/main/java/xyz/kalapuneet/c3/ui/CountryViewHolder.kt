package xyz.kalapuneet.c3.ui

import android.net.Uri
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_country.view.*
import xyz.kalapuneet.c3.image.GlideApp
import xyz.kalapuneet.c3.ui.models.CountryUiModel


class CountryViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    fun bindTo(countryUiModel: CountryUiModel) {
        val uri: Uri = Uri.parse(countryUiModel.imageUrl)
        GlideApp.with(itemView).load(uri).into(itemView.countryFlag)
        itemView.countryName.text = countryUiModel.countryName
    }
}