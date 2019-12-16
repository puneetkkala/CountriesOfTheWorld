package xyz.kalapuneet.c3.network.models

import com.google.gson.annotations.SerializedName

data class CountryNwModel(

	@SerializedName("area")
	val area: Float? = null,

	@SerializedName("nativeName")
	val nativeName: String? = null,

	@SerializedName("capital")
	val capital: String? = null,

	@SerializedName("demonym")
	val demonym: String? = null,

	@SerializedName("flag")
	val flag: String? = null,

	@SerializedName("alpha2Code")
	val alpha2Code: String? = null,

	@SerializedName("languages")
	val languages: List<LanguagesItemNwModel>? = null,

	@SerializedName("borders")
	val borders: List<String>? = null,

	@SerializedName("subregion")
	val subregion: String? = null,

	@SerializedName("callingCodes")
	val callingCodes: List<String>? = null,

	@SerializedName("regionalBlocs")
	val regionalBlocs: List<RegionalBlocsItemNwModel>? = null,

	@SerializedName("gini")
	val gini: Double? = null,

	@SerializedName("population")
	val population: Int? = null,

	@SerializedName("numericCode")
	val numericCode: String? = null,

	@SerializedName("alpha3Code")
	val alpha3Code: String? = null,

	@SerializedName("topLevelDomain")
	val topLevelDomain: List<String>? = null,

	@SerializedName("timezones")
	val timezones: List<String>? = null,

	@SerializedName("cioc")
	val cioc: String? = null,

	@SerializedName("translations")
	val translations: TranslationsNwModel? = null,

	@SerializedName("name")
	val name: String? = null,

	@SerializedName("altSpellings")
	val altSpellings: List<String>? = null,

	@SerializedName("region")
	val region: String? = null,

	@SerializedName("latlng")
	val latlng: List<Float>? = null,

	@SerializedName("currencies")
	val currencies: List<CurrenciesItemNwModel>? = null
)