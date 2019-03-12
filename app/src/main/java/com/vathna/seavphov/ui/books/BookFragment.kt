package com.vathna.seavphov.ui.books

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import androidx.recyclerview.widget.LinearLayoutManager

import com.vathna.seavphov.R
import kotlinx.android.synthetic.main.fragment_book.*

class BookFragment : Fragment() {
    private val adapter = BooksListAdapter()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_book, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        rvBooks.adapter = adapter
//        rvBooks.layoutAnimation = AnimationUtils.loadLayoutAnimation(activity, R.anim.layout_animation_fall_down)
    }
}
