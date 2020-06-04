package com.example.blank.di

import androidx.lifecycle.ViewModel
import co.zsmb.rainbowcake.dagger.ViewModelKey
import com.example.blank.ui.blank.BlankViewModel
import com.example.blank.ui.history.HistoryViewModel
import com.example.blank.ui.manualfoodsearch.ManualFoodSearchViewModel
import com.example.blank.ui.recipes.RecipesViewModel
import com.example.blank.ui.recordmeal.RecordMealViewModel
import com.example.blank.ui.settings.SettingsViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Suppress("unused")
@Module
abstract class ViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(BlankViewModel::class)
    abstract fun bindBlankViewModel(blankViewModel: BlankViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(RecordMealViewModel::class)
    abstract fun bindRecordMealViewModel(recordMealViewModel: RecordMealViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(RecipesViewModel::class)
    abstract fun bindRecipesViewModel(recipesViewModel: RecipesViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(HistoryViewModel::class)
    abstract fun bindHistoryViewModel(historyViewModel: HistoryViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(SettingsViewModel::class)
    abstract fun bindSettingsViewModel(settingsViewModel: SettingsViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(ManualFoodSearchViewModel::class)
    abstract fun bindManualFoodSearchViewModel(manualFoodSearchViewModel: ManualFoodSearchViewModel): ViewModel

}
