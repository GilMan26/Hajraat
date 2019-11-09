package com.example.hajraat.ui.haggu.sites

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast

import com.example.hajraat.R
import kotlinx.android.synthetic.main.fragment_site_list.*

class SiteListFragment : Fragment() {

    companion object {
        fun newInstance() = SiteListFragment()
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
        var list = arrayListOf<String>()
        list.add("Laxmi Chitfund")
        list.add("Star Fisheries")
        list.add("Kukdoo Koo")
        list.add("Royal Circus")
        siteRV.adapter = SiteListAdapter(list, object : SiteListAdapter.SiteClickHandler{
            override fun onClick(site: String) {
                Toast.makeText(context, site, Toast.LENGTH_SHORT).show()
            }
        })
    }

}
