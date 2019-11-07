package com.example.hajraat.ui.haggu.requirements

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.hajraat.R

class RequitementFragment : Fragment() {

    companion object {
        fun newInstance() = RequitementFragment()
    }

    private lateinit var viewModel: RequitementViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.requitement_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(RequitementViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
