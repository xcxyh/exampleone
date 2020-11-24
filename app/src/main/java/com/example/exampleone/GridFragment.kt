package com.example.exampleone

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.GridView
import android.widget.SimpleAdapter
import androidx.fragment.app.Fragment


class GridFragment : Fragment() {


    lateinit var simpleAdapter: SimpleAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_grid, container, false)

        val grid = view.findViewById<GridView>(R.id.nine_grid)

        val from = arrayOf("image", "text")
        val to = intArrayOf(R.id.item_image, R.id.item_name)
        val list = generateData()
        simpleAdapter = SimpleAdapter(this.context, list, R.layout.grid_item, from, to)
        grid.adapter = simpleAdapter

        return view

    }

    private fun generateData(): List<Map<String, Any>>{

        val list = mutableListOf<Map<String, Any>>()
        val img = R.drawable.android_category_simple
        for (i in 1..9){

            val map: Map<String, Any> = mapOf("image" to img, "text" to "android $i")

            list.add(map)
        }
        return list
    }

}