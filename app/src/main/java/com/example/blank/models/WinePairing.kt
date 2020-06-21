package com.example.blank.models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class WinePairing(
    @PrimaryKey
    val id: Long,
    val pairedWines: List<Any>,
    val pairingText: String,
    val productMatches: List<Any>
)