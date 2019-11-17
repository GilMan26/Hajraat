package com.example.hajraat.ui.haggu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.example.hajraat.R
import com.example.hajraat.databinding.ActivityHagguBinding
import com.example.hajraat.ui.haggu.sites.SiteListFragment

class HagguActivity : AppCompatActivity() {

    companion object{
        fun addContainer(fragmentManager: FragmentManager, fragment : Fragment){
            fragmentManager.beginTransaction().add(R.id.frameContainer, fragment).commitAllowingStateLoss()
        }
    }

    lateinit var binding: ActivityHagguBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=DataBindingUtil.setContentView(this, R.layout.activity_haggu)
        addContainer(supportFragmentManager, SiteListFragment.newInstance())
    }


}
