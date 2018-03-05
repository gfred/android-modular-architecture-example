package de.gfred.feature.two.di

import dagger.Module
import dagger.Provides
import de.gfred.feature.two.FeatureTwoPresenter
import de.gfred.feature.two.FeatureTwoPresenterImpl
import javax.inject.Singleton

@Singleton
@Module
class FeatureTwoActivityModule {
    @Provides
    fun providesFeatureTwoPresenter(featureTwoPresenterImpl: FeatureTwoPresenterImpl): FeatureTwoPresenter = featureTwoPresenterImpl
}
