package com.vathna.seavphov.ui.books


import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.vathna.seavphov.R
import com.vathna.seavphov.ui.home.adapter.BookViewPagerAdapter
import kotlinx.android.synthetic.main.fragment_books.*

class BooksFragment : Fragment() {

    private lateinit var viewPagerAdapter: BookViewPagerAdapter
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_books, container, false)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        viewPagerAdapter = BookViewPagerAdapter(childFragmentManager)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        tabLayout.setupWithViewPager(vpBooks)
        vpBooks.adapter = viewPagerAdapter
    }

}
