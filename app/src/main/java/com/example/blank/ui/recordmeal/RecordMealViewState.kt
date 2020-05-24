package com.example.blank.ui.recordmeal

import java.util.*

sealed class RecordMealViewState

object Loading : RecordMealViewState()

data class RecordMealReady(val data: String = "") : RecordMealViewState()

data class DateSelected(
    val date: String
) : RecordMealViewState()
