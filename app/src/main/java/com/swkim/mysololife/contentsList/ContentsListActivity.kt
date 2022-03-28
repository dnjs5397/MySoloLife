package com.swkim.mysololife.contentsList

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.swkim.mysololife.R
import com.swkim.mysololife.databinding.ActivityContentsListBinding

class ContentsListActivity : AppCompatActivity() {
    private lateinit var binding : ActivityContentsListBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = DataBindingUtil.setContentView(this, R.layout.activity_contents_list)
        super.onCreate(savedInstanceState)

        val rv : RecyclerView = binding.recyclerView

        val items = ArrayList<String>()
        items.add("A")
        items.add("B")
        items.add("C")

        val rvAdapter = ContentsRVAdapter(items)
        rv.adapter = rvAdapter

        rv.layoutManager = GridLayoutManager(this, 2)
    }
}