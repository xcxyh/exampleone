package com.example.exampleone

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class ThirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        val vpFragment= findViewById<ViewPager2>(R.id.vp_fragment)
        val adapterFragmentPager = AdapterFragmentPager(this)
        val mTabLayout = findViewById<TabLayout>(R.id.register_tabs);
        vpFragment.adapter = adapterFragmentPager
        vpFragment.currentItem = 0


        val tabTexts = arrayOf("列表", "九宫格")
        val mediator = TabLayoutMediator(
            mTabLayout, vpFragment
        ) { tab, position ->
            tab.setText(tabTexts[position])
        }
        mediator.attach()
    }
}