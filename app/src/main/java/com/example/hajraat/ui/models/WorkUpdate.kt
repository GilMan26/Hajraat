package com.example.hajraat.ui.models

import java.util.*

data class WorkUpdate(
    val uuid: UUID,
    val description: String,
    val imageUrl: String,
    val audioUrl: String,
    val date: Date
)