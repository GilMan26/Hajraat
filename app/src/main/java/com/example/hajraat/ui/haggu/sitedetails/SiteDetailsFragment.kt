package com.example.hajraat.ui.haggu.sitedetails

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.hajraat.R
import com.example.hajraat.ui.models.SiteUI
import kotlinx.android.synthetic.main.fragment_site_details.*

class SiteDetailsFragment : Fragment() {

    companion object {
        fun newInstance(siteUI: SiteUI) = SiteDetailsFragment()
    }

    private lateinit var viewModel: SiteDetailsViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_site_details, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(SiteDetailsViewModel::class.java)
        // TODO: Use the ViewModel
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        button1.setOnClickListener {

        }
        button2.setOnClickListener{

        }
        button3.setOnClickListener {

        }
    }

}
