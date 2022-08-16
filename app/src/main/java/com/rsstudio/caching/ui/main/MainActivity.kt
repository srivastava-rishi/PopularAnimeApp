package com.rsstudio.caching.ui.main

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import com.rsstudio.caching.R
import com.rsstudio.caching.databinding.ActivityMainBinding
import com.rsstudio.caching.ui.base.BaseActivity
import com.rsstudio.caching.ui.main.viewModel.MainViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : BaseActivity() {

    private val viewModel: MainViewModel by viewModels()

    private lateinit var binding: ActivityMainBinding

    var logTag = "@MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

    //
        initObservers()


    }

    private fun initObservers() {

        viewModel.animeData.observe(this) {

            if (it != null) {
                Log.d(logTag, "onCreate: pageNumber${it.pagination.current_page}")
                Log.d(logTag, "onCreate: dataSize${it.data.size}")

            }
        }


    }
}