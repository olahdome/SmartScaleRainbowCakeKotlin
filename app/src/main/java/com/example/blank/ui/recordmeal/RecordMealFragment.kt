package com.example.blank.ui.recordmeal

import android.app.DatePickerDialog
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.DatePicker
import android.widget.ProgressBar
import co.zsmb.rainbowcake.base.RainbowCakeFragment
import co.zsmb.rainbowcake.dagger.getViewModelFromFactory
import co.zsmb.rainbowcake.extensions.exhaustive
import co.zsmb.rainbowcake.navigation.navigator
import com.example.blank.DatePickerFragment
import com.example.blank.R
import com.example.blank.ui.CustomDatePickListener
import kotlinx.android.synthetic.main.fragment_record_meal.*

class RecordMealFragment : RainbowCakeFragment<RecordMealViewState, RecordMealViewModel>(), CustomDatePickListener {

    override fun provideViewModel() = getViewModelFromFactory()
    override fun getViewResource() = R.layout.fragment_record_meal

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupButtons()
        // TODO Setup views
    }

    private fun setupButtons() {
        datePickerButton.setOnClickListener {
            showDatePickerDialog()
        }
    }

    override fun onStart() {
        super.onStart()

        viewModel.load()
    }

    override fun render(viewState: RecordMealViewState) {
        // TODO Render state
        when (viewState) {
            is Loading -> {
                progressBar.visibility = ProgressBar.VISIBLE
                datePickerButton.visibility = View.INVISIBLE
                addMealButton.visibility = View.INVISIBLE
            }
            is RecordMealReady -> {
                progressBar.visibility = ProgressBar.INVISIBLE
                datePickerButton.visibility = View.VISIBLE
                addMealButton.visibility = View.VISIBLE
            }
            is DateSelected -> {
//                datePickerButton.setText(viewState.date)
                recordTV.text = viewState.date
                // TODO show nutritional data of selected date
            }
        }.exhaustive
    }

    private fun showDatePickerDialog() {
        val newFragment = DatePickerFragment()
        newFragment.setCustomListener(this)
        newFragment.show(fragmentManager!!, "datePicker")
    }

    override fun onDateSelected(date: String) {
        viewModel.showSelectedDate(date)
    }

}
