package com.vathna.seavphov.ui.detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.vathna.seavphov.R
import kotlinx.android.synthetic.main.activity_book_detail.*

class BookDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book_detail)

        btnBack.setOnClickListener {
            onBackPressed()
        }
    }
}
