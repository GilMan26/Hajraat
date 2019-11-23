package com.example.hajraat.ui

import android.content.Context
import com.example.hajraat.R
import com.example.hajraat.ui.extras.ResourceUtils
import com.example.hajraat.ui.models.SiteUI

object MockUIClient {

    fun getSiteList(context: Context): ArrayList<SiteUI>{
        val list = arrayListOf<SiteUI>()

        list.add(SiteUI("Some Apartments", "Apartments named some apartments", ResourceUtils.getString(context, R.string.dummy_image1)))
        list.add(SiteUI("Some other Apartments", "Apartments named some other apartments", ResourceUtils.getString(context, R.string.dummy_image2)))
        list.add(SiteUI("Skippy Fragments", "These apartments are big, really big", ResourceUtils.getString(context, R.string.dummy_image3)))
        list.add(SiteUI("IDK Apartments", "Apartments I know nothing about.", ResourceUtils.getString(context, R.string.dummy_image1)))
        list.add(SiteUI("Some Apartments", "Apartments named some apartments", ResourceUtils.getString(context, R.string.dummy_image1)))
        list.add(SiteUI("Some other Apartments", "Apartments named some other apartments", ResourceUtils.getString(context, R.string.dummy_image2)))
        list.add(SiteUI("Some other Apartments", "Apartments named some other apartments", ResourceUtils.getString(context, R.string.dummy_image2)))
        list.add(SiteUI("Some other Apartments", "Apartments named some other apartments", ResourceUtils.getString(context, R.string.dummy_image2)))
        return list
    }

}