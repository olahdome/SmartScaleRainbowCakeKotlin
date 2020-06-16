package com.example.blank.api

data class AnalyzedInstruction(
    val name: String,
    val steps: List<Step>
)