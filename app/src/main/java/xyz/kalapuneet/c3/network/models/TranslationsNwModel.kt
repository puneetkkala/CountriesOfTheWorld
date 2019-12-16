package xyz.kalapuneet.c3.network.models

import com.google.gson.annotations.SerializedName

data class TranslationsNwModel(

	@SerializedName("br")
	val br: String? = null,

	@SerializedName("de")
	val de: String? = null,

	@SerializedName("pt")
	val pt: String? = null,

	@SerializedName("ja")
	val ja: String? = null,

	@SerializedName("hr")
	val hr: String? = null,

	@SerializedName("it")
	val it: String? = null,

	@SerializedName("fa")
	val fa: String? = null,

	@SerializedName("fr")
	val fr: String? = null,

	@SerializedName("es")
	val es: String? = null,

	@SerializedName("nl")
	val nl: String? = null
)