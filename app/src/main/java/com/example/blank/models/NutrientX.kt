package com.example.blank.models

import androidx.room.Entity

@Entity(
    tableName = "nutrients"
)
data class NutrientX(
    val amount: Double,
    val percentOfDailyNeeds: Double,
    val title: String,
    val unit: String
)