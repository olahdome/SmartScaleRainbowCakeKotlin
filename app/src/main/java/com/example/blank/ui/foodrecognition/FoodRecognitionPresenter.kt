package com.example.blank.ui.foodrecognition

import co.zsmb.rainbowcake.withIOContext
import javax.inject.Inject

class FoodRecognitionPresenter @Inject constructor() {

    suspend fun getData(): String = withIOContext {
        ""
    }

}
