package com.example.blank.ui.myfoodsearch

import co.zsmb.rainbowcake.base.JobViewModel
import javax.inject.Inject

class MyFoodSearchViewModel @Inject constructor(
    private val myFoodSearchPresenter: MyFoodSearchPresenter
) : JobViewModel<MyFoodSearchViewState>(Loading) {

    fun load() = execute {
        viewState = MyFoodSearchReady(myFoodSearchPresenter.getData())
    }

}
