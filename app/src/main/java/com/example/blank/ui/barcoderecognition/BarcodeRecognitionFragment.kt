package com.example.blank.ui.barcoderecognition

import android.os.Bundle
import android.view.View
import co.zsmb.rainbowcake.base.RainbowCakeFragment
import co.zsmb.rainbowcake.dagger.getViewModelFromFactory
import com.example.blank.R

class BarcodeRecognitionFragment :
    RainbowCakeFragment<BarcodeRecognitionViewState, BarcodeRecognitionViewModel>() {

    override fun provideViewModel() = getViewModelFromFactory()
    override fun getViewResource() = R.layout.fragment_barcode_recognition

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // TODO Setup views
    }

    override fun onStart() {
        super.onStart()

        viewModel.load()
    }

    override fun render(viewState: BarcodeRecognitionViewState) {
        // TODO Render state
    }

}
