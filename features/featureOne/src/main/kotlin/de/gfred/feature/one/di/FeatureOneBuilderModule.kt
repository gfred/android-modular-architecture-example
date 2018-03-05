package de.gfred.feature.one.di

import dagger.Module
import dagger.android.ContributesAndroidInjector
import de.gfred.core.services.di.StringServiceModule
import de.gfred.feature.one.FeatureOneActivity

@Module
abstract class FeatureOneBuilderModule {
    @ContributesAndroidInjector(modules = [FeatureOneActivityModule::class, StringServiceModule::class])
    abstract fun contributeMainActivity(): FeatureOneActivity
}
