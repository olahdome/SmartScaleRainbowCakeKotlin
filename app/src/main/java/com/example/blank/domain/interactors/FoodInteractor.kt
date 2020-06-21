package com.example.blank.domain.interactors

import com.example.blank.data.network.FoodNetworkDataSource
import com.example.blank.models.FoodResponse
import com.example.blank.util.Resource
import retrofit2.Response
import javax.inject.Inject

class FoodInteractor @Inject constructor(
    val foodNetworkDataSource: FoodNetworkDataSource
) {
    suspend fun getComplexFood(foodName: String?): Resource<FoodResponse> {
        val networkFoodResponse = foodNetworkDataSource.getComplexFood(foodName)
        return handleFoodResponse(networkFoodResponse)
    }

    private fun handleFoodResponse(response: Response<FoodResponse>) : Resource<FoodResponse> {
        if (response.isSuccessful) {
            response.body()?.let { resultResponse ->
                return Resource.Success(resultResponse)
            }
        }
        return Resource.Error(response.message())
    }
}