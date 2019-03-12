package com.vathna.seavphov.ui.books

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import androidx.recyclerview.widget.RecyclerView
import com.vathna.seavphov.R
import com.vathna.seavphov.ui.detail.BookDetailActivity

class BooksListAdapter : RecyclerView.Adapter<BooksListAdapter.BooksListViewHolder>() {
    private lateinit var context: Context

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BooksListViewHolder {
        context = parent.context

        val view = LayoutInflater.from(parent.context).inflate(R.layout.floating_book_cover_item, parent, false)
        return BooksListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return 30
    }


    private var previousPosition = 0
    override fun onBindViewHolder(holder: BooksListViewHolder, position: Int) {
        holder.itemView.setOnClickListener {
            context.startActivity(Intent(context, BookDetailActivity::class.java))
        }
        if (previousPosition < position) {
            holder.itemView.startAnimation(AnimationUtils.loadAnimation(context,android.R.anim.slide_in_left))
        }
        previousPosition = position
    }

    inner class BooksListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    }
}