package com.example.blank.models

import com.example.blank.models.Nutrient

data class IngredientX(
    val amount: Double,
    val name: String,
    val nutrients: List<Nutrient>,
    val unit: String
)