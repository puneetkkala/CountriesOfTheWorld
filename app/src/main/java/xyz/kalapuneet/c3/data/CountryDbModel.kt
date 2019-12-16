package xyz.kalapuneet.c3.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import xyz.kalapuneet.c3.data.CountryDbModel.Companion.TABLE_NAME

@Entity(tableName = TABLE_NAME)
data class CountryDbModel(
    @PrimaryKey
    val id: String,
    @ColumnInfo(name = NAME, index = true)
    val name: String,
    @ColumnInfo(name = ALPHA_2)
    val alpha2Code: String,
    @ColumnInfo(name = ALPHA_3, index = true)
    val alpha3Code: String,
    @ColumnInfo(name = CAPITAL)
    val capital: String,
    @ColumnInfo(name = REGION)
    val region: String?,
    @ColumnInfo(name = SUBREGION)
    val subRegion: String?,
    @ColumnInfo(name = POPULATION)
    val population: Int?,
    @ColumnInfo(name = DEMONYM)
    val demonym: String?,
    @ColumnInfo(name = AREA)
    val area: Float?,
    @ColumnInfo(name = GINI)
    val gini: Double?,
    @ColumnInfo(name = BORDERS)
    val nativeName: String?,
    @ColumnInfo(name = NUMERIC_CODE)
    val numericCode: String?,
    @ColumnInfo(name = FLAG)
    val flag: String,
    @ColumnInfo(name = CIOC)
    val cioc: String?
) {
    companion object {
        const val TABLE_NAME = "country"
        const val NAME = "name"
        const val TLD = "tld"
        const val ALPHA_2 = "alpha2"
        const val ALPHA_3 = "alpha3"
        const val CAPITAL = "capital"
        const val REGION = "region"
        const val SUBREGION = "subregion"
        const val POPULATION = "population"
        const val DEMONYM = "demonym"
        const val AREA = "area"
        const val GINI = "gini"
        const val BORDERS = "borders"
        const val NUMERIC_CODE = "numeric_code"
        const val FLAG = "flag"
        const val CIOC = "cioc"
    }
}