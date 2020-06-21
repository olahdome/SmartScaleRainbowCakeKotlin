package com.example.blank.models

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.blank.models.Temperature

@Entity
data class Equipment(
    @PrimaryKey
    val equipmentID: Long,
    val id: Int,
    val image: String,
    val localizedName: String,
    val name: String,
    val temperature: Temperature
)