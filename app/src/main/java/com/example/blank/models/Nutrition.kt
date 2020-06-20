package com.example.blank.models

import androidx.room.Entity

@Entity(
    tableName = "nutritions"
)
data class Nutrition(
    val caloricBreakdown: CaloricBreakdown,
    val ingredients: List<IngredientX>,
    val nutrients: List<NutrientX>,
    val weightPerServing: WeightPerServing
)