package com.example.blank.ui.recordmeal

import android.os.Bundle
import android.view.View
import android.widget.ProgressBar
import androidx.constraintlayout.widget.ConstraintSet
import co.zsmb.rainbowcake.base.RainbowCakeFragment
import co.zsmb.rainbowcake.dagger.getViewModelFromFactory
import co.zsmb.rainbowcake.extensions.exhaustive
import co.zsmb.rainbowcake.navigation.navigator
import com.example.blank.DatePickerFragment
import com.example.blank.R
import com.example.blank.ui.CustomDatePickListener
import com.example.blank.ui.manualfoodsearch.ManualFoodSearchFragment
import kotlinx.android.synthetic.main.fragment_record_meal.*
import kotlinx.android.synthetic.main.my_activity_main.*
import java.util.*

class RecordMealFragment : RainbowCakeFragment<RecordMealViewState, RecordMealViewModel>(), CustomDatePickListener {

    override fun provideViewModel() = getViewModelFromFactory()
    override fun getViewResource() = R.layout.fragment_record_meal

    private val currentDate = Calendar.getInstance()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupViews()
        // TODO Setup views
    }

    private fun setupViews() {
        datePickerButton.setOnClickListener {
            showDatePickerDialog()
        }
        addMealButton.setOnClickListener {
            navigator?.add(ManualFoodSearchFragment())
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
                val constraintSet = ConstraintSet()
                constraintSet.clone(activity?.activity_constraint_layout)
                constraintSet.connect(activity?.contentFrame!!.id, ConstraintSet.TOP,
                    ConstraintSet.PARENT_ID, ConstraintSet.TOP)
                constraintSet.connect(activity?.contentFrame!!.id, ConstraintSet.BOTTOM,
                    activity?.bottomNavigationView!!.id, ConstraintSet.TOP)
                constraintSet.applyTo(activity?.activity_constraint_layout)
                activity?.bottomNavigationView?.visibility = View.VISIBLE
                activity?.topNavigationView?.visibility = View.INVISIBLE
                progressBar.visibility = ProgressBar.VISIBLE
                datePickerButton.visibility = View.INVISIBLE
                addMealButton.visibility = View.INVISIBLE
            }
            is RecordMealReady -> {
                progressBar.visibility = ProgressBar.INVISIBLE
                datePickerButton.visibility = View.VISIBLE
                addMealButton.visibility = View.VISIBLE
                viewModel.showSelectedDate(currentDate)
            }
            is DateSelected -> {
                datePickerButton.text = viewState.date
                // TODO show nutritional data of selected date
            }
        }.exhaustive
    }

    private fun showDatePickerDialog() {
        val datePickerFragment = DatePickerFragment()
        datePickerFragment.setCustomListener(this)
        datePickerFragment.show(fragmentManager!!, "datePicker")
    }

    override fun onDateSelected(date: Calendar) {
        viewModel.showSelectedDate(date)
    }

}
