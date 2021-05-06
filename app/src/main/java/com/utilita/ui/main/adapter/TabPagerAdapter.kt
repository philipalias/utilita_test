package com.utilita.ui.main.adapter

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.utilita.ui.main.MainFragment
import com.utilita.ui.main.SiteFragment

@Suppress("DEPRECATION")
internal class TabPagerAdapter(
        var context: Context,
        fm: FragmentManager,
        var totalTabs: Int
) :
        FragmentPagerAdapter(fm) {
    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> {
                MainFragment()
            }
            1 -> {
                SiteFragment()
            }
            else -> getItem(position)
        }
    }
    override fun getCount(): Int {
        return totalTabs
    }
}