package de.gfred.app.di

import android.content.Context
import de.gfred.shared.navigation.NavigationProvider
import de.gfred.shared.tracking.di.TrackingServiceModule
import dagger.Module
import dagger.Provides
import de.gfred.app.MainApplication
import de.gfred.navigator.NavigationProviderImpl

@Module(includes = [TrackingServiceModule::class])
class AppModule {
    @Provides
    fun providesApplicationContext(application: MainApplication): Context = application

    @Provides
    fun provideNavigationProvider(navigationProvider: NavigationProviderImpl): NavigationProvider = navigationProvider
}