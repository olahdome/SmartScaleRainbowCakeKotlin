package com.example.blank.ui.myfoodsearch

import co.zsmb.rainbowcake.withIOContext
import javax.inject.Inject

class MyFoodSearchPresenter @Inject constructor() {

    suspend fun getData(): String = withIOContext {
        ""
    }

}
