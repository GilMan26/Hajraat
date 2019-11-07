package com.example.hajraat.ui.haggu.update

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.hajraat.R

class SiteUpdateFragment : Fragment() {

    companion object {
        fun newInstance() = SiteUpdateFragment()
    }

    private lateinit var viewModel: SiteUpdateViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.site_update_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(SiteUpdateViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
