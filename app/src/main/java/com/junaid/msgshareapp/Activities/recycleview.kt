package com.junaid.msgshareapp.Activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.junaid.msgshareapp.R
import com.junaid.msgshareapp.model.cardview
import com.junaid.msgshareapp.Adapters.hobbiesadapter
import kotlinx.android.synthetic.main.recycle_view.*


class recycleview :AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.recycle_view)

        setupRecyclerView()
    }

    private fun setupRecyclerView() {
        val LayoutManager = LinearLayoutManager(this)
        LayoutManager.orientation = LinearLayoutManager.VERTICAL
        recycleview.layoutManager=LayoutManager
        val adapter = hobbiesadapter(this, cardview.supplier.hobbies)
        recycleview.adapter=adapter
    }
}




