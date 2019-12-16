package xyz.kalapuneet.c3.ui

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.fragment_view_pager.view.*
import xyz.kalapuneet.c3.R

class HomeViewPagerFragment : Fragment(R.layout.fragment_view_pager) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.viewPager.adapter = PagerAdapter(this)

        TabLayoutMediator(view.tabs, view.viewPager) { tab, position ->
            tab.icon = context?.getDrawable(getTabIcon(position))
            tab.text = getTabTitle(position)
        }.attach()

        (activity as AppCompatActivity).setSupportActionBar(view.toolbar)
    }

    @Throws(IndexOutOfBoundsException::class)
    private fun getTabIcon(position: Int): Int {
        return when (position) {
            FAVORITE_COUNTRY_INDEX -> R.drawable.ic_favorite
            COUNTRY_LIST_INDEX -> R.drawable.ic_all_countries
            else -> throw IndexOutOfBoundsException()
        }
    }

    @Throws(IndexOutOfBoundsException::class)
    private fun getTabTitle(position: Int): String {
        return when (position) {
            FAVORITE_COUNTRY_INDEX -> getString(R.string.tab_favorite)
            COUNTRY_LIST_INDEX -> getString(R.string.tab_all)
            else -> throw IndexOutOfBoundsException()
        }
    }
}