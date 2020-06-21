package com.example.blank.models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Length(
    @PrimaryKey
    val id: Long,
    val number: Int,
    val unit: String
)