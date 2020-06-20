package com.example.blank.models

import com.example.blank.models.Step

data class AnalyzedInstruction(
    val name: String,
    val steps: List<Step>
)