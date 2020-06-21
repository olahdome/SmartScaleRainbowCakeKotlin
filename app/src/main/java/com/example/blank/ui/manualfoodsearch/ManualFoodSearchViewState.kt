package com.example.blank.ui.manualfoodsearch

import com.example.blank.models.Result

sealed class ManualFoodSearchViewState

object Loading : ManualFoodSearchViewState()

data class ManualFoodSearchReady(val data: String = "") : ManualFoodSearchViewState()

object NetworkLoading : ManualFoodSearchViewState()

data class GetFood(val foodTitle: MutableList<Food>?) : ManualFoodSearchViewState()

data class NetworkError(val errorMessage: String?) : ManualFoodSearchViewState()
