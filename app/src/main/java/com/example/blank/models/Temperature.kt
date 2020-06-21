package com.example.blank.models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Temperature(
    @PrimaryKey
    val id: Long,
    val number: Double,
    val unit: String
)