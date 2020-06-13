package com.example.blank.ui.foodrecognition

import co.zsmb.rainbowcake.base.JobViewModel
import javax.inject.Inject

class FoodRecognitionViewModel @Inject constructor(
    private val foodRecognitionPresenter: FoodRecognitionPresenter
) : JobViewModel<FoodRecognitionViewState>(Loading) {

    fun load() = execute {
        viewState = FoodRecognitionReady(foodRecognitionPresenter.getData())
    }

}
