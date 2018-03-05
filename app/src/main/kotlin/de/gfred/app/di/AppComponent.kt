package de.gfred.app.di

import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import de.gfred.app.MainApplication
import de.gfred.feature.one.di.FeatureOneActivityBuilderModule
import de.gfred.feature.two.di.FeatureTwoActivityBuilderModule
import javax.inject.Singleton

@Singleton
@Component(modules = [AndroidInjectionModule::class, AppModule::class, FeatureOneActivityBuilderModule::class, FeatureTwoActivityBuilderModule::class])
interface AppComponent : AndroidInjector<MainApplication> {

    @Component.Builder
    abstract class Builder : AndroidInjector.Builder<MainApplication>()
}
