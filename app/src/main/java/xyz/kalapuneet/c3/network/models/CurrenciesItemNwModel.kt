package xyz.kalapuneet.c3.network.models

import com.google.gson.annotations.SerializedName

data class CurrenciesItemNwModel(

	@SerializedName("symbol")
	val symbol: String? = null,

	@SerializedName("code")
	val code: String? = null,

	@SerializedName("name")
	val name: String? = null
)