package xyz.kalapuneet.c3.ui

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import java.lang.IndexOutOfBoundsException

const val FAVORITE_COUNTRY_INDEX = 0
const val COUNTRY_LIST_INDEX = 1

class PagerAdapter(fragment: Fragment): FragmentStateAdapter(fragment) {

    private val tabFragmentsCreators: Map<Int, () -> Fragment> = mapOf(
        FAVORITE_COUNTRY_INDEX to { FavoriteCountryFragment() },
        COUNTRY_LIST_INDEX to { CountryListFragment() }
    )

    override fun getItemCount(): Int {
        return tabFragmentsCreators.size
    }

    override fun createFragment(position: Int): Fragment {
        return tabFragmentsCreators[position]?.invoke() ?: throw IndexOutOfBoundsException()
    }
}