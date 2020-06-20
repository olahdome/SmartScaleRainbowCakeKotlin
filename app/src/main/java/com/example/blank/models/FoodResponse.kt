package com.example.blank.models

import com.example.blank.models.Result

data class FoodResponse(
    val number: Int,
    val offset: Int,
    val results: List<Result>,
    val totalResults: Int
)