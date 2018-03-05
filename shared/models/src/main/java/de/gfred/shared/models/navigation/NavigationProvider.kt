package de.gfred.shared.models.navigation

import de.gfred.shared.models.navigation.features.FeatureOneNavigator


interface NavigationProvider {
    fun provideFeatureOneNavigator(): FeatureOneNavigator
}

