package com.example.blank.ui.manualfoodsearch

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.ProgressBar
import androidx.recyclerview.widget.LinearLayoutManager
import co.zsmb.rainbowcake.base.RainbowCakeFragment
import co.zsmb.rainbowcake.dagger.getViewModelFromFactory
import co.zsmb.rainbowcake.extensions.exhaustive
import com.example.blank.R
import kotlinx.android.synthetic.main.fragment_manual_food_search.*
import kotlinx.android.synthetic.main.fragment_record_meal.*
import kotlinx.android.synthetic.main.my_activity_main.*
import com.example.blank.R.layout.my_activity_main

class ManualFoodSearchFragment :
    RainbowCakeFragment<ManualFoodSearchViewState, ManualFoodSearchViewModel>(), FoodAdapter.Listener  {

    override fun provideViewModel() = getViewModelFromFactory()
    override fun getViewResource() = R.layout.fragment_manual_food_search

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var foodList = mutableListOf(
            Food(1, "Apple", false),
            Food(2, "Banana", false),
            Food(3, "Pear", false),
            Food(4, "Valami", false),
            Food(5, "Kolbasz", false),
            Food(6, "Sonka", false),
            Food(7, "Sajt", false)
        )

        val foodAdapter = FoodAdapter()
        rvManualFoodSearch.adapter = foodAdapter
        rvManualFoodSearch.layoutManager = LinearLayoutManager(activity)
        foodAdapter.submitList(foodList)

        // TODO Setup views
    }

    override fun onStart() {
        super.onStart()

        viewModel.load()
    }

    override fun render(viewState: ManualFoodSearchViewState) {
        // TODO Render state
        when (viewState) {
            is Loading -> {
                activity?.bottomNavigationView?.visibility = View.INVISIBLE
                activity?.topNavigationView?.visibility = View.VISIBLE
            }
            is ManualFoodSearchReady -> {

//                navigator?.add(BottomNavFragment())
//                bottomNavigationView.visibility = View.VISIBLE
            }
        }.exhaustive
    }

    override fun onFoodClicked(food: Food) {

    }

}
