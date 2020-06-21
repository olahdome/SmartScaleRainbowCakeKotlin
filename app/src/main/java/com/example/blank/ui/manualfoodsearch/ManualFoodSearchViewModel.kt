package com.example.blank.ui.manualfoodsearch

import co.zsmb.rainbowcake.base.JobViewModel
import co.zsmb.rainbowcake.base.RainbowCakeViewModel
import javax.inject.Inject

class ManualFoodSearchViewModel @Inject constructor(
    private val manualFoodSearchPresenter: ManualFoodSearchPresenter
) : RainbowCakeViewModel<ManualFoodSearchViewState>(Loading) {

    fun load() = execute {
        viewState = ManualFoodSearchReady()
    }

    fun getFood(foodName: String?) = execute {
        val titleList: MutableList<Food>? = null
        var i: Int = 0
        viewState = NetworkLoading
        val resultFood = manualFoodSearchPresenter.getFood(foodName)
        if (!resultFood.isError) {
            for (result in resultFood.body!!.results) {
                titleList?.add(Food(
                    id = i,
                    foodName = result.title,
                    isChecked = false
                ))
                i++
            }
            viewState = GetFood(titleList)
        }
        else {
            viewState = NetworkError(resultFood.errorMessage)
        }
    }

}
