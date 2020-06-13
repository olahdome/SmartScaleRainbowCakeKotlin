package com.example.blank.ui.barcoderecognition

sealed class BarcodeRecognitionViewState

object Loading : BarcodeRecognitionViewState()

data class BarcodeRecognitionReady(val data: String = "") : BarcodeRecognitionViewState()
