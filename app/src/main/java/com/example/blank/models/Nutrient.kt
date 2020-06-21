package com.example.blank.models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Nutrient(
    @PrimaryKey
    val id: Long,
    val amount: Double,
    val name: String,
    val unit: String
)