package com.example.blank.ui.manualfoodsearch

import co.zsmb.rainbowcake.withIOContext
import javax.inject.Inject

class ManualFoodSearchPresenter @Inject constructor() {

    suspend fun getData(): String = withIOContext {
        ""
    }

}
