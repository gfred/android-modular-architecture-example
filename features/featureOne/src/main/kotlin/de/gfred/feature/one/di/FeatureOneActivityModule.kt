package de.gfred.feature.one.di

import dagger.Module
import dagger.Provides
import de.gfred.feature.one.FeatureOnePresenter
import de.gfred.feature.one.FeatureOnePresenterImpl
import de.gfred.shared.navigation.NavigationProvider
import de.gfred.shared.navigation.features.FeatureOneNavigator
import javax.inject.Singleton

@Singleton
@Module
class FeatureOneActivityModule {
    @Provides
    fun provideFeatureOneNavigator(navigationProvider: NavigationProvider): FeatureOneNavigator = navigationProvider.provideFeatureOneNavigator()

    @Provides
    fun provideFeatureOnePresenterImpl(presenterImpl: FeatureOnePresenterImpl): FeatureOnePresenter = presenterImpl
}