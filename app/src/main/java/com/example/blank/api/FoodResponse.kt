package com.example.blank.api

data class FoodResponse(
    val number: Int,
    val offset: Int,
    val results: List<Result>,
    val totalResults: Int
)