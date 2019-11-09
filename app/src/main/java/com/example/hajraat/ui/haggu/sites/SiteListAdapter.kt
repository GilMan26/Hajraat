package com.example.hajraat.ui.haggu.sites

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.hajraat.databinding.RowItemSiteBinding

class SiteListAdapter(var list : ArrayList<String>, var callback : SiteClickHandler) : RecyclerView.Adapter<SiteListAdapter.ItemSiteViewHolder>()  {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemSiteViewHolder {
        return ItemSiteViewHolder(RowItemSiteBinding.inflate(LayoutInflater.from(parent.context), parent , false))
    }

    override fun onBindViewHolder(holder: ItemSiteViewHolder, position: Int) {
        holder.binding.nameTV.text = list[position]
        holder.itemView.setOnClickListener{
            callback.onClick(list[position])
        }
    }

    override fun getItemCount(): Int = list.size

    class ItemSiteViewHolder(val binding : RowItemSiteBinding) : RecyclerView.ViewHolder(binding.root)

    interface SiteClickHandler{
        fun onClick(site : String)
    }
}