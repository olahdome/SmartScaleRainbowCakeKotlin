package com.example.blank.ui.recordmeal

import co.zsmb.rainbowcake.withIOContext
import javax.inject.Inject

class RecordMealPresenter @Inject constructor() {

    suspend fun getData(): String = withIOContext {
        ""
    }

    suspend fun getSelectedDate(): String = withIOContext {
        ""
    }

}
