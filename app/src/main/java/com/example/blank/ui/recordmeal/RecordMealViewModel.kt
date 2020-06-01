package com.example.blank.ui.recordmeal

import co.zsmb.rainbowcake.base.JobViewModel
import java.util.*
import javax.inject.Inject

class RecordMealViewModel @Inject constructor(
    private val recordMealPresenter: RecordMealPresenter
) : JobViewModel<RecordMealViewState>(Loading) {

    fun load() = execute {
        viewState = RecordMealReady(recordMealPresenter.getData())
    }

    fun showSelectedDate(date: Calendar) = execute {
        val formattedDate = formatDate(date)
        viewState = DateSelected(date = formattedDate)
    }

    private fun formatDate(date: Calendar): String {
        val day = if ((date.get(Calendar.DAY_OF_MONTH)) < 10) "0" + date.get(Calendar.DAY_OF_MONTH).toString()
            else date.get(Calendar.DAY_OF_MONTH).toString()
        val month = if ((date.get(Calendar.MONTH)) < 10) "0" + date.get(Calendar.MONTH).toString()
            else date.get(Calendar.MONTH).toString()
        val year = date.get(Calendar.YEAR).toString()
        return "%s.%s.%s".format(day, month, year)
    }

}
