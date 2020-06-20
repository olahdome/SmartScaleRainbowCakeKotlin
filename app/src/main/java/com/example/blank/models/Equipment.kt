package com.example.blank.models

import com.example.blank.models.Temperature

data class Equipment(
    val id: Int,
    val image: String,
    val localizedName: String,
    val name: String,
    val temperature: Temperature
)