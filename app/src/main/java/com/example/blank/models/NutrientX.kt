package com.example.blank.models

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity(
    tableName = "nutrients"/*,
    foreignKeys = arrayOf(ForeignKey(entity = Nutrition::class,
                                    parentColumns = arrayOf("nutritionID"),
                                    childColumns = arrayOf("parentNutritionID"),
                                    onDelete = ForeignKey.CASCADE))*/
)
data class NutrientX(
    @PrimaryKey(autoGenerate = true)
    val parentNutritionID: Long,
    val amount: Double,
    val percentOfDailyNeeds: Double,
    val title: String,
    val unit: String
)