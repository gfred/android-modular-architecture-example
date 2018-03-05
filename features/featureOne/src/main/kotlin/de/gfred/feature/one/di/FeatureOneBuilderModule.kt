package de.gfred.feature.one.di

import dagger.Module
import dagger.android.ContributesAndroidInjector
import de.gfred.core.interactors.di.GetValueInteractorModule
import de.gfred.core.interactors.di.UpdateValueInteractorModule
import de.gfred.feature.one.FeatureOneActivity

@Module
abstract class FeatureOneBuilderModule {
    @ContributesAndroidInjector(modules = [FeatureOneActivityModule::class, GetValueInteractorModule::class, UpdateValueInteractorModule::class])
    abstract fun contributeMainActivity(): FeatureOneActivity
}
