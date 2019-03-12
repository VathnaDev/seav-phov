package com.vathna.seavphov.ui.home.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.vathna.seavphov.ui.books.BookFragment

class BookViewPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {
    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> BookFragment()
            1 -> BookFragment()
            2 -> BookFragment()
            3 -> BookFragment()
            4 -> BookFragment()
            5 -> BookFragment()
            6 -> BookFragment()
            7 -> BookFragment()
            8 -> BookFragment()
            9 -> BookFragment()
            10 -> BookFragment()
            else -> BookFragment()
        }
    }

    override fun getCount() = 10

    override fun getPageTitle(position: Int): CharSequence? {
        return when (position) {
            0 -> "Feature"
            1 -> "Listens"
            2 -> "Free"
            3 -> "Inspiration"
            4 -> "Emotion"
            5 -> "History"
            6 -> "Computer"
            7 -> "AI"
            8 -> "Romance"
            9 -> "Art"
            10 -> "Dance"
            else -> ""
        }
    }

}