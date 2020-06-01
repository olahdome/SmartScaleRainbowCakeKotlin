package com.example.blank.ui.recipes

import co.zsmb.rainbowcake.withIOContext
import javax.inject.Inject

class RecipesPresenter @Inject constructor() {

    suspend fun getData(): String = withIOContext {
        ""
    }

}
