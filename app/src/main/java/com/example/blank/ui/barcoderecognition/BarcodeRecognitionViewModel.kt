package com.example.blank.ui.barcoderecognition

import co.zsmb.rainbowcake.base.JobViewModel
import javax.inject.Inject

class BarcodeRecognitionViewModel @Inject constructor(
    private val barcodeRecognitionPresenter: BarcodeRecognitionPresenter
) : JobViewModel<BarcodeRecognitionViewState>(Loading) {

    fun load() = execute {
        viewState = BarcodeRecognitionReady(barcodeRecognitionPresenter.getData())
    }

}
