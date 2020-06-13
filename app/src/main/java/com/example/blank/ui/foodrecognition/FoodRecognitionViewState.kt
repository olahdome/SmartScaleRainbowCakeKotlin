package com.example.blank.ui.foodrecognition

sealed class FoodRecognitionViewState

object Loading : FoodRecognitionViewState()

data class FoodRecognitionReady(val data: String = "") : FoodRecognitionViewState()
