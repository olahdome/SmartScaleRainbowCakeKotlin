package com.example.blank.models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class CaloricBreakdown(
    @PrimaryKey
    val id: Long,
    val percentCarbs: Double,
    val percentFat: Double,
    val percentProtein: Double
)