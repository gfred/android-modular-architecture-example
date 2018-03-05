package de.gfred.feature.two.di

import dagger.Module
import dagger.android.ContributesAndroidInjector
import de.gfred.core.interactors.di.GetValueInteractorModule
import de.gfred.feature.two.FeatureTwoActivity

@Module
abstract class FeatureTwoActivityBuilderModule {
    @ContributesAndroidInjector(modules = [FeatureTwoActivityModule::class, GetValueInteractorModule::class])
    abstract fun contributeFeatureTwoActivity(): FeatureTwoActivity
}
