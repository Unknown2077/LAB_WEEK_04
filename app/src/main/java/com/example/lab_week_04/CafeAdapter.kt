package com.example.lab_week_04

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter

class CafeAdapter(private val hostFragment: Fragment) :
    FragmentStateAdapter(hostFragment) {

    override fun getItemCount(): Int {
        return TABS_FIXED.size
    }

    override fun createFragment(position: Int): Fragment {
        val content = hostFragment.getString(TAB_CONTENTS[position])
        return CafeDetailFragment.newInstance(content)
    }
}
