package com.rsstudio.caching.ui.base

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.rsstudio.caching.R
import com.rsstudio.caching.databinding.ActivityBaseBinding
import kotlinx.coroutines.Job

abstract  class BaseActivity : AppCompatActivity() {

    companion object {
        private lateinit var binding: ActivityBaseBinding
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_base)
    }
}