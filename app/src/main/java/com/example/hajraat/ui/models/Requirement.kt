package com.example.hajraat.ui.models

import android.os.AsyncTask
import java.util.*

data class Requirement(
    val id: UUID,
    val workSiteID: UUID,
    val description: String,
    val imageUrl: String,
    val audioUrl: String,
    val status: RequirementStatus
)

enum class RequirementStatus{
    ACKNOWLEDGED,
    INCOOMPLETE,
    ISSUED,
    COMPLETE
}