package xyz.kalapuneet.c3.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import xyz.kalapuneet.c3.R
import xyz.kalapuneet.c3.ui.models.CountryUiModel

class CountryAdapter : RecyclerView.Adapter<CountryViewHolder>() {

    val data = arrayListOf<CountryUiModel>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CountryViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_country, parent, false)
        return CountryViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: CountryViewHolder, position: Int) {
        holder.bindTo(data[position])
    }

    fun updateData(newData: List<CountryUiModel>) {
        data.clear()
        data.addAll(newData)
        notifyDataSetChanged()
    }
}