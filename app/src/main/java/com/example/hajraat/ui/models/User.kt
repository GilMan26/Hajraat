package com.example.hajraat.ui.models

import java.util.*

data class User (
    val uuid: UUID,
    val name: String,
    val phoneNumber: String,
    val userType: UserType
)

enum class UserType{
    TYPE_ADMIN,
    TYPE_WORKER
}