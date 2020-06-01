package com.example.blank.ui.history

sealed class HistoryViewState

object Loading : HistoryViewState()

data class HistoryReady(val data: String = "") : HistoryViewState()
