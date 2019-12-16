package xyz.kalapuneet.c3.network.models

import com.google.gson.annotations.SerializedName

data class RegionalBlocsItemNwModel(

	@SerializedName("otherNames")
	val otherNames: List<Any?>? = null,

	@SerializedName("acronym")
	val acronym: String? = null,

	@SerializedName("name")
	val name: String? = null,

	@SerializedName("otherAcronyms")
	val otherAcronyms: List<Any?>? = null
)