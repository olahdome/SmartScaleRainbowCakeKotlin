package com.example.blank.ui.manualfoodsearch

sealed class ManualFoodSearchViewState

object Loading : ManualFoodSearchViewState()

data class ManualFoodSearchReady(val data: String = "") : ManualFoodSearchViewState()
