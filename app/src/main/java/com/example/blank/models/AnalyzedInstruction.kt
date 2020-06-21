package com.example.blank.models

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.blank.models.Step

@Entity
data class AnalyzedInstruction(
    @PrimaryKey
    val id: Long,
    val name: String,
    val steps: List<Step>
)