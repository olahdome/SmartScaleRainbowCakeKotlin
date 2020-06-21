package com.example.blank.models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class WeightPerServing(
    @PrimaryKey
    val id: Long,
    val amount: Int,
    val unit: String
)