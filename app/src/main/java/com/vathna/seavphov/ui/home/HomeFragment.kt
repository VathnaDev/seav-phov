package com.vathna.seavphov.ui.home


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import androidx.core.view.ViewCompat
import androidx.recyclerview.widget.LinearLayoutManager

import com.vathna.seavphov.R
import com.vathna.seavphov.ui.home.adapter.HomeFeatureListAdapter
import com.vathna.seavphov.ui.home.adapter.HomeLatestListAdapter
import kotlinx.android.synthetic.main.layout_home_feature.*
import kotlinx.android.synthetic.main.layout_home_latest.*

class HomeFragment : Fragment() {
    private val featureListAdapter = HomeFeatureListAdapter()
    private val latestListAdapter = HomeLatestListAdapter()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        rvHomeBooks.adapter = featureListAdapter

        rvHomeLatestBook.layoutManager = LinearLayoutManager(activity, LinearLayoutManager.HORIZONTAL, false)
        rvHomeLatestBook.adapter = latestListAdapter
        rvHomeLatestBook.layoutAnimation = AnimationUtils.loadLayoutAnimation(activity, R.anim.layout_animation_fade_in)
    }


}
