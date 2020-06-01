package com.example.blank.ui.recipes

sealed class RecipesViewState

object Loading : RecipesViewState()

data class RecipesReady(val data: String = "") : RecipesViewState()
