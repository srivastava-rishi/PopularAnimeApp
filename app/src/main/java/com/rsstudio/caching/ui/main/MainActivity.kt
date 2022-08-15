package com.rsstudio.caching.ui.main

import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.rsstudio.caching.R
import com.rsstudio.caching.databinding.ActivityMainBinding
import com.rsstudio.caching.ui.base.BaseActivity

class MainActivity : BaseActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
    }
}