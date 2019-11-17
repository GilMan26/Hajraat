package com.example.hajraat.ui.haggu.sites

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.hajraat.R
import com.example.hajraat.ui.haggu.FragmentActivityInteracator
import com.example.hajraat.ui.models.SiteUI
import kotlinx.android.synthetic.main.fragment_site_list.*

class SiteListFragment : Fragment() {

    companion object {
        fun newInstance(fragmentActivityInteracator: FragmentActivityInteracator) = SiteListFragment()
    }

    private lateinit var viewModel: SiteListViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_site_list, container, false)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(SiteListViewModel::class.java)
        // TODO: Use the ViewModel
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initRecycler()
    }

    fun initRecycler(){
        val list = arrayListOf<SiteUI>()
        list.add(SiteUI("asldalsdlas"))
        list.add(SiteUI("saslkdjasd"))
        list.add(SiteUI("asldjadssad"))
        list.add(SiteUI("aljjsdnajkdasd"))
        siteRV.adapter = SiteListAdapter(list, object : SiteListAdapter.SiteClickHandler{
            override fun onClick(site: SiteUI) {

            }
        })
    }

}
