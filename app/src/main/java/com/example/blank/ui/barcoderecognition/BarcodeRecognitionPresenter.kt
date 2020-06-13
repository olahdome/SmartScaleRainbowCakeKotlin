package com.example.blank.ui.barcoderecognition

import co.zsmb.rainbowcake.withIOContext
import javax.inject.Inject

class BarcodeRecognitionPresenter @Inject constructor() {

    suspend fun getData(): String = withIOContext {
        ""
    }

}
