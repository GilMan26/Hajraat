package com.example.hajraat.ui.models

import java.io.Serializable


data class SiteUI  (
    val name:String,
    val description: String?,
    val imageURL : String?
//    val location : Location?
) : Serializable