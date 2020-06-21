package com.example.blank.models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(
    tableName = "nutritions"
)
data class Nutrition(
    @PrimaryKey(autoGenerate = true) val nutritionID: Long,
    val caloricBreakdown: CaloricBreakdown,
    val ingredients: List<IngredientX>,
    val nutrients: List<NutrientX>,
    val weightPerServing: WeightPerServing
)