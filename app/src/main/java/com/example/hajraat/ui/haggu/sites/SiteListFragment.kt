package com.example.hajraat.ui.haggu.sites

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.hajraat.R

class SiteListFragment : Fragment() {

    companion object {
        fun newInstance() = SiteListFragment()
    }

    private lateinit var viewModel: SiteListViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.site_list_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(SiteListViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
