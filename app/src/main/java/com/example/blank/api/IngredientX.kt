package com.example.blank.api

data class IngredientX(
    val amount: Double,
    val name: String,
    val nutrients: List<Nutrient>,
    val unit: String
)