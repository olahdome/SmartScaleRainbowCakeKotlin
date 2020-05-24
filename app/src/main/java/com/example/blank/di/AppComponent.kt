package com.example.blank.di

import co.zsmb.rainbowcake.dagger.RainbowCakeComponent
import co.zsmb.rainbowcake.dagger.RainbowCakeModule
import com.example.blank.BlankApplication
import com.example.blank.MainActivity
import dagger.Component
import javax.inject.Singleton


@Singleton
@Component(
    modules = [
        RainbowCakeModule::class,
        ApplicationModule::class,
        ViewModelModule::class
    ]
)
interface AppComponent : RainbowCakeComponent
