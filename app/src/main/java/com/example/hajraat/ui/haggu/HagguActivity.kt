package com.example.hajraat.ui.haggu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.hajraat.R
import com.example.hajraat.databinding.ActivityHagguBinding
import com.example.hajraat.ui.haggu.sites.SiteListFragment

class HagguActivity : AppCompatActivity() {

    lateinit var binding: ActivityHagguBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=DataBindingUtil.setContentView(this, R.layout.activity_haggu)
        supportFragmentManager.beginTransaction().add(R.id.frameContainer, SiteListFragment()).commitAllowingStateLoss()
    }
}
