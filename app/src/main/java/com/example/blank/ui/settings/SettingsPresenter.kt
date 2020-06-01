package com.example.blank.ui.settings

import co.zsmb.rainbowcake.withIOContext
import javax.inject.Inject

class SettingsPresenter @Inject constructor() {

    suspend fun getData(): String = withIOContext {
        ""
    }

}
