package com.example.blank.ui.recordmeal

import co.zsmb.rainbowcake.base.JobViewModel
import javax.inject.Inject

class RecordMealViewModel @Inject constructor(
    private val recordMealPresenter: RecordMealPresenter
) : JobViewModel<RecordMealViewState>(Loading) {

    fun load() = execute {
        viewState = RecordMealReady(recordMealPresenter.getData())
    }

}
