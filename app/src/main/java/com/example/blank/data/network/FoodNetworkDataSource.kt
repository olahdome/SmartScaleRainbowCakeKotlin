package com.example.blank.data.network

import com.example.blank.data.api.FoodAPI
import com.example.blank.data.api.RetrofitInstance
import javax.inject.Inject

class FoodNetworkDataSource @Inject constructor(
) {
    suspend fun getComplexFood(foodName: String?) =
        RetrofitInstance.api.getComplexFood( queryFoodName = foodName)
}