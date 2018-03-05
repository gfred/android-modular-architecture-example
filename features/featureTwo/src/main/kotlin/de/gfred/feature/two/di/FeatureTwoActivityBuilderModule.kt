package de.gfred.feature.two.di

import dagger.Module
import dagger.android.ContributesAndroidInjector
import de.gfred.core.services.di.UserServiceModule
import de.gfred.feature.two.FeatureTwoActivity

@Module
abstract class FeatureTwoActivityBuilderModule {
    @ContributesAndroidInjector(modules = [FeatureTwoActivityModule::class, UserServiceModule::class])
    abstract fun contributeFeatureTwoActivity(): FeatureTwoActivity
}
