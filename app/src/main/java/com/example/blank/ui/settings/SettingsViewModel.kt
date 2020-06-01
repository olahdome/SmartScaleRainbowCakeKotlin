package com.example.blank.ui.settings

import co.zsmb.rainbowcake.base.JobViewModel
import javax.inject.Inject

class SettingsViewModel @Inject constructor(
    private val settingsPresenter: SettingsPresenter
) : JobViewModel<SettingsViewState>(Loading) {

    fun load() = execute {
        viewState = SettingsReady(settingsPresenter.getData())
    }

}
