package com.example.blank.ui.recipes

import co.zsmb.rainbowcake.base.JobViewModel
import javax.inject.Inject

class RecipesViewModel @Inject constructor(
    private val recipesPresenter: RecipesPresenter
) : JobViewModel<RecipesViewState>(Loading) {

    fun load() = execute {
        viewState = RecipesReady(recipesPresenter.getData())
    }

}
