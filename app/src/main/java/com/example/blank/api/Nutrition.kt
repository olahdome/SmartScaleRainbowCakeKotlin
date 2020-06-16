package com.example.blank.api

data class Nutrition(
    val caloricBreakdown: CaloricBreakdown,
    val ingredients: List<IngredientX>,
    val nutrients: List<NutrientX>,
    val weightPerServing: WeightPerServing
)