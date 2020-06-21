package com.example.blank.data.api

import com.example.blank.models.FoodResponse
import com.example.blank.util.Constants.Companion.API_KEY
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface FoodAPI {

    @GET("recipes/complexSearch")
    suspend fun getComplexFood(
        @Query("apiKey")
        apiKey: String = API_KEY,
        @Query("query")
        queryFoodName: String? = "",
        @Query("addRecipeNutrition")
        isAddNutrition: Boolean = true,
        @Query("number")
        resultNumber: Int = 20
    ): Response<FoodResponse>
}