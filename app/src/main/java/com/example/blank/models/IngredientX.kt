package com.example.blank.models

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.blank.models.Nutrient

@Entity
data class IngredientX(
    @PrimaryKey
    val id: Long,
    val amount: Double,
    val name: String,
    val nutrients: List<Nutrient>,
    val unit: String
)