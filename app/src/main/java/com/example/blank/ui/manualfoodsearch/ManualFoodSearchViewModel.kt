package com.example.blank.ui.manualfoodsearch

import co.zsmb.rainbowcake.base.JobViewModel
import javax.inject.Inject

class ManualFoodSearchViewModel @Inject constructor(
    private val manualFoodSearchPresenter: ManualFoodSearchPresenter
) : JobViewModel<ManualFoodSearchViewState>(Loading) {

    fun load() = execute {
        viewState = ManualFoodSearchReady(manualFoodSearchPresenter.getData())
    }

}
