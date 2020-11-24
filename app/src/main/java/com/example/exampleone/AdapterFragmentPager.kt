package com.example.exampleone

import android.util.SparseArray
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentManager
import androidx.viewpager2.adapter.FragmentStateAdapter

class AdapterFragmentPager(activity: ThirdActivity) : FragmentStateAdapter(activity) {

    private val fragments: SparseArray<Fragment> = SparseArray()


    companion object {

        const val PAGE_List = 0

        const val PAGE_NineGrid = 1

    }

    init {
        fragments.put(PAGE_List, ItemFragment())
        fragments.put(PAGE_NineGrid, GridFragment())
    }

    override fun getItemCount(): Int {
        return fragments.size()
    }

    override fun createFragment(position: Int): Fragment {
        return fragments[position]
    }

}
