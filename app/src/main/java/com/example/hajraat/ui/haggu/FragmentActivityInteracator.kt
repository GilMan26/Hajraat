package com.example.hajraat.ui.haggu

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager

interface FragmentActivityInteracator {
    fun addContainer(fragmentManager: FragmentManager, fragment: Fragment)
}