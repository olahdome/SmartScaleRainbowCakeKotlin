package com.example.blank.ui.recordmeal

sealed class RecordMealViewState

object Loading : RecordMealViewState()

data class RecordMealReady(val data: String = "") : RecordMealViewState()
