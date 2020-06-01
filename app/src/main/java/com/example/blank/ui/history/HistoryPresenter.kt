package com.example.blank.ui.history

import co.zsmb.rainbowcake.withIOContext
import javax.inject.Inject

class HistoryPresenter @Inject constructor() {

    suspend fun getData(): String = withIOContext {
        ""
    }

}
