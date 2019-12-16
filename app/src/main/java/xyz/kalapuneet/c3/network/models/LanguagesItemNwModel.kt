package xyz.kalapuneet.c3.network.models

import com.google.gson.annotations.SerializedName

data class LanguagesItemNwModel(

	@SerializedName("nativeName")
	val nativeName: String? = null,

	@SerializedName("iso639_2")
	val iso6392: String? = null,

	@SerializedName("name")
	val name: String? = null,

	@SerializedName("iso639_1")
	val iso6391: String? = null
)