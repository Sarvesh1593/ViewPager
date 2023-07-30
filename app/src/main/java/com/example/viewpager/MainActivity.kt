package com.example.viewpager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adapter = Adapter(supportFragmentManager,lifecycle)
        val viewpager : ViewPager = findViewById(R.id.viewPager)
        val tablayout : TabLayout = findViewById(R.id.tab_layout)

        viewpager.adapter = adapter
        tablayout.setupWithViewPager(viewpager)
    }
}