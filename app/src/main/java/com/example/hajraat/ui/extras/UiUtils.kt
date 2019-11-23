package com.example.hajraat.ui.extras

import android.content.Context
import android.content.Intent
import android.net.Uri

class UiUtils{
    companion object{
        fun startCall(context: Context, phoneNumber: String){
            val intent = Intent(Intent.ACTION_DIAL)
            intent.data= Uri.parse("tel:$phoneNumber")
            context.startActivity(intent)
        }
    }
}