package com.rsstudio.caching.ui.splash

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.databinding.DataBindingUtil
import com.rsstudio.caching.R
import com.rsstudio.caching.databinding.ActivitySplashBinding
import com.rsstudio.caching.ui.base.BaseActivity
import com.rsstudio.caching.ui.main.MainActivity

class SplashActivity : BaseActivity() {

    private lateinit var binding: ActivitySplashBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_splash)

        gotoMainActivity()
    }


    private fun initTheme() {
        window.statusBarColor = resources.getColor(R.color.white2)
        window.navigationBarColor = resources.getColor(R.color.lightBlack)
    }

    private fun gotoMainActivity() {
        Handler(Looper.getMainLooper()).postDelayed(
            Runnable {
                val intent = Intent(this@SplashActivity, MainActivity::class.java)
                startActivity(intent)
                finish()
            }, 500
        )
    }
}