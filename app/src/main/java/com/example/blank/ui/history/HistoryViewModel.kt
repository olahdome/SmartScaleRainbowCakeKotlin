package com.example.blank.ui.history

import co.zsmb.rainbowcake.base.JobViewModel
import javax.inject.Inject

class HistoryViewModel @Inject constructor(
    private val historyPresenter: HistoryPresenter
) : JobViewModel<HistoryViewState>(Loading) {

    fun load() = execute {
        viewState = HistoryReady(historyPresenter.getData())
    }

}
