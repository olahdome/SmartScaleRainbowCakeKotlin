package com.example.blank.ui.recordmeal

import android.util.Log
import co.zsmb.rainbowcake.base.JobViewModel
import javax.inject.Inject

class RecordMealViewModel @Inject constructor(
    private val recordMealPresenter: RecordMealPresenter
) : JobViewModel<RecordMealViewState>(Loading) {

    fun load() = execute {
        viewState = RecordMealReady(recordMealPresenter.getData())
    }

    fun showSelectedDate(date: String) = execute {
//        val date = recordMealPresenter.getSelectedDate()
//        viewState = DateSelected(date = date)
        Log.d("valami", "valami")
        viewState = DateSelected(date = date)
    }

}
