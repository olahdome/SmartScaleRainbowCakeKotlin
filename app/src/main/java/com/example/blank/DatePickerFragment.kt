package com.example.blank

import android.app.DatePickerDialog
import android.app.Dialog
import android.os.Bundle
import android.widget.DatePicker
import androidx.fragment.app.DialogFragment
import com.example.blank.ui.CustomDatePickListener
import com.example.blank.ui.recordmeal.RecordMealFragment
import java.util.*

class DatePickerFragment() : DialogFragment(), DatePickerDialog.OnDateSetListener {

    var listener: CustomDatePickListener? = null

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val c = Calendar.getInstance()
        val year = c.get(Calendar.YEAR)
        val month = c.get(Calendar.MONTH)
        val day = c.get(Calendar.DAY_OF_MONTH)

        return DatePickerDialog(activity!!, this, year, month, day)
    }

    fun setCustomListener(customDatePickListener: CustomDatePickListener) {
        this.listener = customDatePickListener
    }

    override fun onDateSet(view: DatePicker?, year: Int, month: Int, dayOfMonth: Int) {
//        val date = year.toString() + month.toString() + dayOfMonth.toString()
        val date = Calendar.getInstance()
        date.set(year, month + 1, dayOfMonth)
        this.listener?.onDateSelected(date)
    }

}