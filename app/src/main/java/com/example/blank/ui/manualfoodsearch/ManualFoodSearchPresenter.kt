package com.example.blank.ui.manualfoodsearch

import co.zsmb.rainbowcake.extensions.exhaustive
import co.zsmb.rainbowcake.withIOContext
import com.example.blank.domain.interactors.FoodInteractor
import com.example.blank.models.FoodResponse
import com.example.blank.util.Resource
import javax.inject.Inject

data class FoodPresentationModel(
    val body: FoodResponse? = null,
    val errorMessage: String? = "",
    val isError: Boolean = false
)

class ManualFoodSearchPresenter @Inject constructor(
    private val foodInteractor: FoodInteractor
) {

    suspend fun getFood(foodName: String?): FoodPresentationModel = withIOContext {
        when(val foodInteractorResponse = foodInteractor.getComplexFood(foodName)) {
            is Resource.Success -> FoodPresentationModel(
                body = foodInteractorResponse.data
            )
            is Resource.Error -> FoodPresentationModel(
                errorMessage = foodInteractorResponse.message,
                isError = true
            ).exhaustive
        }
    }
}
