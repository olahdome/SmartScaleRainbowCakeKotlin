package com.example.blank.ui.myfoodsearch

sealed class MyFoodSearchViewState

object Loading : MyFoodSearchViewState()

data class MyFoodSearchReady(val data: String = "") : MyFoodSearchViewState()
