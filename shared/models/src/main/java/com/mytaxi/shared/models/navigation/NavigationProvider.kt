package com.mytaxi.shared.models.navigation

import com.mytaxi.shared.models.navigation.features.FeatureOneNavigator


interface NavigationProvider {
    fun provideFeatureOneNavigator(): FeatureOneNavigator
}

