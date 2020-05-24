package com.example.blank.ui.recordmeal

import android.app.DatePickerDialog
import android.widget.DatePicker
import co.zsmb.rainbowcake.withIOContext
import javax.inject.Inject

class RecordMealPresenter @Inject constructor() {

    suspend fun getData(): String = withIOContext {
        ""
    }

    suspend fun getSelectedDate(): String = withIOContext {
//        val date = recordMealInteractor.getSelectedDate()
//        return Date(
//            date = date
//        )
        ""
    }

//    class Date(date: String)

}
