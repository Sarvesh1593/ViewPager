package com.example.viewpager

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.lifecycle.Lifecycle

class Adapter(fragmentManager: FragmentManager,lifecycle: Lifecycle) : FragmentPagerAdapter(fragmentManager,
    BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {
    override fun getCount(): Int {
        return 3
    }

    override fun getItem(position: Int): Fragment {
        return when(position){
            0-> FirstFragment()
            1-> SecondFragment()
            3 -> ThirdFragment()
            else -> FirstFragment()
        }
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return when (position){

            0 -> "tab 1"
            1 -> "tab 2"
            2 -> "tab 3"
            else ->super.getPageTitle(position)
        }
    }
}