package com.example.blank.ui.settings

sealed class SettingsViewState

object Loading : SettingsViewState()

data class SettingsReady(val data: String = "") : SettingsViewState()
