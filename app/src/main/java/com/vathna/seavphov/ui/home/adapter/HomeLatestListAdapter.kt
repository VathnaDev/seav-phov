package com.vathna.seavphov.ui.home.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.vathna.seavphov.R
import com.vathna.seavphov.ui.detail.BookDetailActivity

class HomeLatestListAdapter : RecyclerView.Adapter<HomeLatestListAdapter.HomeLatestViewHolder>() {
    private lateinit var context : Context
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeLatestViewHolder {
        context = parent.context

        val view = LayoutInflater.from(parent.context).inflate(R.layout.latest_list_item, parent, false)
        return HomeLatestViewHolder(view)
    }

    override fun getItemCount(): Int {
        return 30
    }

    override fun onBindViewHolder(holder: HomeLatestViewHolder, position: Int) {
        holder.itemView.setOnClickListener {
            context.startActivity(Intent(context, BookDetailActivity::class.java))
        }
    }


    inner class HomeLatestViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    }
}