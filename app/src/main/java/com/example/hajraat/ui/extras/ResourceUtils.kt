package com.example.hajraat.ui.extras

import android.content.Context

class ResourceUtils {
    companion object {
        fun getString(context: Context, id: Int) =
            context.resources.getString(id)
    }
}