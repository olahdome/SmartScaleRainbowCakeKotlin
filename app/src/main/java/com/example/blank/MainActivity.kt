package com.example.blank

import android.os.Bundle
import co.zsmb.rainbowcake.navigation.SimpleNavActivity
import com.example.blank.ui.barcoderecognition.BarcodeRecognitionFragment
import com.example.blank.ui.blank.BlankFragment
import com.example.blank.ui.foodrecognition.FoodRecognitionFragment
import com.example.blank.ui.history.HistoryFragment
import com.example.blank.ui.manualfoodsearch.ManualFoodSearchFragment
import com.example.blank.ui.myfoodsearch.MyFoodSearchFragment
import com.example.blank.ui.recipes.RecipesFragment
import com.example.blank.ui.recordmeal.RecordMealFragment
import com.example.blank.ui.settings.SettingsFragment
import kotlinx.android.synthetic.main.fragment_record_meal.*
import kotlinx.android.synthetic.main.my_activity_main.*

class MainActivity : SimpleNavActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.my_activity_main)

        if (savedInstanceState == null) {
            navigator.add(RecordMealFragment())
        }

        bottomNavigationView?.setOnNavigationItemSelectedListener {
            when(it.itemId) {
                R.id.menuHome -> navigator.add(RecordMealFragment())
                R.id.menuRecipe -> navigator.add(RecipesFragment())
                R.id.menuHistory -> navigator.add(HistoryFragment())
                R.id.menuSettings -> navigator.add(SettingsFragment())
            }
            true
        }

        topNavigationView?.setOnNavigationItemSelectedListener {
            when(it.itemId) {
                R.id.menuManualSearch -> navigator.add(ManualFoodSearchFragment())
                R.id.menuFoodRecognition -> navigator.add(FoodRecognitionFragment())
                R.id.menuBarcodeRecognition -> navigator.add(BarcodeRecognitionFragment())
                R.id.menuMyFoodSearch -> navigator.add(MyFoodSearchFragment())
            }
            true
        }
    }
}
