package de.gfred.feature.two.di

import dagger.Module
import dagger.Provides
import de.gfred.feature.two.FeatureTwoPresenter
import de.gfred.feature.two.FeatureTwoPresenterImpl
import de.gfred.shared.services.StringService

@Module
class FeatureTwoActivityModule {
    @Provides
    fun providesFeatureTwoPresenter(stringService: StringService): FeatureTwoPresenter = FeatureTwoPresenterImpl(stringService)
}
