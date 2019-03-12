package com.vathna.seavphov.ui.home.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import androidx.recyclerview.widget.RecyclerView
import com.vathna.seavphov.R
import com.vathna.seavphov.ui.detail.BookDetailActivity

class HomeFeatureListAdapter : RecyclerView.Adapter<HomeFeatureListAdapter.HomeFeatureViewHolder>() {
    private lateinit var context: Context
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeFeatureViewHolder {
        context = parent.context

        val view = LayoutInflater.from(parent.context).inflate(R.layout.feature_list_item, parent, false)
        return HomeFeatureViewHolder(view)
    }

    override fun getItemCount(): Int {
        return 30
    }

    private var previousPosition = 0
    override fun onBindViewHolder(holder: HomeFeatureViewHolder, position: Int) {
        holder.itemView.setOnClickListener {
            context.startActivity(Intent(context, BookDetailActivity::class.java))
        }
        if (previousPosition < position) {
            holder.animate()
        }
        previousPosition = position
    }

    override fun onViewDetachedFromWindow(holder: HomeFeatureViewHolder) {
        holder.clearAnimation()
        super.onViewDetachedFromWindow(holder)
    }

    inner class HomeFeatureViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun animate() {
            itemView.startAnimation(AnimationUtils.loadAnimation(itemView.context, android.R.anim.fade_in))
        }

        fun clearAnimation() {
            itemView.rootView.clearAnimation()
        }
    }
}