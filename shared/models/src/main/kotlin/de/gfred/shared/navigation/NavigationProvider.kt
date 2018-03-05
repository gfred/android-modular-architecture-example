package de.gfred.shared.navigation

import de.gfred.shared.navigation.features.FeatureOneNavigator


interface NavigationProvider {
    fun provideFeatureOneNavigator(): FeatureOneNavigator
}

