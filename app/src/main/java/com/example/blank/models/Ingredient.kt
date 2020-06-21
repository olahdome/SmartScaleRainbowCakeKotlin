package com.example.blank.models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Ingredient(
    @PrimaryKey
    val ingerdientId: Long,
    val id: Int,
    val image: String,
    val localizedName: String,
    val name: String
)